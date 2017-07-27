package hskj.express.client.logic;

public class ChangePasswordAction extends SelfAction{
    private String changetype = "";
    private String changeid   = "";
    private String changepwd  = "";
   
   
    public String getChangetype() {
		return changetype;
	}
	
	
	public void setChangetype(String changetype) {
		this.changetype = changetype;
	}
	
	
	public String getChangeid() {
		return changeid;
	}
	
	
	public void setChangeid(String changeid) {
		this.changeid = changeid;
	}
	
	
	public String getChangepwd() {
		return changepwd;
	}
	
	
	public void setChangepwd(String changepwd) {
		this.changepwd = changepwd;
	}

     @Override
     public String execute() throws Exception{
		 
		try{
			 if(this.getChangetype().isEmpty() == false && this.getChangeid().isEmpty() == false && this.getChangepwd().isEmpty() == false){
				return "SUCCESS";
			 }else{
				return "ERROR";
			 }
		 }catch(Exception  ex){
			 return "ERROR"; 
		 }
		
	}
   
}
