package hskj.express.client.logic;

import Parameter.Param;

public class GetNotifyAction extends SelfAction{
   
	@Override
	public String execute() throws Exception{
	    try{
			return "OK";
		 }catch(Exception  ex){
			 return "CANCEL";
		 }
	}
}
