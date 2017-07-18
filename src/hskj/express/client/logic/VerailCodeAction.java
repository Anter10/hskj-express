package hskj.express.client.logic;
 
public class VerailCodeAction extends SelfAction{
    private String phoneoremail = "";
    private String codetype     = "";
    private String code         = "";
    
    
    
   
	public String getPhoneoremail() {
		return phoneoremail;
	}
	public void setPhoneoremail(String phoneoremail) {
		this.phoneoremail = phoneoremail;
	}
	public String getCodetype() {
		return codetype;
	}
	public void setCodetype(String codetype) {
		this.codetype = codetype;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
    @Override
	public String execute() throws Exception{
		System.out.print("验证1");
	    if(getPhoneoremail().isEmpty() && getCodetype().isEmpty() && getCode().isEmpty()){
	    	System.out.print("验证2");
	    	return "CANCEL";
	    }else{
	    	System.out.print("验证3");
	    	return "OK";
	    }
	}
   
   
}
