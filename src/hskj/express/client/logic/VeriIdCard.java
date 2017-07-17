package hskj.express.client.logic;

public class VeriIdCard {
	private String uid    = "";
	private String idcard = "";
	private String idname = "";
	
	
	public String getUid() {
		return uid;
	}


	public void setUid(String uid) {
		this.uid = uid;
	}


	public String getIdcard() {
		return idcard;
	}


	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}


	public String getIdname() {
		return idname;
	}


	public void setIdname(String idname) {
		this.idname = idname;
	}


	public String execute() throws Exception{
		 
		try{
			 if(getIdcard().isEmpty() == false && getIdname().isEmpty() == false && getUid().isEmpty() == false){
				 return "SUCCESS";
			 }else{
				 return "ERROR";
			 }
		 }catch(Exception  ex){
			 return "ERROR"; 
		 }
		
	}
}
