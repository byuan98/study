package advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAroundAdvice implements MethodInterceptor{
//    AroundAdvice:添加在目标方法之前和之后的辅助功能
    public Object invoke(MethodInvocation arg0) throws Throwable {
//        参数:MethodInvocation arg0//拦截器对象
//        方法:arg0.getArguments()//获取方法参数列表
//        方法:arg0.getMethod()//获取目标方法
//        方法:arg0.getThis()//获取目标对象
        System.out.println(arg0.getMethod().getName()+"方法将要运行!好好学习不要跑题");
        Object result=arg0.proceed();//方法运行
        System.out.println(arg0.getMethod().getName()+"方法运行结束,一寸光阴一寸金,休息完了就好好学习吧");
        return result;
    }
}
