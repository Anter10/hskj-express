package hskj.express.client.logic;

public class ChangePersonMessageAction extends SelfAction{
     private String changetype = "";
     private String msgs = "";
     private String userid = "";
     
     
     public String getChangetype() {
		return changetype;
	}


	public void setChangetype(String changetype) {
		this.changetype = changetype;
	}


	public String getMsgs() {
		return msgs;
	}


	public void setMsgs(String msgs) {
		this.msgs = msgs;
	}


	public String getUserid() {
		return userid;
	}


	public void setUserid(String userid) {
		this.userid = userid;
	}
    
	@Override
	public String execute() throws Exception{
    	 try{
    		 
    		return "SUCCESS"; 
    	 }catch(Exception ex){
    		 return "ERROR";
    	 }
    }
     
}
