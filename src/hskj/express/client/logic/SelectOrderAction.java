package hskj.express.client.logic;

public class SelectOrderAction extends SelfAction{
    private String orderid   = ""; // 订单号
    private String selectpid = ""; // 查询订单的授权码
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public String getSelectpid() {
		return selectpid;
	}
	public void setSelectpid(String selectpid) {
		this.selectpid = selectpid;
	}
    @Override
	public String execute() throws Exception{
		try{
			 if(getOrderid().isEmpty() == false && getSelectpid().isEmpty() == false){
				 System.out.print("当前查询是否安全= "+issecure());
				 return "SUCCESS";
			 }else{
				 return "ERROR";
			 }
		 }catch(Exception  ex){
			 return "ERROR"; 
		 }
	}
    
}
