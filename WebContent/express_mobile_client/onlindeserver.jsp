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
	 String agent = request.getSession().getId();
	 System.out.print("\n"+agent); 
     String onlineNumber = "当前在线人数 "+UserCenterData.getUCD().getOnLineNumber();
     Param.sendData(onlineNumber, response.getWriter());  
   
%>