package hskj.express.client.logic;

public class GetShopListMsg extends SelfAction {
    private String uid = "";
    
    private int shoptypeid = -1;
    
    
    
    public int getShoptypeid() {
		return shoptypeid;
	}


	public void setShoptypeid(int shoptypeid) {
		this.shoptypeid = shoptypeid;
	}


	public String getUid() {
		return uid;
	}


	public void setUid(String uid) {
		this.uid = uid;
	}


	@Override
    public String execute(){
    	try{
    		if (getUid().isEmpty() == false &&  String.valueOf(getShoptypeid()).isEmpty() == false){
    			return "SUCCESS";
    		}else{
    			return "ERROR";
    		}
    		
    	}catch(Exception ex){
    		return "ERROR";
    	}
    }
}
