<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>使用JSON依赖的JAR拼凑JSON格式的字符串</title>
</head>
    <script type="text/javascript" src="<core:url value='/js/myajax.js'/>"></script>
    <script type="text/javascript" src="<core:url value='/js/jquery-1.6.4.min.js'/>"></script>
    <script type="text/javascript">
        $(function(){
            $("#but_all").click(function(){
                myajax("GET","<core:url value='/json/test?n="+2+"'/>",null,true,function(array){
                	array=eval("("+array+")");//把json的字符串解析为json对象
                    for(var index=0;index<array.length;index++){
                    	var obj=array[index];
	                	var $tr=$("<tr></tr>");
	                    $tr.append("<td>"+obj.sid+"</td>");
	                    $tr.append("<td>"+obj.sname+"</td>");
	                    $tr.append("<td>"+obj.teacher.tid+"</td>");
	                    $tr.append("<td>"+obj.teacher.tname+"</td>");
	                    $("#tab_2").append($tr);	                    	
	                }
                });     
            });
        });
    </script>
<body>
    <h1>获取多个学生</h1>
    <table id="tab_2">
        <tr>
            <th>学号</th><th>姓名</th><th>分数</th><th>老师</th>
        </tr>
    </table>
    <input type="button" value="getAll" id="but_all"/>
</body>
</html>