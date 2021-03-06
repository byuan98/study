<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>未分页</title>
</head>
<body>
  <core:if test="${empty requestScope.allStudent}">
    <jsp:forward page="/test/getallstudent"/>
  </core:if>
  <table align="center" border="solid">
    <tr>
      <th>序号</th><th>学号</th><th>姓名</th><th>分数</th>
    </tr>
    <core:forEach items="${requestScope.allStudent}" var="stu" varStatus="vs">
        <tr>
          <td>${vs.index+1}</td>
          <td>${stu.stuid}</td>
          <td>${stu.stuname}</td>
          <td>${stu.stuscore}</td>
        </tr>
      </core:forEach>
    </table>
</body>
</html>