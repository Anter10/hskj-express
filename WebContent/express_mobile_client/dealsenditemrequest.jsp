<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "org.json.*"  %>
<%@ page import = "database.DealDatabase" %>
<%@ page import = "java.io.*" %>
<%@ page import = "javax.sql.*"%>
<%@ page import = "Parameter.*" %>
<%@ page import = "hskj.express.client.logic.*" %>


<%
   /* 收件人ID */
    String rpi = request.getAttribute("receive_person_id").toString();
   /* 收件人地址 */
   String rwi  = request.getAttribute("receive_where_id").toString();
   /* 发件人ID */
   String spi    = request.getAttribute("send_person_id").toString();
   /* 发件人地址 */
   String spw    = request.getAttribute("send_person_where").toString();
   
   String reveivepersonname     = request.getAttribute("rec_person_name").toString();
   String receivepersonwhere    = request.getAttribute("rec_person_wheremsg").toString();
   String receivepersonphone    = request.getAttribute("rec_person_phonemsg").toString();
   String receivepersonphone2   = request.getAttribute("rec_person_phone2msg").toString();
   String sendpersonwhere       = request.getAttribute("send_person_wheremsg").toString();
   String sqm = Param.getYZM();
   String addOrderSql = "insert into express_will_finish_order(orderpeoid,receive_person_id,receive_where_id,send_person_id,send_person_where,reveivepersonname,receivepersonwhere,receivepersonphone,receivepersonphone2, sendpersonwhere) values("+"'"+sqm+"'"+","+"'"+rpi+"'"+","+"'"+rwi+"'"+","+"'"+spi+"'"+","+"'"+spw+"'"+","+"'"+reveivepersonname+"'"+","+"'"+receivepersonwhere+"'"+","+"'"+receivepersonphone+"'"+","+"'"+receivepersonphone2+"'"+","+"'"+sendpersonwhere+"'"+")";
   System.out.print("订单信息 = "+addOrderSql);
   boolean order = DealDatabase.executeSQL(addOrderSql);
   
%>