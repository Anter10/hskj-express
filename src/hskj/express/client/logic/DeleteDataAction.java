package hskj.express.client.logic;

public class DeleteDataAction extends SelfAction{
    private String mainid = "";
    private String id     = "";
    private String tbid   = "";
    
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
    @Override
	public String execute() throws Exception{
		try{
			 if(getMainid().isEmpty() == false && getId().isEmpty() == false && getTbid().isEmpty() == false){
				 System.out.print("id "+id);
				 return "SUCCESS";
			 }else{
				 return "ERROR";
			 }
		 }catch(Exception  ex){
			 return "ERROR"; 
		 }
		
	}
   
}
