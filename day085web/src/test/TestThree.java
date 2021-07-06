//package test;
//
//public class TestThree {    
//    @MyAnnotation1(name="Godfery", age=18)//注解的赋值方式:变量名=属性值
//    public static void showOne() {
//        
//    }
//    @interface MyAnnotation1{
//        String name();
//        int age();//不可使用包装类
//        float score() default 0;//默认值为0
//    }
//    
//    @MyAnnotation2(18)//当只有一个属性且该属性名为value时,value=可以省略
//    public static void showTwo() {
//        
//    }
//    @interface MyAnnotation2{
//        int value();
//    }
//    
//    @MyAnnotation3(age=18)//只有一个属性且该属性名不为value时,age=不可以省略
//    public static void showThree() {
//        
//    }
//    @interface MyAnnotation3{
//        int age();
//    }
//    
//    @MyAnnotation4(value=16,age=18)//存在两个属性,value=不可以省略
//    public static void showFour() {
//        
//    }
//    @interface MyAnnotation4{
//        int value();
//        int age();
//    }
//    
//    @MyAnnotation5(16)//存在两个属性(其中一个默认值),只为一个元素赋值value=可以省略
//    public static void showFive() {
//        
//    }
//    @MyAnnotation5(value=16,age=18)//存在两个属性(其中一个默认值),为两个元素赋值value=不可以省略
//    public static void showSix() {
//        
//    }
//    @interface MyAnnotation5{
//        int value();
//        int age() default 0;
//    }
//}
