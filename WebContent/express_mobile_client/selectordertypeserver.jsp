<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import = "org.json.*"  %>
<%@ page import = "database.*" %>
<%@ page import = "java.io.*" %>
<%@ page import = "javax.sql.*"%>
<%@ page import = "Parameter.*" %>
<%@ page import = "file.*" %>
<%@ page import = "hskj.express.client.logic.*" %>
 
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询的订单信息</title>
</head>
<body> 
      <%   
           /* 订单ID */
           String ordertype           = request.getAttribute("orderType").toString(); // 订单ID
           /* 订单查询授权码 */
           String mainid              = request.getAttribute("mainid").toString(); // 订单查询授权码
           
           String selectOrderSql      = "select * from express_will_finish_order where send_person_id = " + mainid + " and orderstatue = " + ordertype + " order by get_time DESC";
           String objstr              = DealDatabase.getQuerryJsonStringData(selectOrderSql);
           System.out.print("查询的订单信息  = "+selectOrderSql);
           if(objstr != null){
        	   Param.sendData(objstr, response.getWriter()); 
           }
           
       %>
       
</body>
</html>