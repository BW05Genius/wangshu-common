package Test;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.junit.Test;

import com.wangshu.common.utils.FileUtil;
import com.wangshu.common.utils.StringUtils;


/**
 * @author 鍒樺悏椋�
 *
 * 2019骞�9鏈�14鏃�
 */
public class TestUtils {

	/*
	 * String str="asd鐖变笂鐨勬垜鍘籠\\r澶х鍙慭n澶х澶汉涓簐er楗跨殑鎴慭n"; String html =
	 * StringUtils.toHtml(str); System.out.println(html);
	 
	@Test
	public void tohtml() {
		String str = "";
		String html = StringUtils.toHtml(str);
		System.out.println();
		System.out.println(html);
	}

	@Test
	public void testFileToBean() throws NoSuchMethodException,
			SecurityException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, IOException {
		String fileNameString = "";
		List list = FileUtil.fileToBean(fileNameString, RegisterInfo.class
				.getConstructor(String.class, String.class, String.class,
						String.class, String.class, String.class, String.class,
						String.class, String.class, String.class

				));

		System.out.println("list is " + list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println("list is " + list.get(i));
		}

	}
	
	@Test
	public void testDir(){
		String pathString = "";
		List<String> fileList = FileUtil.getFileList(pathString);
		for (String string : fileList) {
			System.out.println(" string  is "  + string);
		}
	}
	
	@Test
	public void testReadFile() throws IOException{
		String fileName = "";
		String string = FileUtil.readFile(fileName);
		string = string.replaceAll("\\\n", "<br/>\n");
		System.out.println(" string  is " + string);
	}*/

} 
