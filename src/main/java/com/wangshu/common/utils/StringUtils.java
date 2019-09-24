package com.wangshu.common.utils;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author zhuzg
 *
 */
public class StringUtils {
	
	
	/**
	 *  
	 * @param str
	 * @return  
	 */
	public static  boolean isEmpty(String str) {
		
		return (null==str||"".equals(str.trim()));
	}
	
	
	/**
	 * 鏄惁鏈夊��
	鍒ゆ柇婧愬瓧绗︿覆鏄惁鏈夊�硷紝绌哄紩鍙峰拰绌烘牸涔熺畻娌″��
	 * @param str
	 * @return
	 */
	public static boolean hasText1(String str) {
		
		// 浠ヤ笅涓ょ鍐欐硶閮藉
		//return !(null ==str || "".equals(str.trim()));
		return (null !=str && !"".equals(str.trim()));
	}
	/**
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isPhone(String str) {
		String pattern = "^(136|135|137)\\d{8}$";
		return str.matches(pattern);
	}
	
	/**
	 *  
	 * @param str
	 * @return
	 */
	public static boolean isEmail(String str) {
		
		String pattern = "^\\w+@\\w+\\.[a-zA-Z]{2,3}$";
		Pattern compile = Pattern.compile(pattern);
		Matcher matcher = compile.matcher(str);
		return matcher.matches();
	}
	
	/**
	 * 楠岃瘉鍏ㄤ负瀛楁瘝
	 * @param str
	 * @return
	 */
	public static boolean isLetter(String str) {
		String pattern = "^[a-zA-Z]+$";
		return str.matches(pattern);
	}
	
