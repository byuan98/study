<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>成功页面</h1>
    <a href="<core:url value='/test5/methodOne.action?str=2021-11-22'/>">/test5/methodOne.action?str=2021-11-22</a>
    <br/>
    <a href="<core:url value='/test5/methodTwo.action?date=2021/12/12'/>">/test5/methodTwo.action?date=2021/12/12</a>
    <br/>
    <a href="<core:url value='/test5/methodThree.action?date=1998-11-12'/>">/test5/methodThree.action?date=1998-11-12</a>
    <br/>
    date=${requestScope.date}
</body>
</html>