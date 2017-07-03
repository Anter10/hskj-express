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
  /*发送验证码的手机号码 */
  String phone    = request.getAttribute("phoneoreamil").toString();
  /* 发送验证码的类型 */
  String codetype = request.getAttribute("codetype").toString();
  /* 生成随机验证码 */
  String code  = Param.getYZM();
  
  /* 存储发送的验证码 */
  /* 判断此次验证码的账号和类型是否已经存在 如果存在 更新验证码 如果不存在 插入验证码 */
  String selectcodesql = "select phoneoremail, codetype from user_use_code where phoneoremail = " + phone + " and codetype = " + codetype;
  System.out.print("发送的手机号或者邮箱 = "+phone + " 验证码类型 = "+codetype+" 验证码 = " + code);
  String hasthisdata   = DealDatabase.getQuerryJsonStringData(selectcodesql);
  
  if (hasthisdata != null){
	  String updatecodesql = "update user_use_code set code = " + code + " where phoneoremail = " + phone + " and codetype = " + codetype;
      boolean updateresult = DealDatabase.executeSQL(updatecodesql);
      Param.sendPhone(phone, "注册", code);
  }else{
	  String updatecodesql = "insert into user_use_code(phoneoremail, codetype, code) values(" + phone + "," + codetype + "," + code + ")";
      boolean updateresult = DealDatabase.executeSQL(updatecodesql);
      System.out.print("2 "+updatecodesql);
      Param.sendPhone(phone, "注册", code);
  }
  
 
%> 