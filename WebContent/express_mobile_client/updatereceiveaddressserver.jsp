<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import = "org.json.*"  %>
<%@ page import = "database.*" %>
<%@ page import = "java.io.*" %>
<%@ page import = "javax.sql.*"%>
<%@ page import = "Parameter.*" %>
<%@ page import = "file.*" %>
<%@ page import = "hskj.express.client.logic.*" %>
<%@ page import = "hskj.express.client.model.express_receive_address" %>
 <%-- <jsp:useBean id="upm" scope="page" class=""hskj.express.client.model.ReceivePersonModel" /> --%>
<%   
     express_receive_address era = (express_receive_address)request.getAttribute("era");
     String updateSql = "update express_receive_address set province = "+"'"+era.getProvince()+"'"+","+" city = " + "'" +era.getCity() + "'" + "," +" controy = "+ "'" +era.getControy() + "'" + "," +" detail = "+ "'" +era.getDetail() + "'" + "," +" mailid = "+ "'" +era.getMailid() + "'" + " where id = " + era.getId() ;   
     DealDatabase.executeSQL(updateSql);
     String selectsql = "select * from express_receive_address where mainid = "+ era.getMainid();
     String data = DealDatabase.getQuerryJsonStringData(selectsql);
     Param.sendData(data, response.getWriter());  
     System.out.print("更新 啊啊啊"+era.getMainid());
%>