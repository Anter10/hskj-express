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

/* 得到用户的ID */
String uid        = request.getAttribute("uid").toString();
/* 得到用户的请求列表ID */
String shoptypeid = request.getAttribute("shoptypeid").toString();
String tablename = "express_proshop";
String selectsql = "select * from "+tablename + " where id = " + shoptypeid;
String data = DealDatabase.getQuerryJsonStringData(selectsql);
Param.sendData(data, response.getWriter());
%>