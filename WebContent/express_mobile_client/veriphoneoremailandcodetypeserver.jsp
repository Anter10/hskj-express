<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import = "org.json.*"  %>
<%@ page import = "database.*" %>
<%@ page import = "java.io.*" %>
<%@ page import = "javax.sql.*"%>
<%@ page import = "Parameter.*" %>
<%@ page import = "file.*" %>
<%@ page import = "hskj.express.client.logic.*" %>
 
<%
  /* 验证的手机号码 或者邮箱 */
  String phoneoreamil    = request.getAttribute("phoneoremail").toString();
  /* 验证码的类型 */
  String codetype = request.getAttribute("codetype").toString();
  /* 验证码 */
  String code = request.getAttribute("code").toString();
  System.out.print("手机号或者邮箱格式不正确 " + codetype);
  /* 更换密码的验证码 */
  if (codetype.equals(MobileClientData.PhoneEmailCodeType.ChangePassword.getCodetype())){
     
  /* 手机登陆验证码 */
  }else if(codetype.equals(MobileClientData.PhoneEmailCodeType.LoginCode.getCodetype())){
      
  /* 手机号注册验证码  */	  
  }else if(codetype.equals(MobileClientData.PhoneEmailCodeType.PhoneRegister.getCodetype())){
	  /* 判断手机号和邮箱是否正确 */
	  boolean isphone = Param.isMobileNO(phoneoreamil);
	  boolean isemail = Param.checkEmail(phoneoreamil);
	  if (isphone == false && isemail == false){
		  System.out.print("手机号或者邮箱格式不正确");
	  }else{

		  /* 判断验证码是否验证过 没有验证过的话: 如果是手机号 查询当前的账号和验证码和验证码类型是否正确 */
		  if(isphone == true){
			 String hasvail = "select * from user_use_code where phoneoremail = " + phoneoreamil +" and codetype = "+ codetype + " and code = " + code + " and hasvail = 1";  
			
			 String hasselect = DealDatabase.getQuerryJsonStringData(hasvail);
			 
			 /* 如果已经验证过 */
			 if (hasselect != null){
				 System.out.print("手机号或者邮箱已经验证过");
			 /* 如果还没有验证过 */
		     }else{
		    	 String willvail = "select * from user_use_code where phoneoremail= " + phoneoreamil +" and codetype = "+ codetype + " and code = " + code + " and hasvail = 0"; 
		    	 String willselect = DealDatabase.getQuerryJsonStringData(willvail);
		    	 /* 判断验证码是否正确 */
		    	 /* 你输入的账号或者验证码不正确 */
		    	 if(willselect == null){
		    		System.out.print("手机号或者邮箱或者验证码错误");
		    	 /* 正确 */
		    	 }else{
		    	 
		    	  String updatesql = "update user_use_code set hasvail = 1 where phoneoremail= " + phoneoreamil +" and codetype = "+ codetype + " and code = " + code + " and hasvail = 0";
		    	  Param.sendPhone(phoneoreamil, "成功", code);
		    	  boolean update = DealDatabase.executeSQL(updatesql);
		    	  System.out.print("手机号注册成功");
		    	 }
		     }
		  }else if(isemail == true){
			  
		  }
		  
		  
	  }
	 
  }
  
  
%> 