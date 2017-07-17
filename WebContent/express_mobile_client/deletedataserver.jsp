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
/* 删除ID */  
String id      = request.getAttribute("id").toString();
String tablename = MobileClientData.EXPTableType.getTableName(tbid);

if (tablename != null){
	String deletesql = "delete from "+tablename+" where mainid = "+ mainid + " and id = "+id;
	System.out.print(deletesql+"  mainid = "+mainid + "tablename = "+tablename+"/n");
	boolean data = DealDatabase.executeSQL(deletesql);
}else{
	System.out.print("没有你要的表信息");
}

%>