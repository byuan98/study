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
    <a href="<core:url value='/test4/methodOne.action'/>">methodOne.action</a><br>
    <a href="<core:url value='/test4/methodTwo.action'/>">methodTwo.action</a><br>
    <a href="<core:url value='/test4/methodThree.action'/>">methodThree.action</a><br>

    <font color="red" size="10px">aa=${requestScope.aa}</font><br>
    
</body>
</html>