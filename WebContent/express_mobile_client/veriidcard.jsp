<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     
<%@ page import = "org.json.*"  %>
<%@ page import = "database.*" %>
<%@ page import = "java.io.*" %>
<%@ page import = "javax.sql.*"%>
<%@ page import = "Parameter.*" %>
<%@ page import = "file.*" %>
<%

/* 账号 */
String uid         = request.getAttribute("uid").toString(); 
/* 表的ID */
String idcard      = request.getAttribute("idcard").toString();
/* 删除ID */  
String idname      = request.getAttribute("idname").toString();

String httpUrl = "http://apis.baidu.com/apix/idauth/idauth";
String httpArg = "name="+idname+"&cardno="+idcard;

/* String getdata = Param.veriIdCard(httpUrl, httpArg); */
System.out.print("身份证验证信息  "+uid + idcard + idname );

String insertVeri = "insert into express_veri_idcard(mainid,idcard,idname) values("+"'"+uid+"'"+","+"'"+idcard+"'"+","+"'"+idname+"'"+")";

boolean success = DealDatabase.executeSQL(insertVeri);

String selectSql = "select * from express_veri_idcard where mainid = "+uid;
String data      = DealDatabase.getQuerryJsonStringData(selectSql);
 
Param.sendData(data,response.getWriter());

  
%>
 