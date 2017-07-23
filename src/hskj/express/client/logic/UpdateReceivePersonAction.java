package hskj.express.client.logic;
import hskj.express.client.model.ReceivePersonModel;

public class UpdateReceivePersonAction extends SelfAction {
    private ReceivePersonModel rpm ;
    
    
    
    
    public ReceivePersonModel getRpm() {
		return rpm;
	}




	public void setRpm(ReceivePersonModel rpm) {
		this.rpm = rpm;
	}




	@Override
	public String execute()throws Exception {
   	   try{
   		  System.out.print("getRpmgetRpm = ");
//   		String.valueOf((getId())).isEmpty() == false && getName().isEmpty() == false &&  getPhone1().isEmpty() == false &&  getPhone2().isEmpty() == false
//   		  if(getRpm().getMainid().isEmpty() != false){
//   			return "OK";   
//   		  }
   		 return "CANCEL";  
   	   }catch(Exception ex){
   		 return "CANCEL";  
   	   }
    }
   
}
