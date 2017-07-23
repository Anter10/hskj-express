<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import = "org.json.*"  %>
<%@ page import = "database.*" %>
<%@ page import = "java.io.*" %>
<%@ page import = "javax.sql.*"%>
<%@ page import = "Parameter.*" %>
<%@ page import = "file.*" %>
<%@ page import = "hskj.express.client.logic.*" %>
<%@ page import = "hskj.express.client.model.express_receive_person" %>
 <%-- <jsp:useBean id="upm" scope="page" class=""hskj.express.client.model.ReceivePersonModel" /> --%>
<%   
  
     express_receive_person rpm = (express_receive_person)request.getAttribute("rpm");
     String updateSql = "update express_receive_person set name = "+"'"+rpm.getName()+"'"+","+" phone1 = " + "'" +rpm.getPhone1() + "'" + "," +" phone2 = "+ "'" +rpm.getPhone2() + "'" + " where id = " + rpm.getId() ;
     DealDatabase.executeSQL(updateSql);
     String selectsql = "select * from express_receive_person where mainid = "+ rpm.getMainid();
     String data = DealDatabase.getQuerryJsonStringData(selectsql);
     
     Param.sendData(data, response.getWriter());  
     System.out.print("更新 啊啊啊"+rpm.getMainid());
%>