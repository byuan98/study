package code;

import java.util.*;

public class ClassCompareTwo {
//  如何使一个类具有可比较性(2)
    public static void main(String[] args) {
        Clerk c1 = new Clerk("Godfery", 18, 15000.0);
        Clerk c2 = new Clerk("Tom", 19, 10000.0);
        Clerk c3 = new Clerk("echo", 13, 15000.0);

        // 普通比较
        ClerkComparator cc1 = new ClerkComparator();
        System.out.println(new ClerkComparator().compare(c1, c2));
        System.out.println(cc1.compare(c2, c3));
        System.out.println(cc1.compare(c3, c1));

        // 利用为此类定义的比较器类对列表内引用数据(实例化对象)进行排序
        ArrayList<Clerk> company = new ArrayList();
        company.add(c1);
        company.add(c2);
        company.add(c3);
        System.out.println(company);

        company.sort(new ClerkComparator());
        System.out.println(company);

        Collections.sort(company, new ClerkComparator());
        System.out.println(company);
    }

}

//方法2:为此类定义一个比较器类实现接口Comparator并实现方法int compare(T o1, T o2)
class Clerk {
    private String name;
    private Integer age;
    private Double salary;

    Clerk(String name, Integer age, Double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Double getSalary() {
        return salary;
    }

    public String toString() {
        return "name:" + this.name + ",age:" + this.age + ",salary:" + this.salary;
    }
}

//方法2:为此类定义一个比较器类实现接口Comparator并实现方法int compare(T o1, T o2)
class ClerkComparator implements Comparator<Clerk> {
    public int compare(Clerk c1, Clerk c2) {
        if (c1.getAge() != c2.getAge()) {// 排序规则:先按年龄
            return c1.getAge() - c2.getAge();
        }
        if (c1.getSalary() != c2.getSalary()) {// 再按工资
            return (int) (c1.getSalary() - c2.getSalary());
        }
        return c1.getName().compareTo(c2.getName());// 最后按姓名
    }
}