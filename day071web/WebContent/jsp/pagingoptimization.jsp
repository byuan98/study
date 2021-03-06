<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>分页效果</title>
</head>
<body>
  <core:if test="${empty requestScope.paging}">
    <jsp:forward page="/test/getallstudentpaging"/>
  </core:if>
  <table align="center" border="solid" height="600px" width="800px">
    <tr>
      <th>学生编号</th><th>学生姓名</th><th>学生分数</th>
    </tr>
    <core:forEach items="${requestScope.paging.list}" var="stu">
      <tr>
        <td>${stu.stuid}</td>
        <td>${stu.stuname}</td>
        <td>${stu.stuscore}</td>
      </tr>
    </core:forEach>
    <tr>
      <th colspan="5">
        <core:if test="${requestScope.paging.pageNumber!=1}">
          <a href="<core:url value='/test/getallstudentpaging?pageNumber=${requestScope.studentpaging.pageNumber-1}'/>">上一页</a>
        </core:if>
        <core:forEach begin="1" end="${requestScope.paging.pageTotal}" var="pn">
          <core:choose>
            <core:when test="${pn != requestScore.paging.pageNumber}">
              <a href="<core:url value='/test/getallstudentpaging?pageNumber=${pn}'/>">${pn}</a>
            </core:when>
            <core:otherwise>
              <a>[${pn}]</a>
            </core:otherwise>
          </core:choose> 
        </core:forEach>
        <core:if test="${requestScope.paging.pageNumber lt requestScope.paging.pageTotal}">
          <a href="<core:url value='/test/getallstudentpaging?pageNumber=${requestScope.paging.pageNumber+1}'/>">下一页</a>
        </core:if>
      </th>
    </tr>    
    <tr>
      <th colspan="3">
        <core:if test="${requestScope.paging.pageNumber!=1}">
          <a href="<core:url value='/test/getallstudentpaging?pageNumber=${requestScope.paging.pageNumber-1}'/>">上一页</a>
        </core:if>
        <core:set var="number" value="5"/><!-- 记录显示的页数选项数 -->
        <core:choose>
          <core:when test="${requestScope.paging.pageNumber<(number/2)}">
            <core:set var="startNumber" value="1"/>
          </core:when>
          <core:when test="${requestScope.paging.pageNumber>requestScope.paging.pageTotal-number/2}">
            <core:set var="startNumber" value="${requestScope.paging.pageTotal-number+1}"/>  
          </core:when>
          <core:otherwise>
            <core:set var="startNumber" value="${requestScope.paging.pageNumber-number/2+1}"/>
          </core:otherwise>
        </core:choose>
        <core:if test="${startNumber<=0}">
          <core:set var="startNumber" value="1"/>
        </core:if>
        <core:set var="endNumber" value="${startNumber+number-1}"/>
        <core:if test="${endNumber>requestScope.paging.pageTotal}">
          <core:set var="endNumber" value="${requestScope.paging.pageTotal}"/>
        </core:if>
        <core:forEach begin="${startNumber}" end="${endNumber}" var="pn">
          <core:choose>
            <core:when test="${pn!=requestScope.paging.pageNumber}">
              <a href="<core:url value='/test/getallstudentpaging?pageNumber=${pn}'/>">${pn}</a>
            </core:when>
            <core:otherwise>
              <a>[${pn}]</a>
            </core:otherwise>
          </core:choose>
        </core:forEach>
        <core:if test="${requestScope.paging.pageNumber<requestScope.paging.pageTotal}">
          <a href="<core:url value='/test/getallstudentpaging?pageNumber=${requestScope.paging.pageNumber+1}'/>">下一页</a>
        </core:if>
      </th>
    </tr>
  </table>
</body>
</html>