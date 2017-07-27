package hskj.express.client.logic;

import Parameter.Param;

public class SendCodeAction {
    private int codetype    = -1; // 
    private String phoneoreamil    = "";
  
 
	 
    
	public int getCodetype() {
		return codetype;
	}




	public void setCodetype(int codetype) {
		this.codetype = codetype;
	}




	public String getPhoneoreamil() {
		return phoneoreamil;
	}




	public void setPhoneoreamil(String phoneoreamil) {
		this.phoneoreamil = phoneoreamil;
	}




	public String execute() throws Exception{
		phoneoreamil     = getPhoneoreamil();
		 
		codetype  = getCodetype();
		System.out.print("phoneoreami = "+phoneoreamil);
		System.out.print(codetype);
		try{
			 if(codetype != -1 && phoneoreamil.isEmpty() == false){
				 // 判断是邮箱还是手机号码
				 boolean isphone = Param.isMobileNO(phoneoreamil);
				 boolean isemail = Param.isMobileNO(phoneoreamil);
				 if (isphone == true || isemail == true){
					 if(isphone == true){
						return "PHONE"; 
					 }else if(isemail == true){
						return "EMAIL"; 
					 }
				 }else{
					 return "NPE";
				 }
				 
			 }else{
				 return "PEEMPTY";
			 }
		 }catch(Exception  ex){
			 return "PEEMPTY";
		 }
		 return "PEEMPTY";
	}
   
}
