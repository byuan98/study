package advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyBeforeAdvice implements MethodBeforeAdvice{
//    BeforeAdvice:添加在目标方法之前执行的辅助功能
    public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
//        参数:Method arg0//目标对象中的方法
//        参数:Object[] arg1//目标对象方法执行时传递的实参
//        参数:Object arg2//目标对象
        System.out.println(arg0.getName()+"开始运行!大家鼓励一下");
    }
}
