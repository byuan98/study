package code;

import java.util.*;

public class ClassCompareOne {
//  如何使一个类具有可比较性(1)
    public static void main(String[] args) {
        Staff s1 = new Staff("Godfery", 18, 15000.0);
        Staff s2 = new Staff("Tom", 19, 10000.0);
        Staff s3 = new Staff("echo", 13, 15000.0);

        // 普通比较
        System.out.println("s1.compareTo(s2):" + (s1.compareTo(s2) > 0 ? true : false));
        System.out.println("s2.compareTo(s3):" + (s2.compareTo(s3) > 0 ? true : false));
        System.out.println("s3.compareTo(s1):" + (s3.compareTo(s1) > 0 ? true : false));

        // 利用为此类实现Comparable接口并实现的int compareTo(T o)方法对列表内引用数据(实例化对象)进行排序
        ArrayList<Staff> company = new ArrayList();
        company.add(s1);
        company.add(s2);
        company.add(s3);
        System.out.println(company);

        Collections.sort(company);
        System.out.println(company);

    }
}

//方法1:让类实现Comparable接口,并实现int compareTo(T o)方法
class Staff implements Comparable<Staff> {
    private String name;
    private Integer age;
    private Double salary;

    Staff(String name, Integer age, Double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String toString() {
        return "name:" + this.name + ",age:" + this.age + ",salary:" + this.salary;
    }

    // 实现Comparable的compareTo方法(拿当前对象与参数对象进行比较),制定比较规则
    public int compareTo(Staff s) {
        if (this.age != s.age) {// 排序规则:先按年龄
            return this.age - s.age;
        }
        if (this.salary != s.salary) {// 再按工资
            return (int) (this.salary - s.salary);
        }
        return this.name.compareTo(s.name);// 最后按姓名
    }
}