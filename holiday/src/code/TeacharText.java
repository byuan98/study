package code;

public class TeacharText {
//	创建一个老师类：属性：名字 年龄 性别 工资  所有属性私有化封装   
//	重写toString方法：打印内容如： 我叫韩寒,是一名男老师,今年30岁,每月工资是1000元; 
//	重写equals方法 要求当名字相同 性别相同 年龄相差1岁以内 工资相差100元以内 为同一个人 
//	提供两个构造方法：一个有参数的给所有属性赋值  
//	一个无参数的：所有属性都随机  名字随机4个字符（数字+字母） 工资(3000.0-5000.0) 年龄(30-40) 性别(男-女)  
    public static void main(String[] args) {
        Teacher t = new Teacher("Godfery", 18, "男", 50000);
        Teacher t1 = new Teacher("Godfery", 19, "男", 49900);
        System.out.println(t);
        System.out.println(t1);
        System.out.println(t.equals(t1));

        Teacher t3 = new Teacher();
        System.out.println(t3);

    }

}

class Teacher {
    private String name = "";
    private int age;
    private String sex;
    private double wage;

    Teacher() {
        for (int number = 0; number < 4; number++) {
            int select = (int) (Math.random() * 3 + 1);
            if (select == 1) {
                this.name += (char) ((int) (Math.random() * 10 + 48));
            } else if (select == 2) {
                this.name += (char) ((int) (Math.random() * 26 + 97));
            } else {
                this.name += (char) ((int) (Math.random() * 26 + 65));
            }
        }
        this.age = (int) (Math.random() * 11 + 30);
        this.sex = (int) (Math.random() * 2 + 1) == 1 ? "男" : "女";
        this.wage = (int) (Math.random() * 20000 + 30000) / 10.0;
    }

    Teacher(String name, int age, String sex, double wage) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.wage = wage;
    }

    public String toString() {
        return "我叫" + this.name + "是一名" + this.sex + "老师,今年" + this.age + "岁,每月工资是" + this.wage + "元";
    }

    public boolean equals(Object obj) {
        if (obj instanceof Teacher) {
            Teacher t1 = (Teacher) obj;
            if (this.name.equals(t1.name) && this.sex.equals(t1.sex) && Math.abs(this.age - t1.age) <= 1
                    && Math.abs(this.wage - t1.wage) <= 100) {
                return true;
            }
        }
        return false;
    }
}