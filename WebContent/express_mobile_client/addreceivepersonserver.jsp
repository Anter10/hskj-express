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
  String name    = request.getAttribute("name").toString();
  /* 电话1 */
  String phone1 = request.getAttribute("phone1").toString();
  /* 电话2 */
  String phone2 = request.getAttribute("phone2").toString();
  
  String insertsql = "insert into express_receive_person(mainid, name,phone1, phone2) values(" + "'"+ mainid+ "'" + "," + "'"+ name+ "'" + "," + "'"+ phone1+ "'" + ","+ "'" + phone2 + "'"+")";
  System.out.print("修改的信息 " +insertsql);
  DealDatabase.executeSQL(insertsql);
  /* 将玩家的初始数据给用户 */
   String selectsql = "select * from express_receive_person where mainid = "+ mainid;
  String data = DealDatabase.getQuerryJsonStringData(selectsql);
  
  Param.sendData(data, response.getWriter());  
  
 /*  response.sendRedirect("sendalldataserver.jsp?tablename=express_receive_person&&mainid="+mainid); */
 
%> 