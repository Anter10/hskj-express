package hskj.express.client.logic;

public class UserData {
	 private String securecode = "";
	 private String linkroleid = "";
	 public String getSecurecode() {
		return securecode;
	 } 
	 public void setSecurecode(String securecode) {
		this.securecode = securecode;
	 }
	 public String getLinkroleid() {
		return linkroleid;
	 }
	 public void setLinkroleid(String linkroleid) {
		this.linkroleid = linkroleid;
	 }
	 
	 public String slString(){
		 return "账号 = "+getLinkroleid() +"安全码号  = "+ getSecurecode();
	 }
}
