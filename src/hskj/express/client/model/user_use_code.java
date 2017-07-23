package hskj.express.client.model; 


 //本文档由  hskj-express 在2017/07/23 23:14:17创建

public class user_use_code{

     private String id = null;
     public void setId( String id){
         this.id = id;
     }
     public String getId(){
         return this.id;
     }

     private String phoneoremail = null;
     public void setPhoneoremail( String phoneoremail){
         this.phoneoremail = phoneoremail;
     }
     public String getPhoneoremail(){
         return this.phoneoremail;
     }

     private String codetype = null;
     public void setCodetype( String codetype){
         this.codetype = codetype;
     }
     public String getCodetype(){
         return this.codetype;
     }

     private String code = null;
     public void setCode( String code){
         this.code = code;
     }
     public String getCode(){
         return this.code;
     }

     private String hasvail = null;
     public void setHasvail( String hasvail){
         this.hasvail = hasvail;
     }
     public String getHasvail(){
         return this.hasvail;
     }

     private String sendtime = null;
     public void setSendtime( String sendtime){
         this.sendtime = sendtime;
     }
     public String getSendtime(){
         return this.sendtime;
     }

}

