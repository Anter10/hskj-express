package hskj.express.client.logic;

import com.opensymphony.xwork2.ActionSupport;

public class SelfAction extends ActionSupport {
    public String securecode = "";

	public String getSecurecode() {
		return securecode;
	}

	public void setSecurecode(String securecode) {
		this.securecode = securecode;
	}
	
	public SelfAction(){
		 
	 
	}
	
	@Override 
	public void validate(){
		
	}
	
	@Override 
	 public String execute() throws Exception{
		try{
			System.out.println("安全码 - "+ this.getSecurecode());
			 return "ABOUT";
		 }catch(Exception  ex){
			 return "CANCEL";
		 }
	}
	
    
}
