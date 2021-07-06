package advice;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class MyExceptionAdvice implements ThrowsAdvice{
    public void afterThrowing(Method arg0, Object[] arg1, Object arg2, Exception e) {
//        参数:Method arg0//方法对象
//        参数:Object[] arg1//参数列表
//        参数:Object arg2//目标对象
//        参数:Exception e//异常
        System.out.println(arg0.getName()+"出现异常了,异常原因是:"+e.getMessage());
    }

}
