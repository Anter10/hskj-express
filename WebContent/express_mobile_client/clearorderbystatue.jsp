<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
     
<%@ page import = "org.json.*"  %>
<%@ page import = "database.*" %>
<%@ page import = "java.io.*" %>
<%@ page import = "javax.sql.*"%>
<%@ page import = "Parameter.*" %>
<%@ page import = "file.*" %>
<%@ page import = "hskj.express.client.logic.*" %>
 
<% 
 
/* 订单状态 */
String statue    = request.getAttribute("statue").toString();
/* 订单的主任 */
String mainid    = request.getAttribute("mainid").toString();

String clearsql  = "DELETE  from express_will_finish_order where send_person_id = " + mainid + " and orderstatue = "+ statue;
String selectsql = "select  * from express_will_finish_order where send_person_id = " + mainid + " and orderstatue = "+ statue;
System.out.print("clearsql = "+clearsql);
DealDatabase.executeSQL(clearsql);
String selectdata = DealDatabase.getQuerryJsonStringData(selectsql);
if (selectdata != null){
	Param.sendData(selectdata, response.getWriter());
}

%>
 