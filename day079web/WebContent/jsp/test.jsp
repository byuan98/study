<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="<core:url value='/js/jquery-1.6.4.min.js'/>"></script>
<script type="text/javascript">
    $(function(){
    	$("#but_1").click(function(){
    		alert(123);
    	});    	
    });
</script>
<body>
<input type="button" id="but_1">
<core:url value='/js/jquery-1.6.4.min.js'/>
</body>
</html>