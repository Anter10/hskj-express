package hskj.express.client.logic;

import Parameter.Param;

public class AboutNcsdExpress {
	public String execute() throws Exception{
		try{
			 return "ABOUT";
		 }catch(Exception  ex){
			 return "CANCEL";
		 }
	}
}
