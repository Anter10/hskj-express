package hskj.express.client.logic;
import com.opensymphony.xwork2.ModelDriven;

import hskj.express.client.model.express_receive_person;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
 

public class UpdateReceivePersonAction extends SelfAction implements ModelDriven {
    private express_receive_person rpm = new express_receive_person();
   
	@Override
	public express_receive_person getModel() {
		// TODO Auto-generated method stub
		return rpm; 
	}
 

	@Override 
	public String execute() throws Exception {
   	   try{
   		 
          if(String.valueOf((getModel().getId())).isEmpty() == false && getModel().getName().isEmpty() == false &&  getModel().getPhone1().isEmpty() == false &&  getModel().getPhone2().isEmpty() == false){
        	  HttpServletRequest request = ServletActionContext.getRequest();
       		  request.setAttribute("rpm", rpm);
       		  System.out.print("getRpmgetRpm = "+rpm.getMainid());
        	  return "SUCCESS"; 
   		  }
   		  
   	   }catch(Exception ex){
   		 return "CANCEL";  
   	   }
   	  return "CANCEL";  
    }





   
}
