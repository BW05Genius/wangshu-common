package com.wangshu.common.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;


/**
 * 
 * @author zhuzg
 *
 */
public class FileUtil {
	
	public static Logger log = Logger.getLogger(FileUtil.class); 
	
	/**
	 * 濡傛灉鏄洰褰曪紝鍒欎笅闈㈢殑鏂囦欢鍜屾墍鏈夊瓙鐩綍涓殑鏂囦欢閮借鍒犻櫎
	     浣跨敤閫掑綊銆傛秹鍙婂唴瀹广�傚垽鏂洰褰曠殑瀛樺湪鎬э紝鍒ゆ柇鏄惁涓虹洰褰曟垨鏂囦欢锛屽垹闄ゃ��

	 * @param fileName
	 */
	public static void delFilePath(String fileName) {
		
		File file = new File(fileName);
		// 鏂囦欢涓嶅瓨鍦�  鍒欑洿鎺ヨ繑鍥�
		if(!file.exists()) {
			return;
		}
		
		// 濡傛灉鏄枃浠�  鍒欏垹闄ゅ悗杩斿洖
		if(file.isFile()) {
			log.info(" 鍒犻櫎鏂囦欢 " + fileName);
			file.delete();
			return;
		}
		
		//濡傛灉鏄洰褰�
		if(file.isDirectory()) {
			// 鍒欏垪鍑虹洰褰曚笅鎵�鏈夌殑瀛愮洰褰曞拰鏂囦欢
			 String[] list = file.list();
			 //閽堝姣忎竴椤�
			 for (String subPath : list) {
				 //璋冪敤鍒犻櫎鍔熻兘
				 delFilePath(fileName + "/" + subPath);
			}
			 log.info(" ------------ 鍒犻櫎鏂囦欢 澶� 锛� " + fileName); 
			file.delete(); 
		}
		
		
	}
	
	//3.5.2鑾峰彇鏂囦欢鎵╁睍鍚�
	/**
	 * 
	 * @param fileName
	 * @return
	 */
	public static String getSuffix(String fileName) {
		int dotIndex = fileName.lastIndexOf('.');
		//娌℃湁鎵╁睍鍚�
		if(dotIndex<0) {
			return "";
		}
		//鏈�鍚庝竴浣嶆槸 .
		if(dotIndex>=fileName.length()) {
			return "";
		}
		//
		return fileName.substring(dotIndex+1);
	}
	
	/**
	 * 
	 * @param key
	 * @return
	 */
	public static String getSystemProp(String key) {
		
		String propValue = System.getProperty(key);
		return propValue;
		
	}
	
	/**
	 * 杩斿洖鏂囦欢浠ユ寚瀹氬崟浣嶅ぇ灏忚〃绀�
	 */
	public long  getSize(String fileName,FileUnit fileUnit) {
		File file = new File(fileName);
		
		
		long  size = file.length();
		switch (fileUnit) {
			case B:
				return size;
			case KB:
				return size/1024;
			case MB:
				return size/1024/1024;
			case GB:
				return size/1024/1024/1024;
			case TB:
				return size/1024/1024/1024/1024;
			case PB:
				return size/1024/1024/1024/1024/1024;
			default:
				return 0;
		}
		
	}
	
	/**
	 * 浣跨敤宸ュ叿鍖呭伐绋嬩腑鐨勬祦宸ュ叿绫昏鍙栬鏂囨湰鏂囦欢锛屼笖涓嶅緱涔辩爜銆傚鏋滆緭鍏ユ祦浣跨敤浜咶ileInputStream
	 */
	public static List fileToBean(String fileName, Constructor constructor)
			throws IOException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {

		File file = new File(fileName);
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		String lineString = null;
		List list = new ArrayList();
		while ((lineString = bufferedReader.readLine()) != null) {
			String[] split = lineString.split("\\|\\|");
			Object object = constructor.newInstance(split);
			list.add(object);
		}

		return list;

	}
	
	
	/*渚垮埄鏂囦欢澶�
*/	
	public static List<String> getFileList(String pathName){
		System.out.println(pathName);
		String[] list = new File(pathName).list();
		 List<String> fileList = new ArrayList<String>();
		for (String string : list) {
			File subFile = new File(pathName + "\\" + string);
			if(subFile!=null && subFile.exists() && subFile.isFile())
				fileList.add(pathName + "\\" + string);
		}
		return fileList;
		
	}
	
	/**
	 * 璇诲彇鏂囦欢鍐呭
	 * @throws IOException 
	 */
	public static String readFile(String fileName) throws IOException {

		StringBuilder sb = new StringBuilder();
		
		File file = new File(fileName);
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		String lineString = null;
		
		while ((lineString = bufferedReader.readLine()) != null) {
			sb.append(lineString).append("\n");
		}
		return sb.toString();
	}
	

	public static void fileToBean(String string, Class<String> class1,
			Class<String> class2, Class<String> class3, Class<String> class4,
			Class<String> class5) {
		// TODO Auto-generated method stub
		
	}

	
	
}
