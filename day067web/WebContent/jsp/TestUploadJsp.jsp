<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <form action="<core:url value='/test/upload'/>" method="post" enctype="multipart/form-data">
    用户名：<input type="text" name="name"/><br/>
    年龄：<input type="text" name="age"/><br/>
    照片：<input type="file" name="photo"/><br/>
    <input type="submit" value="上传"/>
  </form>
</body>
</html>