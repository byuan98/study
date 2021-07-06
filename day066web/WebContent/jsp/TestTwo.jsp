<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <%@ page import="java.util.*" %>
  <%@ page import="entity.Student" %>
  <%
    ArrayList<Student>list=new ArrayList();
    list.add(new Student(2021001,"Godfery","123456"));
    list.add(new Student(2021002,"Echo","234567"));
    list.add(new Student(2021003,"Tom","345678"));
    
    Map<String,Student>map=new HashMap();
    map.put("stu1",new Student(2021001,"Godfery","123456"));
    map.put("stu2",new Student(2021002,"Echo","234567"));
    map.put("stu3",new Student(2021003,"Tom","345678"));
    
    //EL只能操作域属性
    pageContext.setAttribute("list", list);
    session.setAttribute("map", map);
  %>
  list[0]=${list[0]}<br/><!-- entity.Student@73d5cbd0 -->
  list[0].sname=${list[0].sname}<br/><!-- Godfery -->
  
  map.stu1=${map.stu1}<br/><!-- 获取元素map.key  entity.Student@304ea95a -->
  map[stu2]=${map["stu2"]}<br/><!-- 获取元素map["key"]  entity.Student@53e7aaea-->
  map.stu1.sname=${map.stu1.sname}<br/><!-- 获取元素map["key"]中的元素  Godfery-->
</body>
</html>