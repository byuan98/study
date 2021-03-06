function myajax(type, url, data, async, fn){
//参数1：请求类型
//参数2：请求的url
//参数3：请求参数
//参数4：是否异步
//参数5：回调函数

//1、获取xmlhttprequest对象
    var xmlHttpRequest=getXmlHttpRequest();
    
//3、创建连接
    xmlHttpRequest.open(type, url, async);
    if(type=='POST' || type=='post'){
        xmlHttpRequest.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
    }
//2、监听事件
    xmlHttpRequest.onreadystatechange=function(){
        if(xmlHttpRequest.readyState==4&&xmlHttpRequest.status==200){
            fn(xmlHttpRequest.responseText);//responseText：返回字符串形式的响应
        }
    }

//4、发送请求
    xmlHttpRequest.send(data);
}

function getXmlHttpRequest(){
    try{
        return xmlHttpRequest=new XMLHttpRequest();//非IE浏览器的获取方式
    }catch(e){
        try{
            return xmlHttpRequest=new ActiveXObject("Microsoft.XMLHTTP");//IE5以后的浏览器
        }catch(e){
            return xmlHttpRequest=new ActiveXObject("Msxm12.XMLHTTP");//IE5以前的浏览器
        }
    }
}