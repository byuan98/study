<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>从服务端获取拼凑的JSON数据</title>
</head>
  <script type="text/javascript" src="<core:url value='/js/myajax.js'/>"></script>
  <script type="text/javascript" src="<core:url value='/js/jquery-1.6.4.min.js'/>"></script>
  <script type="text/javascript">
  $(function(){
      $("#but_getjson").click(function(){
          var sid=$("input[name='sid']").val();
          alert(sid);
          myajax("GET","<core:url value='/test/json?sid="+sid+"'/>",null,true,function(v){
              v=eval("("+v+")");
              alert(v);
              $("#span_2").text(v.sname);
          });
      });
  });

  </script>
<body>
  <span id="span_1"></span>
  请输入学号：<input type="text" name="sid"/><br/>
  <input type="button" id="but_getjson" name="getjson" value="测试获取JSON"/><br/>
  <span id="span_2"></span>
</body>
</html>