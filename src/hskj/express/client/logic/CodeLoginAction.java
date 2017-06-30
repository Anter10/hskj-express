package hskj.express.client.logic;
import Parameter.*;
public class CodeLoginAction {
    String id = "";     // 电话号码
    String pwd  = "";  // 验证码
    String logintype = "0";  // 登陆类型
    
    
    
	public String getLogintype() {
		return logintype;
	}
	public void setLogintype(String logintype) {
		this.logintype = logintype;
	}
	

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public String execute() throws Exception{
		id    = getId();
		pwd  = getPwd();
		try{
			 if(pwd.isEmpty() == false && id.isEmpty() == false){
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
