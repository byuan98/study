<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP的指令标签</title>
</head>
<body>
  <%--JSP=java片段+JSP标签+HTML --%>
  <%--JSP标签=指令标签+动作标签 --%>
  
  <%--<%@page contentType="text/html; charset=utf-8" %> 
  设置当前JSP的相应编码集为指定编码集，通过该编码集进行解析
  --%>
  <%int number=(int)(Math.random()*2); %>
  c=<%=1/number%>
  <%@ page errorPage="error.jsp" %>
  <jsp:getProperty property="" name=""/>
</body>
</html>