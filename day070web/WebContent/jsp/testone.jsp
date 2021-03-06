<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>JQuery之选择器</title>
    <script type="text/javascript" src="<core:url value='/js/jquery-1.6.4.min.js'/>"></script>
  <style type="text/css">
	div,span,p{
	  width:140px;
	  height:140px;
	  margin:5px;
      background:#aaa;
      border:#000 1px solid;
	  float:left;
	  font-size:17px;
	}
	div.bgRed { 
	  width:55px;
	  height:55px;
	  background-color: #aaa;
	  font-size:12px;
	}
	div.hide { 
	  display:none;
	}
	</style>
  </head>
  <body>
  <!--
    选择器1：基本选择器
    1.1：*//通配符选择器
    1.2：#id值//id选择器
    1.3：.class值//类选择器
    1.4：标签名//标签选择器
    1.5：选择器1,选择器2,选择器3...//组合选择器
  -->
  
  <!-- 测试的元素 -->
    <div class="one" id="one" >
        id为one,class为one的div
        <div class="bgRed">class为bgRed的div</div>
    </div>
    <div class="one">
        class为one的div
        <div class="bgRed">class为bgRed</div>
        <div class="bgRed">class为bgRed</div>
    </div>
    <div class="one" id="two" >
        id为two,class为one的div
        <div class="bgRed">class为bgRed的div</div>
    </div>
    <span id="mover">正在执行动画的span元素.</span>
    
    <script type="text/javascript">
      $(function(){//等价于window.onload=function(){}
    	  //$("*").css("background-color" ,"red");//$:获取元素;在JQuery中,$与JQuery完全等价
    	  //$("#one").css("background-color" ,"blue");
    	  //$(".one").css("background-color" ,"green");
    	  //$("div").css("background-color", "red");
    	  //$("div,span").css("background-color", "red");
    	  
      })
    </script>
    <!--
    选择器1：基本选择器
    1.1：*//通配符选择器
    1.2：#id值//id选择器
    1.3：.class值//类选择器
    1.4：标签名//标签选择器
    1.5：选择器1,选择器2,选择器3...//组合选择器
  -->
  </body>
</html>