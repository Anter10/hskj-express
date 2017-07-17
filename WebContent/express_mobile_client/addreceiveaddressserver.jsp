<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import = "org.json.*"  %>
<%@ page import = "database.*" %>
<%@ page import = "java.io.*" %>
<%@ page import = "javax.sql.*"%>
<%@ page import = "Parameter.*" %>
<%@ page import = "file.*" %>
<%@ page import = "hskj.express.client.logic.*" %>
 
<%
  /* ID */
  String mainid = request.getAttribute("mainid").toString(); 
  /* 联系人名称 */
  String province    = request.getAttribute("province").toString();
  /* 电话1 */
  String city = request.getAttribute("city").toString();
  /* 电话2 */
  String controy = request.getAttribute("controy").toString();
  /* 电话2 */
  String detail = request.getAttribute("detail").toString();
  String mailid =   request.getAttribute("mailid").toString();  
  String insertsql = "insert into express_receive_address(mailid,mainid, province,city, controy, detail) values(" + "'"+ mailid+ "'" + "," + "'"+ mainid+ "'" + "," + "'"+ province+ "'" + "," + "'"+ city+ "'" + ","+ "'" + controy + "'"+ ","+ "'" + detail + "'"+")";
  System.out.print("修改的信息 " +insertsql);
  DealDatabase.executeSQL(insertsql);
  /* 将玩家的初始数据给用户 */
  String selectsql = "select * from express_receive_address where mainid = "+ mainid;
  String data = DealDatabase.getQuerryJsonStringData(selectsql);
  
  Param.sendData(data, response.getWriter());
 
%>  
     