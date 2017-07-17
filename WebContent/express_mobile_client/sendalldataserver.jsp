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
/* 账号 */
String mainid    = request.getAttribute("mainid").toString(); 
/* 表的ID */
String tbid      = request.getAttribute("tbid").toString();
String tablename = MobileClientData.EXPTableType.getTableName(tbid);


if (tablename != null){
	String selectsql = "select * from "+tablename+" where mainid = "+ mainid;
	System.out.print(selectsql+"  mainid = "+mainid + "tablename = "+tablename);
	String data = DealDatabase.getQuerryJsonStringData(selectsql);
	Param.sendData(data, response.getWriter());
}else{
	System.out.print("没有你要的表信息");
}

%>