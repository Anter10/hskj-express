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
String tablename = "express_notify";
String selectsql = "select * from "+tablename;
String data = DealDatabase.getQuerryJsonStringData(selectsql);
Param.sendData(data, response.getWriter());
%>