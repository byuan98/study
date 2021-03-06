package advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.sun.net.httpserver.Authenticator.Result;
@Component("myadvice")
@Aspect //切面注解
public class MyAdvice {
    
    @Pointcut("execution(* entity.*.*(..))")
    public void myPointCut1() {};//方法名即为切入点的id
    
//    后置通知
    @After("myPointCut1()")
    public void afterAdvice1(JoinPoint jp) {
        System.out.println("afterAdvice1(JoinPoint jp)-->"+jp.getSignature().getName());
    }
    
//    返回通知
    @AfterReturning(value="myPointCut1()",returning="resule")
    public void afterAdvice2(Object resule) {
        System.out.println("afterAdvice2(Object resule)-->"+resule);
    }
    
//    前置通知
    @Before("myPointCut1()")
    public void beforeAdvice(JoinPoint jp) {
        System.out.println("beforeAdvice(JoinPoint jp)-->"+jp.getSignature().getName());
    }
    
//    环绕通知
    @Around("myPointCut1()")
    public Object aroundAdvice(ProceedingJoinPoint pjp) {
        System.out.println("aroundAdvice(ProceedingJoinPoint pjp)-->1");
        Object result;
        try {
            result=pjp.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        System.out.println("aroundAdvice(ProceedingJoinPoint pjp)-->2");
        return result;
    }
    
//    异常通知
    @AfterThrowing(value="myPointCut1()",throwing="e")
    public void throwAdvice(Exception e) {
        System.out.println("throwAdvice(Exception e)-->"+e);
    }
}
