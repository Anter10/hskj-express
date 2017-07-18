package hskj.express.client.logic;

public class SelectTypeOrderAction extends SelfAction{
        private String orderType = ""; //订单类型
        private String mainid    = ""; //寄件人账号
		public String getOrderType() {
			return orderType;
		}
		public void setOrderType(String orderType) {
			this.orderType = orderType;
		}
		public String getMainid() {
			return mainid;
		}
		public void setMainid(String mainid) {
			this.mainid = mainid;
		}
       
		public String execute() throws Exception{
			try{
				 if(getOrderType().isEmpty() == false && getMainid().isEmpty() == false){
					 return "SUCCESS";
				 }else{
					 return "ERROR";
				 }
			 }catch(Exception  ex){
				 return "ERROR"; 
			 }
		}
}
