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
    	$("#text_phone").blur(function(){
    		var $phone=$("#text_phone").val();
    		$.ajax({
    			type:"POST",
    			data:{phone:$phone},
    			cache:false,
    			async:true,
    			url:"<core:url value='/test/information'/>",
    			success:function(responseData){
    				if(responseData=="手机号格式错误"){
	    				$("#text_phone").val(responseData);
    				}
    			}
    		});
    	});
    });
</script>

<!-- <script type="text/javascript">
	$(function(){	
		$("#s").click(function(){
		    var $phone=$("#text_phone").val();
			if($phone.length==10){
				alert("123");
			}else{
				alert("1231");	
			}
		});	
	});
</script> -->
<body>
    <form action="">
	    <input type="text" id="text_phone"/>
	    <input type="button" id="s">  
    </form>
</body>
</html>