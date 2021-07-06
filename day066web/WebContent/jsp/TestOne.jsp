<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="entity.Student"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="functions" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP之JSTL表达式</title>
</head>
<body>
  <!-- JSTL之核心标签库：core -->
    <!-- 8、redirect重定向 -->
      <core:redirect url="/jsp/TestTwo.jsp"/><!-- 自带效果 -->
</body>
</html>