	/**
	 * 
	 * 鑾峰彇n浣嶉殢鏈鸿嫳鏂囧瓧绗︿覆
	 * @param n
	 * @return
	 */
	public String randomLetterStr(int n) {
		
		if(n<=0)
			return "";
		Random random = new Random();
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n;i++) {
			char letter = (char)('A' + random.nextInt(26));
			sb.append(letter);
		}		
		return sb.toString();
	}
	
	/**
	 * 鑾峰彇n浣嶉殢鏈鸿嫳鏂囧拰鏁板瓧瀛楃涓�
	 * @param n
	 * @return
	 */
	public String randomStr(int n) {
		
		char chars[]= {'0','1','2','3','4','5','6','7','8','9',
				'A','B','C','D','E','F','G','H','I','J','K','L','M','N'};
		
		// 瀹氫箟涓殢鏈哄璞�
		Random random = new Random();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<n;i++) {
			// 闅忔満寰楀埌涓�涓笅鏍囷紝鏍规嵁涓嬫爣浠庢暟缁勫綋涓幏鍙栧�硷紝鎷兼帴鍒板瓧绗︿覆涓�
			
			// 闅忔満鑾峰彇涓�涓笅鏍�
			int index = random.nextInt(chars.length);
			char c = chars[index];
			sb.append(c);//鍚戝悗鎷兼帴
			
			/*sb.append( chars[random.nextInt(chars.length)]
					);*/
			
		}
		return sb.toString();
		
	}
	
	//鑾峰彇n涓殢鏈轰腑鏂囧瓧绗︿覆
	public static String getRandonCnStr(int n) {
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n;i++) {
			sb.append(getOneCn());
		}
		return sb.toString();
		
	} 
	
	/**
	 * 闅忔満鑾峰彇涓�涓腑鏂囧瓧绗�
	 * @return
	 */
	private static String getOneCn(){
		
		String str = "";
        int hightPos; //
        int lowPos;
        Random random = new Random();

        hightPos = (176 + Math.abs(random.nextInt(39)));
        lowPos = (161 + Math.abs(random.nextInt(93)));

        byte[] b = new byte[2];
        b[0] = (Integer.valueOf(hightPos)).byteValue();
        b[1] = (Integer.valueOf(lowPos)).byteValue();

        try {
            str = new String(b, "GBK");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("閿欒");
        }

        return str;
	}
	
	/*
	* 鏂规硶鍔熻兘锛氭牴鎹鍒欏湪瀛楃涓叉彁鍙栦竴娈靛�硷紝鐢ㄤ簬鍚庨潰鍦╱rl鍦板潃閲屾彁鍙朓D鍊笺��
	* 渚嬪鍦ㄢ�渉ttp://news.cnstock.com/news,yw-201908-4413224.htm鈥濇妸鈥�4413224鈥濇彁鍙栧嚭鏉ャ��
	*/
	public static String getPlaceholderValue(String src, String regex){
		//TODO 瀹炵幇浠ｇ爜
        Pattern pattern = Pattern.compile(regex);// 鍖归厤鐨勬ā寮�  
        Matcher m = pattern.matcher(src);  
        boolean find = m.find();
        if(find) {
        	String group = m.group(0);
        	 return group.substring(1,group.lastIndexOf('.'));
        }
        return "";
	}
	
	//娴嬭瘯宸ュ叿鍖呬腑isNumber()锛�
	/**
	 * 
	 * @param src
	 * @return
	 */
	public static boolean isNumber(String src) {
		//String regix="[0-9]{1,}(\\.?|[0-9]*)";
		String regix="[0-9]{1,}\\.?[0-9]*";
		return src.matches(regix);
		
		
	}
	
	/**
	 * 娴嬭瘯宸ュ叿鍖呬腑hasText()锛岃鏂规硶鏄繃婊tring鍙傛暟绌烘牸鍚庡垽鏂槸鍚︽湁鍊硷紝
	 * 濡傛灉浣犳湁璇ュ姛鑳芥柟娉曪紝浣嗕笉鏄繖涓柟娉曞悕涓嶆墸鍒嗐�傚鏋滄病鏈夎鏂规硶锛屽繀椤荤幇鍦ㄧ紪鍐欒鏂规硶
	 * @param src
	 * @return
	 */
	public static boolean hasText(String src) {
		String string = src.replaceAll("\\s", "");
		return (!"".equals(string));
	}
	/*鏂规硶鍔熻兘锛氬皢瀛楃涓茶浆鎹㈡垚html鏂囨湰锛屽鏋滈亣鍒扳�淺n鈥濇崲琛屾崲绗︼紝鍒欒灏嗚繖涓�娈垫枃鏈娇鐢�<p></p>鏍囩
	 * @ContextConfiguration("classpath:spring.xml")
	*@RunWith(SpringRunner.class)
	* 鍖呰捣鏉ャ�傚鏋滈亣鍒扳�淺n\r鈥濅袱涓湪涓�璧锋寜涓婇潰\n澶勭悊銆傚鏋滃彧閬囧埌涓�涓�淺r鈥濆垯鏇挎崲鎴�<br/>鏍囩銆�
	* 浣跨敤鍦烘櫙锛氱綉椤垫枃鏈浼犲埌鍚庡彴鐨勫瓧绗︿覆灏卞彲鑳藉氨浼氬洖杞︽崲琛屻��*/
	public static String toHtml1(String src){
		String[] strings = src.split("\\\n");
		StringBuilder sb = new StringBuilder();
		for (String string : strings) {
			sb.append("<p>").append(string).append("</p>");
		}
		return sb.toString();
	}
	/**
	 * 妫�娴嬪惈鏈塡n\r 杞崲鎴怽n
	 * \r 杞崲<br>
	 * @param str
	 * @return
	 */
	public static String toHtml(String str) {
		String replaceAll = str.replaceAll("\\\n\r", "\n");
		String replaceAll2 = replaceAll.replaceAll("\\\r", "<br/>");
		/* System.out.println(replaceAll2); */
		String[] split = replaceAll2.split("\\\n");
		StringBuilder sb = new StringBuilder();
		for (String string : split) {
			sb.append("<p>").append(string).append("</p>\n");
		}
		return sb.toString();	
	}
	
	
	
	
}
