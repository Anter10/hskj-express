<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import = "org.json.*"  %>
<%@ page import = "database.*" %>
<%@ page import = "java.io.*" %>
<%@ page import = "javax.sql.*"%>
<%@ page import = "Parameter.*" %>
<%@ page import = "file.*" %>
 
 
<%
  String phone = request.getAttribute("phoneoreamil").toString();
  String code  = Param.getYZM();
  Param.sendPhone(phone, "注册", code);
%> 