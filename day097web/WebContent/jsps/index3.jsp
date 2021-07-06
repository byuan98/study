<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="<core:url value='/js/jquery-1.6.4.min.js'/>"></script>
<title>Insert title here</title>
</head>
<body>
    <form action="<core:url value='/test3/upload.action'/>" method="post" enctype="multipart/form-data">
        photo:<input type="file" name="photo"/>
        <input type="submit" value="文件上传"/>
    </form>
    <hr/>
    <h1>文件下载</h1>
    <a href="<core:url value='/test3/download.action?fileName=1.jpg'/>">文件下载:1.jpg</a>
    <a href="<core:url value='/test3/download.action?fileName=主页.jpg'/>">文件下载:主页.jpg</a>
</body>
</html>