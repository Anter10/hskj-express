package hskj.express.client.logic;

public class UpdateReceiveAddressAction extends SelfAction {
	private UpdateReceiveAddressAction uraa;
	private String id      = ""; // 更新的ID
	private String mainid  = ""; // 添加人的ID
    private String mailid  = ""; // 邮政编码
    private String province= ""; // 省
    private String city    = ""; // 地区／县
    private String controy = ""; // 电话号码2
    private String detail  = ""; // 添加收件详情地址
    
    public UpdateReceiveAddressAction(){
   	 
    }

   
   
   public UpdateReceiveAddressAction getUraa() {
		return uraa;
	}



	public void setUraa(UpdateReceiveAddressAction uraa) {
		this.uraa = uraa;
	}



public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



public String getMailid() {
		return mailid;
	}



	public void setMailid(String mailid) {
		this.mailid = mailid;
	}



	public String getMainid() {
		return mainid;
	}



	public void setMainid(String mainid) {
		this.mainid = mainid;
	}



	public String getProvince() {
		return province;
	}



	public void setProvince(String province) {
		this.province = province;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getControy() {
		return controy;
	}



	public void setControy(String controy) {
		this.controy = controy;
	}



	public String getDetail() {
		return detail;
	}



	public void setDetail(String detail) {
		this.detail = detail;
	}


    @Override
	public String execute() throws Exception{
		try{
			 if(String.valueOf(getId()).isEmpty() == false && this.getMailid().isEmpty() == false && this.getMainid().isEmpty() == false && this.getProvince().isEmpty() == false && this.getCity().isEmpty() == false && this.getControy().isEmpty() == false  && this.getDetail().isEmpty() == false ){
				return "SUCCESS";
			 }else{
				return "ERROR";
			 }
		 }catch(Exception  ex){
			 return "ERROR"; 
		 }
		
	}
}
