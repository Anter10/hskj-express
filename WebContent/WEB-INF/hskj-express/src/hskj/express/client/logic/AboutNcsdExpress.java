package hskj.express.client.logic;
 

import Parameter.Param;

public class AboutNcsdExpress extends SelfAction {
	
	 /**
	 * 
	 */
	
    public String securecode = "";

	public String getSecurecode() {
		return securecode;
	}

	public void setSecurecode(String securecode) {
		this.securecode = securecode;
	}
	
	private static final long serialVersionUID = 1L;
    
	@Override 
	 public String execute() throws Exception{
		
		try{
			
			 return "ABOUT";
		 }catch(Exception  ex){
			 return "CANCEL";
		 }
	}
}
