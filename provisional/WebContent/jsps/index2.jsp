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
    <a href="<core:url value='/test2/methodOne.action'/>">get请求methodOne.action</a><br>
    <a href="<core:url value='/test2/methodTwo.action'/>">get请求methodTwo.action</a><br>
    <a href="<core:url value='/test2/methodThree.action'/>">get请求methodThree.action</a><br>
    <a href="<core:url value='/test2/methodFour.action'/>">get请求methodFour.action</a><br>
    
    <font color="red" size="10px">aa=${requestScope.aa}</font><br>
    
    
    <form action="<core:url value='/test2/methodOne.action'/>" method="post">
        <input type="submit" value="post请求methodOne.action"/>
    </form><br>
    <form action="<core:url value='/test2/methodTwo.action'/>" method="post">
        <input type="submit" value="post请求methodTwo.action"/>
    </form><br>
    <form action="<core:url value='/test2/methodThree.action'/>" method="post">
        <input type="submit" value="post请求methodThree.action"/>
    </form><br>
    <form action="<core:url value='/test2/methodFour.action'/>" method="post">
        <input type="submit" value="post请求methodFour.action"/>
    </form><br>
    
</body>
</html>