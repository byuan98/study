package code;

import java.util.*;

public class ClassCompareTwo {
//  ���ʹһ������пɱȽ���(2)
    public static void main(String[] args) {
        Clerk c1 = new Clerk("Godfery", 18, 15000.0);
        Clerk c2 = new Clerk("Tom", 19, 10000.0);
        Clerk c3 = new Clerk("echo", 13, 15000.0);

        // ��ͨ�Ƚ�
        ClerkComparator cc1 = new ClerkComparator();
        System.out.println(new ClerkComparator().compare(c1, c2));
        System.out.println(cc1.compare(c2, c3));
        System.out.println(cc1.compare(c3, c1));

        // ����Ϊ���ඨ��ıȽ�������б�����������(ʵ��������)��������
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

//����2:Ϊ���ඨ��һ���Ƚ�����ʵ�ֽӿ�Comparator��ʵ�ַ���int compare(T o1, T o2)
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

//����2:Ϊ���ඨ��һ���Ƚ�����ʵ�ֽӿ�Comparator��ʵ�ַ���int compare(T o1, T o2)
class ClerkComparator implements Comparator<Clerk> {
    public int compare(Clerk c1, Clerk c2) {
        if (c1.getAge() != c2.getAge()) {// �������:�Ȱ�����
            return c1.getAge() - c2.getAge();
        }
        if (c1.getSalary() != c2.getSalary()) {// �ٰ�����
            return (int) (c1.getSalary() - c2.getSalary());
        }
        return c1.getName().compareTo(c2.getName());// �������
    }
}