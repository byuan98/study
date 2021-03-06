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
    <h1 align="center">SpringMVC操作json</h1>
    <h1 align="center">响应是json</h1>
    <input type="button" value="响应是json" id="but_responseJson"/>
    <script type="text/javascript">
        $(function(){
        	$("#but_responseJson").bind("click",function(){
        		$.ajax({
        			url:"<core:url value='/test2/method1.action'/>", /*请求的url*/
        			success:function(data){
        				alert(data);
        				alert(data.stuname+"::"+data.stuscore);
        			},/*成功后的回调函数*/
        			type:"GET",/*请求的方式*/
        			dataType:"json",/*请求期待的响应数据类型*/
        			async:true,/*是否异步true*/
        			cache:false/*是否使用缓存,默认false*/
        		});
        	});	
        });
    </script>
    
    <h1 align="center">请求是json(java不识别json,只能发json串)</h1>
    <input type="button" value="请求是json" id="but_requestJson1"/>
    <script type="text/javascript">
        $(function(){
        	$("#but_requestJson1").bind("click",function(){
        		//响应是json
        		var dataJson='{"stuname":"Echo","stuscore":90.5}'; /*这里注意一定要是单引号包裹*/
        		$.ajax({
        			url:"<core:url value='/test2/method2.action'/>", /*请求的url*/
        			success:function(data){
        				alert(data);
        			},
                    type:"POST",/*请求的方式*/
                    dataType:"text",/*请求期待的响应数据类型*/
                    contentType:"application/json;charset=utf-8",/*请求参数是json:必须设置请求头contentType*/
                    data:dataJson,/*请求的参数*/
                    async:true,/*是否异步true*/
                    cache:false/*是否使用缓存,默认false*/
        		});
        	});
        });
    </script>
    
    <h1 align="center">请求是json(java不识别json,只能发json串)</h1>
    <input type="button" value="请求是json" id="but_requestJson2"/>
    <script type="text/javascript">
        $(function(){
            $("#but_requestJson2").bind("click",function(){
                //响应是json
                var dataJson='{"stuname":"Ali","stuscore":89.6}'; /*这里注意一定要是单引号包裹*/
                $.ajax({
                    url:"<core:url value='/test2/method3.action'/>", /*请求的url*/
                    success:function(data){
                        alert(data);
                    },
                    type:"POST",/*请求的方式*/
                    dataType:"text",/*请求期待的响应数据类型*/
                    contentType:"application/json;charset=utf-8",/*请求参数是json:必须设置请求头contentType*/
                    data:dataJson,/*请求的参数*/
                    async:true,/*是否异步true*/
                    cache:false/*是否使用缓存,默认false*/
                });
            });
        });
    </script>
    
    <h1 align="center">请求是json+响应也是json</h1>
    <input type="button" value="请求是json" id="but_requestJson3"/>
    <script type="text/javascript">
        $(function(){
            $("#but_requestJson3").bind("click",function(){
                //响应是json
                var dataJson='{"stuname":"Tom","stuscore":79.5}'; /*这里注意一定要是单引号包裹*/
                $.ajax({
                    url:"<core:url value='/test2/method4.action'/>", /*请求的url*/
                    success:function(data){
                        alert(data);
                        alert(data.stuname+"::"+data.stuscore);
                    }, /*成功后的回调函数*/
                    type:"POST",/*请求的方式*/
                    dataType:"text",/*请求期待的响应数据类型*/
                    contentType:"application/json;charset=utf-8",/*请求参数是json:必须设置请求头contentType*/
                    data:dataJson,/*请求的参数*/
                    async:true,/*是否异步true*/
                    cache:false/*是否使用缓存,默认false*/
                });
            });
        });
    </script>
</body>
</html>