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
                $("div:first").css("background-color", "#11aabb");//改变第一个div
                //$("div:last").css("background-color", "#11aabb");//改变最后一个div
                //$("div:eq(2)").css("background-color", "#11aabb");//改变第三个div
                //$("div:lt(4)").css("background-color", "#11aabb");//改变前四个div
                
			});
            
            $("#btn2").click(function() {//为id为btn2的按钮注册事件
                $("div:even").css("background-color", "#aa11bb");//改变偶数索引的div，索引从0开始
                //$("div:odd").css("background-color", "#aa11bb");//改变奇数索引的div，索引从0开始
			});
            
            $("#btn3").click(function() {//为id为btn3的按钮注册事件
            	$("div:not('.one')").css("background-color", "#bb11aa");//改变class值不等于one的div
			});
            
            $("#btn4").click(function() {//为id为btn4的按钮注册事件
                $("div:odd:eq(1)").css("background-color", "#11aabb");//改变索引为奇数，重新排列后，下标为1的元素
            });
            
            $("#btn5").click(function() {//为id为btn5的按钮注册事件
                $(":animated").css("background-color", "#bbaa11");//改变正在执行动画的元素
            });
            
            $("#btn6").click(function() {//为id为btn6的按钮注册事件
                $(":header").css("background-color", "#11bbaa");//设置标题标签
            });
        });
    </script>
</head>
<body>
<title>Insert title here</title>
  <!-- 控制按钮 -->
  <input id="reset" type="button" value="重置所有样式"></br>
  <input id="btn1" type="button" value="改变第一个<div>元素"/>
  <input id="btn2" type="button" value="改变索引值为偶数的div元素"/>
  <input id="btn3" type="button" value="改变class不为one的所有div元素"/>
  <input id="btn4" type="button" value="改变奇数索引为1的div元素"/>
  <input id="btn5" type="button" value="改变当前正在执行动画的所有元素"/>
  <input id="btn6" type="button" value="设置标题标签"/><br/>
  
  <!-- 测试元素 -->
  <h1>过滤选择器之基本过滤</h1>
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
</body>
</html>