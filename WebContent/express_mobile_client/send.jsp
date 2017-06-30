<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "org.json.*"  %>
<%@ page import = "database.DealDatabase" %>
<%@ page import = "java.io.*" %>
<%@ page import = "javax.sql.*"%>
<%@ page import = "Parameter.*" %>
 

<%
System.out.print("Hello/n"+request.getAttribute("id")+"/n");
String sql = "select * from express_app_show";
String data = DealDatabase.getQuerryJsonStringData(sql);
Param.sendData(data, response.getWriter());
%>