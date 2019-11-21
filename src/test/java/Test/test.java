package Test;

import org.junit.Test;

import com.wangshu.common.utils.StringUtils;


/**
 * @author 鍒樺悏椋�
 *
 * 2019骞�9鏈�9鏃�
 */
public class test {
	@Test
	public void toHtml(){
		String string = StringUtils.toHtml1("9鏈�5鏃ヤ竴澶ф棭锛屽張鏈変簡鏂版儏鍐点�俓n涓婂崍9鐐瑰锛屼紶鍑轰腑缇庣粡璐搁珮绾у埆纾嬪晢鐗靛ご浜洪�氳瘽鐨勬秷鎭��"
				+ "\n>9鏈�5鏃ヤ笂鍗堬紝涓叡涓ぎ鏀挎不灞�濮斿憳銆佸浗鍔￠櫌鍓�荤悊銆佷腑缇庡叏闈㈢粡娴庡璇濅腑鏂圭壍澶翠汉鍒橀工搴旂害涓庣編鍥借锤鏄撲唬琛ㄨ幈鐗瑰笇娉姐�佽储鏀块儴闀垮鍔挦閫氳瘽銆�");
		System.out.println(string);
	}
	
	@Test
	public void isPhone(){
		boolean b = StringUtils.isPhone("13711111111");
		System.out.println(b);
	}
	@Test
	public void isEmail(){
		boolean b = StringUtils.isEmail("1983919735@qq.com");
		System.out.println(b);
	}
}
