package code;

public class ObjectHashCodeDemo {
//Object常用方法1：int hashCode() 获取当前对象的十进制内存地址
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("Godfery");
        stu1.setAge(18);
        stu1.setSex('男');
        int address = stu1.hashCode();
        System.out.println("当前对象的十进制内存地址是：" + address);
        System.out.println("当前对象的十进制内存地址是：" + stu1.hashCode());
    }
}

class Student {
    private String name;
    private int age;
    private char sex;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public char getSex() {
        return this.sex;
    }
}