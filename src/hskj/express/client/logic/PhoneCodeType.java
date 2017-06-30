package hskj.express.client.logic;

public enum PhoneCodeType {
	    LoginCode("登陆验证码",1),
    	ChangePassword("修改密码验证码",2);
    	 
    	 
    	 private String name = "";
    	 private int    index = 0;
    	 
    	 private PhoneCodeType(String _name, int _index){
    		 name = _name;
    		 index = _index;
    	 }
        
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getIndex() {
			return index;
		}

		public void setIndex(int index) {
			this.index = index;
		}
 
}
