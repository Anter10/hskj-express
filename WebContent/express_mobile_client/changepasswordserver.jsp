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
  /* 验证码的类型 */
  String changetype = request.getAttribute("changetype").toString(); 
  /* 验证的手机号码 或者邮箱 */
  String changeid    = request.getAttribute("changeid").toString();
  /* 验证码 */
  String changepwd = request.getAttribute("changepwd").toString();
  
  
  if(changetype.equals(MobileClientData.ChangePwdType.FirstSetPwd.getChangetype())){
	  String insertsql = "insert into express_user(uphone, upassword) values("+changeid+ "," + changepwd +")";
	  System.out.print("修改的信息 " + changetype + " "+changeid + " " + changepwd + " "+ insertsql);
	  DealDatabase.executeSQL(insertsql);
	  
	  /* 将玩家的初始数据给用户 */
	  String selectsql = "select * from express_user where uphone = "+ changeid;
	  String data = DealDatabase.getQuerryJsonStringData(selectsql);
	  Param.sendData(data, response.getWriter());
  }
%> 