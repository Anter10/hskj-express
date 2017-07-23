package hskj.express.client.logic;
import com.opensymphony.xwork2.ModelDriven;

import hskj.express.client.model.express_receive_address;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
 
public class UpdateReceiveAddressAction extends SelfAction implements ModelDriven{
	private express_receive_address era = new express_receive_address();
 
    @Override
	public String execute() throws Exception{
		try{ 
			 this.issecure();
			 if(String.valueOf(era.getId()).isEmpty() == false && era.getMailid().isEmpty() == false && era.getMainid().isEmpty() == false && era.getProvince().isEmpty() == false && era.getCity().isEmpty() == false && era.getControy().isEmpty() == false  && era.getDetail().isEmpty() == false ){
				 HttpServletRequest request = ServletActionContext.getRequest();
	       		 request.setAttribute("era", era);
				 return "SUCCESS";
			 }else{
				return "ERROR";
			 }
		 }catch(Exception  ex){
			 return "ERROR"; 
		 }
		
	}

	@Override
	public express_receive_address getModel() {
		// TODO Auto-generated method stub
		return era;
	}
}
