package test;

public class TestOne {
//  object类
    public static void main(String[] args) {
        People p1 = new People("Godfery", 18, "Man");
        People p2 = new People();
        p2.setName("Godfery");
        p2.setAge(20);
        p2.setSex("Woman");
        System.out.println(p1.equals(p2));
        System.out.println(p1);

        System.out.println(p1.hashCode());
        Class c = p1.getClass();
        System.out.println(p1.getClass());
        System.out.println(c);

        System.out.println(p1.getClass());
    }
}

//重写toString与eques方法
class People {
    private String name;
    private int age;
    private String sex;

    People() {

    }

    People(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String setName() {
        return this.name;
    }

    public int setAge() {
        return this.age;
    }

    public String setSex() {
        return this.sex;
    }

    public String toString() {
        return "我的名字叫" + this.name + ",性别:" + this.sex + ",今年" + this.age + "岁";
    }

    public boolean equals(Object obj) {
        if (obj instanceof People) {
            People p = (People) obj;
            return this.name.equals(p.name) && this.sex.equals(p.sex);
        }
        return false;
    }
}