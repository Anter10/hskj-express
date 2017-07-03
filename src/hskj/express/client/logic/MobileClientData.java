package hskj.express.client.logic;

public class MobileClientData {
    
	
//	验证码类型
	public static enum PhoneEmailCodeType {
	    LoginCode("登陆验证码","101"),
	    PhoneRegister("手机号注册验证码","102"),
    	ChangePassword("修改密码验证码","103");
    	
    	 
    	 private String codename = "";
    	 private String codetype = "";
    	 
    	private PhoneEmailCodeType(String codename, String codetype){
            this.codename = codename;
            this.codetype = codetype;
    	}
		public String getCodename() {
			return codename;
		}
		public void setCodename(String codename) {
			this.codename = codename;
		}
		public String getCodetype() {
			return codetype;
		}
		public void setCodetype(String codetype) {
			this.codetype = codetype;
		}
	}	

// 寄件类型
public static enum SendItemType{
    ClothType("","");
	
	private String sendtype = "";
	private String sendinfo = "";
	
	SendItemType(String _sendtype, String _sendinfo){
         sendtype = _sendtype;
         sendinfo = _sendinfo;
	}
	public String getSendtype() {
		return sendtype;
	}
	public void setSendtype(String sendtype) {
		this.sendtype = sendtype;
	}
	public String getSendinfo() {
		return sendinfo;
	}
	public void setSendinfo(String sendinfo) {
		this.sendinfo = sendinfo;
	}
   
	

}


// 查询类容类型
public static enum SearchMessageType{
    OrderSearch("101","查询快递单"),BuyOrderSearch("101","订单查询");

	private String searchtype = "";
	private String searchinfo = "";

    SearchMessageType(String _searchtype, String _searchinfo){
         searchtype = _searchtype;
         searchinfo = _searchinfo;
	}
    
	public String getSearchtype() {
		return searchtype;
	}
	public void setSearchtype(String searchtype) {
		this.searchtype = searchtype;
	}
	public String getSearchinfo() {
		return searchinfo;
	}
	public void setSearchinfo(String searchinfo) {
		this.searchinfo = searchinfo;
	}
    
}



// 更改个人信息类型
public static enum ChangePersonMessage{
    Name("101","姓名"),Phone("102","手机号"),Email("103","邮箱地址"),Address("104","家庭住址"),Sex("105","性别"),Age("106","年龄");

	private String changeType    = "";
	private String changeInfo    = "";

	ChangePersonMessage(String _changeType, String _changeInfo){
         changeType = _changeType;
         changeInfo = _changeInfo;
	}

	public String getChangeType() {
		return changeType;
	}
	public void setChangeType(String changeType) {
		this.changeType = changeType;
	}
	public String getChangeInfo() {
		return changeInfo;
	}
	public void setChangeInfo(String changeInfo) {
		this.changeInfo = changeInfo;
	}
	
	
}
	

// 登陆类型
public static enum LoginType{
	   PWDLogin("1","密码登陆") ,CODELogin("2", "手机验证码登陆");
	   
	   private String logintype;
	   private String info;
	   
	   LoginType(String _logintype, String _info){
		   logintype = _logintype;
		   info      = _info;
	   }

		public String getLogintype() {
			return logintype;
		}
	
		public void setLogintype(String logintype) {
			this.logintype = logintype;
		}
	
		public String getInfo() {
			return info;
		}
	
		public void setInfo(String info) {
			this.info = info;
		}
   }
}
