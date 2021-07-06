package code;

public class ObjectGetClassDemo {
//Object常用方法2：Class getClass() 获取当前类的字节码文件对象(class文件)
    public static void main(String[] args) {
        People p1 = new People();
        p1.setName("Godfery");
        p1.steAge(18);

        System.out.println(p1.getClass());// 打印的是p1的类(class code.People)
        Class c1 = p1.getClass();
        System.out.println(c1);

        // 关于Class类的两个方法：
        // 1、String getName() 获取类的全称：包名.类名
        System.out.println(c1.getName());

        // 2、String getSimpleName() 获取类名
        System.out.println(c1.getSimpleName());

    }
}

class People {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void steAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}