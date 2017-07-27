package hskj.express.client.logic;

public class ShowAppDics {
       String deviceid = "";
       String logintime = "";
       
       public String execute()throws Exception {
    	   try{
    		  return "OK"; 
    	   }catch(Exception ex){
    		   return "CANCEL";  
    	   }
       }
}
