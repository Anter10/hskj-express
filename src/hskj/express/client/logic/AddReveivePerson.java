package hskj.express.client.logic;

public class AddReveivePerson {
     private String mainid    = ""; // 添加人的ID
     private String name   = ""; // 添加的人的姓名
     private String phone1 = ""; // 电话号码1
     private String phone2 = ""; // 电话号码2
     
     
     public AddReveivePerson(){
    	 
     }


    

	public String getMainid() {
		return mainid;
	}




	public void setMainid(String mainid) {
		this.mainid = mainid;
	}




	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone1() {
		return phone1;
	}


	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}


	public String getPhone2() {
		return phone2;
	}


	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}
    
    public String execute() throws Exception{
		try{
			System.out.println("ddddd = "+getMainid());
			 if(getMainid().isEmpty() == false && this.getName().isEmpty() == false && this.getPhone1().isEmpty() == false && this.getPhone2().isEmpty() == false ){
				return "SUCCESS";
			 }else{
				return "ERROR";
			 }
		 }catch(Exception  ex){
			 return "ERROR"; 
		 }
		
	}
     
}
