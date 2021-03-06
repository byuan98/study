<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>分页效果</title>
</head>
<body>
  <core:if test="${empty requestScope.studentpaging}">
    <jsp:forward page="/test/getallstudentpaging"/>
  </core:if>
  <table align="center" border="solid">
    <tr>
      <th>学生编号</th><th>学生姓名</th><th>学生分数</th>
    </tr>
    <core:forEach items="${requestScope.studentpaging.list}" var="stu">
      <tr>
        <td>${stu.stuid}</td>
        <td>${stu.stuname}</td>
        <td>${stu.stuscore}</td>
      </tr>
    </core:forEach>
    <tr>
      <th colspan="5" height="10px">
        <core:if test="${requestScope.studentpaging.pageNumber!=1}">
          <a href="<core:url value='/test/getallstudentpaging?pageNumber=${requestScope.studentpaging.pageNumber-1}'/>">上一页</a>
        </core:if>
        <core:forEach begin="1" end="${requestScope.studentpaging.pageTotal}" var="pn">
          <core:choose>
            <core:when test="${pn != requestScore.studentpaging.pageNumber}">
              <a href="<core:url value='/test/getallstudentpaging?pageNumber=${pn}'/>">${pn}</a>
            </core:when>
            <core:otherwise>
              <a>[${pn}]</a>
            </core:otherwise>
          </core:choose>
        </core:forEach>
        <core:if test="${requestScope.studentpaging.pageNumber lt requestScope.studentpaging.pageTotal}">
          <a href="<core:url value='/test/getallstudentpaging?pageNumber=${requestScope.studentpaging.pageNumber+1}'/>">下一页</a>
        </core:if>
      </th>
    </tr>
  </table>
</body>
</html>