package advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class MyAfterAdvice implements AfterReturningAdvice{
//    AfterAdvice:添加在目标方法之后执行的辅助功能
    public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
//        参数:Object arg0//目标方法的返回值
//        参数:Method arg1//目标对象中的方法
//        参数:Object[] arg2//目标对象方法执行时传递的实参
//        参数:Object arg3//目标对象
        System.out.println(arg1.getName()+"运行结束！继续努力");
    }
}
