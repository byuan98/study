package code;

public class InnerCode {
//  内部类:类中定义的类
    public static void main(String[] args) {
        // 内部类分为以下几种:
        // 1、成员内部类(内部类是外部类的成员);
        System.out.println("成员内部类示例:");
        {
            Outer1 o1 = new Outer1();
            Outer1.Inner1 i1; // 定义成员内部类引用
            i1 = o1.new Inner1(); // 创建内部类对象:通过外部类对象来创建内部类对象
            i1.show();
        }
        System.out.println("--------------------");
        // 2、静态内部类(内部类是外部类的静态成员);
        System.out.println("静态内部类示例:");
        {
            Outer2.Inner2 i2;// 定义静态内部类引用
            i2 = new Outer2.Inner2();// 创建静态内部类对象
            i2.show();
        }
        System.out.println("--------------------");
        // 3、局部内部类(在方法体/代码块中定义的类);
        System.out.println("局部内部类示例:");
        {
            // Inner3_2类的对象只能在其存在的方法中创建
            new Outer3().innerClass(); // new Outer3()没有定义引用,我们将这种写法称之为匿名对象
        }
        System.out.println("--------------------");
        // 4、匿名内部类(没有定义名字的内部类,无法再次创建对象);
        System.out.println("匿名内部类示例:");
        {
            // 匿名内部类的使用场景:假如现在有这样的一个需求:
            // 调用抽象类Fu的show方法(抽象类无法实例化对象,所以一般来说不能直接调用实例成员:show方法)

            // 方式1:创建抽象类的子类,通过子类对象调用show方法
            Fu f1 = new Zi();
            f1.show();

            // 方式2:使用匿名内部类
            Fu f2 = new Fu() {
                void hello() {
                    System.out.println("Hello");
                }
            };
            f2.show();
        }
    }
}

//内部类之成员内部类
class Outer1 {
    String name = "外部类name";

    class Inner1 {// 成员内部类
        String name = "成员内部类name";

        void show() {
            String name = "局部变量name";
            System.out.println("name=" + name);// 就近原则,局部变量name;
            System.out.println("this.name=" + this.name);// 内部类name;
            System.out.println("Outer1.this.name" + Outer1.this.name);// 外部类name;
        }
    }
}

//内部类之静态内部类
class Outer2 {
    String name = "外部类name";
    static String logo = "外部类静态成员logo";

    static class Inner2 {
        String name = "静态内部类name";

        void show() {
            String name = "局部变量name";
            System.out.println("name=" + name);// 就近原则,局部变量name;
            System.out.println("this.name=" + this.name);// 静态内部类name;
            // System.out.println("Outer2.this.name"+Outer2.this.name);//静态内部类不能直接调用外部类的非静态成员
            System.out.println("Outer2.logo" + Outer2.logo);// 外部类静态成员logo
        }
    }
}

//内部类之局部内部类
class Outer3 {
    {// 第一种:写在构造代码块中的内部类
        class Inner3_1 { // 局部内部类
        }
    }
    String name = "外部类name";

    void innerClass() {// 第二种:在方法体中定义的类
        class Inner3_2 {// 局部内部类
            String name = "内部类name";

            void show() {
                String name = "局部变量name";
                System.out.println("name=" + name);// 局部变量name
                System.out.println("this.name" + this.name);// 内部类name
                System.out.println("Outer3.this.name" + Outer3.this.name);// 外部类name
            }
        }
        // Inner3_2类的对象只能在此方法中创建
        Inner3_2 i3_2;// 定义局部内部类引用
        i3_2 = new Inner3_2();// 创建局部内部类对象
        i3_2.show();
    }
}

//内部类之匿名内部类
abstract class Fu {
    abstract void hello();

    void show() {
        System.out.println("Fu类的show方法");
    }
}

class Zi extends Fu {
    void hello() {
        System.out.println("Hello");
    }
}