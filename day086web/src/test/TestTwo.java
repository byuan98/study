package test;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class TestTwo {

    public static void main(String[] args) {
//        6、创建目标对象
        Teacher tea=new Teacher("Godfery");
        
//        7、创建代理工厂对象并关联目标对象
        CglibProxyFactory factory=new CglibProxyFactory(tea);
        
//        8、通过工厂对象的getInstance的方法获取代理对象
        Teacher teaProxy=(Teacher)factory.getInstance();
        teaProxy.add(1, 4);
        teaProxy.work();
    }

}


class Teacher{//1、创建目标对象的类
    String teaname;
    Teacher(){}
    Teacher(String teaname){
        this.teaname=teaname;
    }
    public Integer add(Integer number1, Integer number2) {
        System.out.println("目标对象的add方法:"+number1+"+"+number2);
        return number1+number2;
    }
    public void work() {
        System.out.println("目标对象的work方法");
    }
}

//2、创建代理工厂类,实现MethodInterceptor接口
class CglibProxyFactory implements MethodInterceptor{
    private Object target;
    public CglibProxyFactory(Object target) {//3、通过构造方法关联目标对象
        this.target=target;
    }
    
//    4、实现intercept方法,代理对象的方法调用时,会被intercept方法拦截,进而来调用目标对象的方法

    public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
        String methodName=arg1.getName();
        Object result=null;
        if(methodName.equals("add")) {
            System.out.println("代理对象的add方法:"+arg2[0]+"+"+arg2[1]+"="+((Integer)arg2[0]+(Integer)arg2[1]));
            result=arg1.invoke(target, arg2);
        }else {
            result=arg1.invoke(target, arg2);
            System.out.println("代理对象的work方法");
        }
        return result;
    }
    
//    5、写一个获取代理对象
    public Object getInstance() {
        Enhancer en=new Enhancer();//创建一个增强工具类对象
        en.setSuperclass(target.getClass());//设置父类
        en.setCallback(this);//设置回调函数的对象
        return en.create();//创建代理对象(是目标类的子类对象)
    }
}