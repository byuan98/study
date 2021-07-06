package code;

import java.util.*;

public class ClassCompareOne {
//  ���ʹһ������пɱȽ���(1)
    public static void main(String[] args) {
        Staff s1 = new Staff("Godfery", 18, 15000.0);
        Staff s2 = new Staff("Tom", 19, 10000.0);
        Staff s3 = new Staff("echo", 13, 15000.0);

        // ��ͨ�Ƚ�
        System.out.println("s1.compareTo(s2):" + (s1.compareTo(s2) > 0 ? true : false));
        System.out.println("s2.compareTo(s3):" + (s2.compareTo(s3) > 0 ? true : false));
        System.out.println("s3.compareTo(s1):" + (s3.compareTo(s1) > 0 ? true : false));

        // ����Ϊ����ʵ��Comparable�ӿڲ�ʵ�ֵ�int compareTo(T o)�������б�����������(ʵ��������)��������
        ArrayList<Staff> company = new ArrayList();
        company.add(s1);
        company.add(s2);
        company.add(s3);
        System.out.println(company);

        Collections.sort(company);
        System.out.println(company);

    }
}

//����1:����ʵ��Comparable�ӿ�,��ʵ��int compareTo(T o)����
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

    // ʵ��Comparable��compareTo����(�õ�ǰ���������������бȽ�),�ƶ��ȽϹ���
    public int compareTo(Staff s) {
        if (this.age != s.age) {// �������:�Ȱ�����
            return this.age - s.age;
        }
        if (this.salary != s.salary) {// �ٰ�����
            return (int) (this.salary - s.salary);
        }
        return this.name.compareTo(s.name);// �������
    }
}