<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
    <script type="text/javascript" src="<core:url value='/js/jquery-1.6.4.min.js'/>"></script>
    <script type="text/javascript">
        function animation(){//让mover动起来（动画效果）
            $("#mover").slideToggle(3000,animation);
        }
        $(function(){//页面全部加载后注册事件
            animation();
        
            $("#reset").click(function() {
                $("*").removeAttr("style");//只能移除标签的style属性，但不影响css选择器添加的样式
                $(".hide").css("display","none");//让隐藏的继续隐藏
            });
            
            $("#btn1").click(function() {//为id为btn1的按钮注册事件
			    $("div:contains(di)").css("backgroundColor", "red");//改变含有文本‘di’的div元素的背景色
			});
            
            $("#btn2").click(function() {//为id为btn2的按钮注册事件
                $("div:empty").css("backgroundColor", "blue");//改变不包含子元素(或者文本元素)的div元素的背景色
            });
            
            $("#btn3").click(function() {//为id为btn2的按钮注册事件
                $("div:has(.bgRed)").css("backgroundColor", "green");//改变含有class为bgRed元素的div元素的背景色
            });
            
            $("#btn4").click(function() {//为id为btn2的按钮注册事件
                $("div:parent").css("backgroundColor", "black");//改变含有子元素(或者文本元素)的div元素的背景色
            });
        });
    </script>
</head>
<body>
  <!-- 控制按钮 -->
  <input id="reset" type="button" value="重置所有样式"></br>
  <input id="btn1" type="button" value="改变含有文本‘di’的div元素的背景色"/>
  <input id="btn2" type="button" value="改变不包含子元素(或者文本元素)的div元素的背景色"/>
  <input id="btn3" type="button" value="改变含有class为bgRed元素的div元素的背景色"/>
  <input id="btn4" type="button" value="改变含有子元素(或者文本元素)的div元素的背景色"/><br/>
  
  <!-- 测试元素 -->
  <span >span元素.</span>
  <div class="one" id="one"   style="color:red;">
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
  <div class="hide">class="hide"我是隐藏的div</div>
  <span id="mover">正在执行动画的span元素.</span>
  <div></div>
</body>
</html>