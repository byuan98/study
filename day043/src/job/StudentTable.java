package job;

import java.util.*;
import java.io.*;

public class StudentTable {

    public static void main(String[] args) throws FileNotFoundException {
        Student s1 = new Student("Godfery", "man", 99.9);
        Student s2 = new Student("Tom", "man", 66.66);
        Student s3 = new Student("Echo", "woman", 66.66);
        Student s4 = new Student("Jreey", "man", 80.3);
        Student s5 = new Student("Page", "woman", 80.5);
        ArrayList<Student> school = new ArrayList();
        school.add(s1);
        school.add(s2);
        school.add(s3);
        school.add(s4);
        school.add(s5);
        Collections.sort(school);
        Collections.reverse(school);
        System.out.println(school);

        File file = new File("D:\\Code\\Java\\study\\day43\\src\\job\\????.txt");
        PrintWriter in = new PrintWriter(file);
        for (Student stu : school) {
            in.write(stu.toString() + "\t\n");
            in.flush();
        }
        in.close();
    }
}

class Student implements Comparable<Student> {
    private String name;
    private String sex;
    private Double score;

    Student(String name, String sex, Double score) {
        this.name = name;
        this.sex = sex;
        this.score = score;
    }

    public String toString() {
        return this.name + " " + this.sex + " " + this.score;
    }

    public int compareTo(Student stu) {
        if (this.score != stu.score) {
            return (int) ((this.score - stu.score) * 1000);
        }
        if (this.sex == "woman" && stu.sex == "man") {
            return 1;
        } else if (this.sex == "man" && stu.sex == "woman") {
            return -1;
        }
        return 0;
    }
}
