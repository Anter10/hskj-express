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
           String orderid           = request.getAttribute("orderid").toString(); // 订单ID
           /* 订单查询授权码 */
           String selectpid         = request.getAttribute("selectpid").toString(); // 订单查询授权码
           
           String selectOrderSql    = "select * from express_will_finish_order where id = " + orderid + " and orderpeoid = " + selectpid + " order by get_time DESC";
           if (selectpid.equals("-1")){
        	   selectOrderSql    = "select * from express_will_finish_order where id = " + orderid + " order by get_time DESC "; 
           }
           String objstr            = DealDatabase.getQuerryJsonStringData(selectOrderSql);
           System.out.print("查询的订单信息  = "+selectOrderSql);
           
           
           if(objstr != null  && objstr.isEmpty() == false ){
        	  JSONArray obj           = new JSONArray(objstr);
        	  if(obj.length() > 0 ){
        		 String orderStatue = "正在处理";
        	     /* 判断是否接单 */
                 if (obj.getJSONObject(0).getString("orderstatue").equals("-1")){
            	    orderStatue = "寄件人正在赶来的途中,请您稍等...";
                 }else if (obj.getJSONObject(0).getString("orderstatue").equals("2")){
             	    orderStatue = "快递已签收,感谢你的使用...";
                  }
         %>   <h3>农村速递—快递订单信息</h3>
              <h4>快递单号:  <%=obj.getJSONObject(0).getString("id") %></h4>
              <h4>查询授权码:  <%=obj.getJSONObject(0).getString("orderpeoid") %></h4>
	          <h4>寄件人手机号:  <%=obj.getJSONObject(0).getString("send_person_id") %></h4>
	          <h4>收件人姓名:  <%=obj.getJSONObject(0).getString("reveivepersonname") %></h4>
	          <h4>收件人地址:  <%=obj.getJSONObject(0).getString("receivepersonwhere") %></h4>
	          <h4>收件人手机号:  <%=obj.getJSONObject(0).getString("receivepersonphone") %></h4>
	          <h4>收件备用手机号:  <%=obj.getJSONObject(0).getString("receivepersonphone2") %></h4>
	          <h4>提交时间:  <%=obj.getJSONObject(0).getString("get_time") %></h4>
              <h4>订单状态:  <%=orderStatue %></h4>
              <h3>物流信息</h3>
              <h4><a href="http://games.heisekeji.net">查看物流</a></h4>
       <%  
              }else{
       %> 
      
       <%
           }
       %>
       
       <%
           }else{
        	   
           
           
       %>
        <h4>没有你要的订单信息</h4>
       <%
      
       }
       %>
       
</body>
</html>