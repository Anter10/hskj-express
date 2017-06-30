<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import = "org.json.*"  %>
<%@ page import = "database.*" %>
<%@ page import = "java.io.*" %>
<%@ page import = "javax.sql.*"%>
<%@ page import = "Parameter.*" %>
<%@ page import = "file.*" %>
 
<%
   String sql = "select * from express_app_show";
   String data = DealDatabase.getQuerryJsonStringData(sql);
   Param.sendData(data, response.getWriter());
%>
 