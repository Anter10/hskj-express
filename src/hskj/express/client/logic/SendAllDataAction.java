package hskj.express.client.logic;

public class SendAllDataAction {
    private String mainid    = "";
    private String tbid      = "";
    
    
	public String getTbid() {
		return tbid;
	}
	public void setTbid(String tbid) {
		this.tbid = tbid;
	}
	
	public String getMainid() {
		return mainid;
	}
	public void setMainid(String mainid) {
		this.mainid = mainid;
	}
	 
	public String execute() throws Exception{
		try{
			 if(getMainid().isEmpty() == false && getTbid().isEmpty() == false ){
				 return "SUCCESS";
			 }else{
				 return "ERROR";
			 }
		 }catch(Exception  ex){
			 return "ERROR"; 
		 }
		
	}
    
}
