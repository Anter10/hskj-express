package hskj.express.client.logic;

public class ClearOrderByOrderStatueAction extends SelfAction{
     private String mainid  = "";  // 用户ID
     private String statue = "";  // 空的表格
     
	public String getMainid() {
		return mainid;
	}
	public void setMainid(String mainid) {
		this.mainid = mainid;
	}
 
     
    public String getStatue() {
		return statue;
	}
	public void setStatue(String statue) {
		this.statue = statue;
	}
	@Override
	public String execute() throws Exception{
		try{
			 if(getStatue().isEmpty() == false && this.getMainid().isEmpty() == false){
				return "SUCCESS";
			 }else{
				return "ERROR";
			 }
		 }catch(Exception  ex){
			 return "ERROR"; 
		 }
		
	} 
}
