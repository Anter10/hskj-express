<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "org.json.*"  %>
<%@ page import = "database.DealDatabase" %>
<%@ page import = "java.io.*" %>
<%@ page import = "javax.sql.*"%>
<%@ page import = "Parameter.*" %>
<%@ page import = "hskj.express.client.logic.*" %>
 
 
 
<%
    /* 得到当前客服端的登陆类型 */
    String logintype = request.getAttribute("logintype").toString();
    System.out.print("登陆方式  = "+logintype);
    // 如果是账号密码登陆
    if (logintype.isEmpty() == false && logintype.equals(MobileClientData.LoginType.PWDLogin.getLogintype())){
    	String id = request.getAttribute("id").toString();
    	String pwd = request.getAttribute("pwd").toString(); 
    	System.out.print("登陆的账号 = "+id+"登陆密码  = "+pwd);
    }else if(logintype.isEmpty() == false && logintype.equals(MobileClientData.LoginType.CODELogin.getLogintype())){
    	String id = request.getAttribute("id").toString(); 
    	String pwd = request.getAttribute("pwd").toString(); 
    	System.out.print("登陆的账号 = "+id+"输入的验证码为  = "+pwd);
    }else{
    	
    	
    }
%>