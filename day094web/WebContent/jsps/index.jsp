<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <form action="<core:url value='/testone.action'/>" method="get">
        stuname:<input type="text" name="stuname"/>
        stuage:<input type="text" name="stuage"/>
        <input type="submit" value="提交">
    </form>
</body>
</html>