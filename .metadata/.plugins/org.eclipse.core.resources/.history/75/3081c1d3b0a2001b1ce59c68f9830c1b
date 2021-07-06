package job;

public class TeacharClass {
//	创建一个老师类:属性:名字、年龄、性别、工资、所有属性私有化封装   
//	重写toString方法:打印内容如:我叫韩寒 是一名男老师 今年30岁 每月工资是1000元  
//	重写equals方法:要求当名字相同、性别相同、年龄相差1岁以内、工资相差100元以内为同一个人 
//	提供两个构造方法:一个有参数的给所有属性赋值  
//	一个无参数的:所有属性都随机  
//	名字随机4个字符(数字+字母) 
//	工资(3000.0-5000.0)年龄(30-40)性别(男-女) 
    public static void main(String[] args) {
        Teachar t1 = new Teachar();
        System.out.println(t1);
        Teachar t2 = new Teachar("Godfery", 18, '男', 3000);
        Teachar t3 = new Teachar("Godfery", 19, '男', 3100);
        Teachar t4 = new Teachar("Godfery", 17, '男', 3001);
        Teachar t5 = new Teachar("Tom", 19, '男', 3100);
        Teachar t6 = new Teachar("Tom", 20, '男', 3101);
        Teachar t7 = new Teachar("Godfery", 20, '男', 2999);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t2 + "vs" + t3 + "\n" + t2.equals(t3));
        System.out.println(t2 + "vs" + t4 + "\n" + t2.equals(t4));
        System.out.println(t2 + "vs" + t5 + "\n" + t2.equals(t5));
        System.out.println(t2 + "vs" + t6 + "\n" + t2.equals(t6));
        System.out.println(t2 + "vs" + t7 + "\n" + t2.equals(t7));
    }
}

class Teachar {
    private String name;
    private int age;
    private char sex;
    private double wage;

    Teachar() {
        this.name = randomName();
        this.age = (int) Math.rint(Math.random() * 10 + 30);
        this.sex = (int) (Math.random() * 2) == 1 ? '男' : '女';
        this.wage = (int) (Math.rint(Math.random() * 20000 + 30000)) / 10.0;
    }

    Teachar(String name, int age, char sex, double wage) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    private static String randomName() {
        String str = "";
        for (int index = 0; index < 4; index++) {
            int option = (int) (Math.random() * 3);
            if (option == 0) {
                str += (int) (Math.random() * 10);
            } else if (option == 1) {
                str += (char) (Math.random() * 26 + 65);
            } else {
                str += (char) (Math.random() * 26 + 97);
            }
        }
        return str;
    }

    public String toString() {
        return "我叫" + this.name + " 是一名" + this.sex + "老师 今年" + this.age + "岁 每月工资是" + this.wage + "元";
    }

    public boolean equals(Object obj) {
        if (obj instanceof Teachar) {
            Teachar t = (Teachar) obj;
            return this.name.equals(t.name) && this.sex == t.sex && Math.abs(this.age - t.age) <= 1
                    && Math.abs(this.wage - t.wage) <= 100;
        }
        return false;
    }
}
