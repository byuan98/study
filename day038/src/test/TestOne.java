package test;

import java.util.*;

public class TestOne {
//  要求把10个Student添加到set中,如果学生名字相同,年龄相差五岁以内,为同一个人,不允许重复添加
    public static void main(String[] args) {
        HashSet<Student> school = new HashSet();
        System.out.println(school);
        Student s1 = new Student("Godfery", 15);
        Student s2 = new Student("Godfery", 11);
        Student s3 = new Student("Tom", 20);
        Student s4 = new Student("Tom", 21);
        Student s5 = new Student("Anny", 22);
        Student s6 = new Student("Anny", 23);
        Student s7 = new Student("Jeey", 24);
        Student s8 = new Student("Jeey", 25);
        Student s9 = new Student("Kim", 26);
        Student s10 = new Student("Kim", 27);

        school.add(s1);
        school.add(s2);
        school.add(s3);
        school.add(s4);
        school.add(s5);
        school.add(s6);
        school.add(s7);
        school.add(s8);
        school.add(s9);
        school.add(s10);

        System.out.println(school);
    }
}

class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int hashCode() {
        // return 1;//这种方法效率较低
        System.out.println(this.name.hashCode());
        return this.name.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            if (s.name.equals(this.name) && Math.abs(s.age - this.age) < 5) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return this.name;
    }

}
