package Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/** 
 * @author 鍒樺悏椋�
 * @version 鍒涘缓鏃堕棿锛�2019骞�9鏈�12鏃� 涓婂崍10:03:21
 * 绫诲姛鑳借鏄� 
 */
public class RegisterInfo {

	//浜庡厠绁鐢穦鍖椾含甯倈鍖椾含閾佺爺寤鸿鐩戠悊鏈夐檺璐ｄ换鍏徃|宸ョ▼鏈烘|鎴垮眿寤虹瓚宸ョ▼|鐢靛姏宸ョ▼|90164|11007719|2021.06.15
	
		//鈥淚D锛屽鍚嶏紝鎬у埆锛岀渷甯傦紝鐢宠娉ㄥ唽鍗曚綅锛屾墍瀛︿笓涓氾紝鐢宠娉ㄥ唽涓撲笟1锛岀敵璇锋敞鍐屼笓涓�2锛屾墽涓氳祫鏍艰瘉涔︾紪鍙凤紝娉ㄥ唽鍙凤紝鏈夋晥鏈�
		private Integer id;
		private String name ;
		private String sex ;
		private String address;
		private String qy ;
		
		private String zy ;
		private String sqzczy1 ;
		
		private String sqzczy2 ;
		private String zsbh ;
		private String zch ;
		private Date yxq ;
		
		
		
		public RegisterInfo(String name, String sex,String address, String qy, String zy, String sqzczy1, String sqzczy2,
				 String zsbh, String zch, String yxq) throws ParseException {
			super();
			//this.id = Integer.parseInt(id);
			this.name = name;
			this.sex = sex;
			this.address=address;
			this.qy = qy;
			this.zy = zy;
			this.sqzczy1 = sqzczy1;
			this.sqzczy2 = sqzczy2;
			this.zsbh = zsbh;
			this.zch = zch;
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd");
			this.yxq = simpleDateFormat.parse(yxq);
			
		}
		
		
		public RegisterInfo() {
			super();
		}


		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public String getQy() {
			return qy;
		}
		public void setQy(String qy) {
			this.qy = qy;
		}
		public String getZy() {
			return zy;
		}
		public void setZy(String zy) {
			this.zy = zy;
		}
		public String getSqzczy1() {
			return sqzczy1;
		}
		public void setSqzczy1(String sqzczy1) {
			this.sqzczy1 = sqzczy1;
		}
		public String getSqzczy2() {
			return sqzczy2;
		}
		public void setSqzczy2(String sqzczy2) {
			this.sqzczy2 = sqzczy2;
		}

		public String getZsbh() {
			return zsbh;
		}
		public void setZsbh(String zsbh) {
			this.zsbh = zsbh;
		}
		public String getZch() {
			return zch;
		}
		public void setZch(String zch) {
			this.zch = zch;
		}
		public Date getYxq() {
			return yxq;
		}
		public void setYxq(Date yxq) {
			this.yxq = yxq;
		}


		public String getAddress() {
			return address;
		}


		public void setAddress(String address) {
			this.address = address;
		}


		@Override
		public String toString() {
			return "RegisterInfo [id=" + id + ", name=" + name + ", sex=" + sex
					+ ", address=" + address + ", qy=" + qy + ", zy=" + zy
					+ ", sqzczy1=" + sqzczy1 + ", sqzczy2=" + sqzczy2
					+ ", zsbh=" + zsbh + ", zch=" + zch + ", yxq=" + yxq + "]";
		}



}
