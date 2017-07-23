<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import = "org.json.*"  %>
<%@ page import = "database.*" %>
<%@ page import = "java.io.*" %>
<%@ page import = "javax.sql.*"%>
<%@ page import = "Parameter.*" %>
<%@ page import = "file.*" %>
<%@ page import = "hskj.express.client.logic.*" %>
<%@ page import = "hskj.express.client.model.*" %>
<%@ page import = "java.util.*" %>
<%
   String select = "select table_name from information_schema.tables where table_schema='hskj-express'";
   JSONArray ja = DealDatabase.getDescrible(select,"table_name");
   
   List <String> dbtable = new ArrayList<String>();
   for(int index = 0; index < ja.length(); index ++){
	   dbtable.add(ja.getString(index));
   }
   System.out.print("数据库表  = "+dbtable.toString());
   ProduceTableClassModel.exportLua("java", dbtable);


%>