package code;

public class ObjectHashCodeDemo {
//Object���÷���1��int hashCode() ��ȡ��ǰ�����ʮ�����ڴ��ַ
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("Godfery");
        stu1.setAge(18);
        stu1.setSex('��');
        int address = stu1.hashCode();
        System.out.println("��ǰ�����ʮ�����ڴ��ַ�ǣ�" + address);
        System.out.println("��ǰ�����ʮ�����ڴ��ַ�ǣ�" + stu1.hashCode());
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