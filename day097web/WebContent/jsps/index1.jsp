<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1 align="center">数据回显</h1>
    <!-- action的参数是单值数据类型 -->
    <form action="<core:url value='/test1/method1.action'/>" method="post">
        stuname=<input type="text" name="stuname" value="${requestScope.stuname}"/>
        stuscore=<input type="text" name="stuscore" value="${requestScope.stuscore}"/>
        <input type="submit" value="提交"/>
    </form>
    <hr/>
    <!-- action的参数是引用数据类型1:不设置属性名,默认为类名首字母小写 -->
    <form action="<core:url value='/test1/method2.action'/>" method="post">
        stuname=<input type="text" name="stuname" value="${requestScope.student.stuname}"/>
        stuscore=<input type="text" name="stuscore" value="${requestScope.student.stuscore}"/>
        <input type="submit" value="提交"/>
    </form>
    <hr/>
    <!-- action的参数是引用数据类型2:通过注解ModelAttribute设置属性名 -->
    <form action="<core:url value='/test1/method3.action'/>" method="post">
        stuname=<input type="text" name="stuname" value="${requestScope.s.stuname}"/>
        stuscore=<input type="text" name="stuscore" value="${requestScope.s.stuscore}"/>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>