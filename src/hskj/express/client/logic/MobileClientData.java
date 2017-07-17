package hskj.express.client.logic;

public class MobileClientData {
    //订单类型
	public static enum OrderType{
		HasStartOrder("1","开始的订单"),FinishOrder("2","完成的订单"),NoStartOrder("0","还未开始的订单");
		
		private String info = "";
		private String type = "";
		public String getInfo() {
			return info;
		}
		public void setInfo(String info) {
			this.info = info;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		private OrderType(String type, String _info){
			this.type = type;
			this.info = _info;
		}
	}
    //表的数据名称
	public static enum EXPTableType{
		OrderTable("101","订单表","express_order"),
		FinishOrderTable("102","已完成的订单表","express_finish_order"),
		WillFinishOrderTable("103","未开始的订单表","will_finish_express_order"),
		ReceiveAddressTable("104","收件地址表","express_receive_address"),
		ReceivePersonTable("105","收件人表","express_receive_person"),
		ActivityTable("106","活动表","express_activitys"),
		VeriIdCard("107","活动表","express_veri_idcard")
		;
		
		private String id   = "";
		private String info = "";
		private String name = "";
	    
		
		
		public String getInfo() {
			return info;
		}

		public void setInfo(String info) {
			this.info = info;
		}

		private EXPTableType(String _id, String _info ,String _name){
			this.id   = _id;
			this.info = _info;
			this.name = _name;
		}
		
		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public static String getTableName(String tbid){
			String tablename = null;
			if (tbid.equals(MobileClientData.EXPTableType.OrderTable.getId()) == true){
				tablename = MobileClientData.EXPTableType.OrderTable.getName();
			}else if (tbid.equals(MobileClientData.EXPTableType.FinishOrderTable.getId()) == true){
				tablename = MobileClientData.EXPTableType.FinishOrderTable.getName();
			}else if (tbid.equals(MobileClientData.EXPTableType.WillFinishOrderTable.getId()) == true){
				tablename = MobileClientData.EXPTableType.WillFinishOrderTable.getName();
			}else if (tbid.equals(MobileClientData.EXPTableType.ReceiveAddressTable.getId()) == true){
				tablename = MobileClientData.EXPTableType.ReceiveAddressTable.getName();
			}else if (tbid.equals(MobileClientData.EXPTableType.ReceivePersonTable.getId()) == true){
				tablename = MobileClientData.EXPTableType.ReceivePersonTable.getName();
			}else if (tbid.equals(MobileClientData.EXPTableType.VeriIdCard.getId()) == true){
				tablename = MobileClientData.EXPTableType.VeriIdCard.getName();
			}
			return tablename;
		}
	}
	
//  修改密码的类型
	public static enum ChangePwdType{
		FirstSetPwd("101","首次注册设置密码");
		
		private String changetype = "";
		private String changeinfo = "";
		
		
		public String getChangetype() {
			return changetype;
		}


		public void setChangetype(String changetype) {
			this.changetype = changetype;
		}


		public String getChangeinfo() {
			return changeinfo;
		}


		public void setChangeinfo(String changeinfo) {
			this.changeinfo = changeinfo;
		}


		private ChangePwdType(String changetype, String changeinfo){
			this.changetype = changetype;
			this.changeinfo = changeinfo;
		}
	}
	
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
    Name("101","姓名","uname"),Phone("102","手机号","uphone"),Email("103","邮箱地址","uemail"),Address("104","家庭住址","uaddress"),Sex("105","性别","usex"),Age("106","年龄","uage");

	private String changeType    = "";
	private String changeInfo    = "";  
	private String changeworld   = "";
	
	ChangePersonMessage(String _changeType, String _changeInfo, String _changeworld){
         changeType = _changeType;
         changeInfo = _changeInfo;
         changeworld = _changeworld;
	}
	
	

	public String getChangeworld() {
		return changeworld;
	}



	public void setChangeworld(String changeworld) {
		this.changeworld = changeworld;
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
	
    public static String getChangWorld(String changetype){
    	String gworld = "";
    	if(changetype.equals(MobileClientData.ChangePersonMessage.Name.getChangeType())){
    		gworld = MobileClientData.ChangePersonMessage.Name.getChangeworld();
    	}else if(changetype.equals(MobileClientData.ChangePersonMessage.Phone.getChangeType())){
    		gworld = MobileClientData.ChangePersonMessage.Phone.getChangeworld();
    	}else if(changetype.equals(MobileClientData.ChangePersonMessage.Email.getChangeType())){
    		gworld = MobileClientData.ChangePersonMessage.Email.getChangeworld();
    	}else if(changetype.equals(MobileClientData.ChangePersonMessage.Address.getChangeType())){
    		gworld = MobileClientData.ChangePersonMessage.Address.getChangeworld();
    	}else if(changetype.equals(MobileClientData.ChangePersonMessage.Sex.getChangeType())){
    		gworld = MobileClientData.ChangePersonMessage.Sex.getChangeworld();
    	}else if(changetype.equals(MobileClientData.ChangePersonMessage.Age.getChangeType())){
    		gworld = MobileClientData.ChangePersonMessage.Age.getChangeworld();
    	}
    	return gworld;
    }
	
}
	

// 登陆类型
public static enum LoginType{
	   PWDLogin("101","密码登陆") ,CODELogin("102", "手机验证码登陆");
	   
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
