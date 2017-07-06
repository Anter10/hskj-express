<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
     
<%@ page import = "org.json.*"  %>
<%@ page import = "database.*" %>
<%@ page import = "java.io.*" %>
<%@ page import = "javax.sql.*"%>
<%@ page import = "Parameter.*" %>
<%@ page import = "file.*" %>
<%@ page import = "hskj.express.client.logic.*" %>
 
<% 
/* 更换的类型 */
String changetype = request.getAttribute("changetype").toString(); 
/* 更换的内容 */
String msgs    = request.getAttribute("msgs").toString();
/* 更换的账号 */
String userid = request.getAttribute("userid").toString();
String changeworld = MobileClientData.ChangePersonMessage.getChangWorld(changetype);
String changesql = "update express_user set " + changeworld + " = " + "'" + msgs + "'" + " where uphone = " + userid;

System.out.print("更换类型 = "+changetype + " 更换的内容 = "+msgs + " 更换的账号 = "+userid + " " + changesql);
DealDatabase.executeSQL(changesql);
%>
 