package job;

import java.util.*;

public class StudentTable {
//  创建一个Student类,属性:学号、名字、分数、性别
//  创建一个map装10个学生:学号做键,学生做值
//  获取所有女生的平均分;
//  删除map中分数小于30的学生
    public static void main(String[] args) {
//      HashMap<Integer,HashMap> school=new HashMap();
//		一般使用集合时,引用都时接口类型,如下所示,
//		这样做的好处是提高了Map的复用的可能性,类型从被局限为HashMap变为了Map下实现类的多种可能
        Map<Integer, HashMap> school = new HashMap();

        Student s1 = new Student("Godfery", "man", 99.99);
        Student s2 = new Student("Jeey", "woman", 20.0);
        Student s3 = new Student("Luna", "woman", 20.0);
        Student s4 = new Student("Sun", "Man", 50.0);
        Student s5 = new Student("Anna", "Man", 29.99);
        Student s6 = new Student("Jolie", "woman", 63.0);
        Student s7 = new Student("Ada", "Man", 60.0);
        Student s8 = new Student("Ella", "woman", 80.0);
        Student s9 = new Student("Brook", "Man", 70.6);
        Student s10 = new Student("Cheryl", "Man", 55.55);

        school.put(s1.getSId(), s1.getInformation());
        school.put(s2.getSId(), s2.getInformation());
        school.put(s3.getSId(), s3.getInformation());
        school.put(s4.getSId(), s4.getInformation());
        school.put(s5.getSId(), s5.getInformation());
        school.put(s6.getSId(), s6.getInformation());
        school.put(s7.getSId(), s7.getInformation());
        school.put(s8.getSId(), s8.getInformation());
        school.put(s9.getSId(), s9.getInformation());
        school.put(s10.getSId(), s10.getInformation());

        Set<Integer> keys = school.keySet();// 获取所有的键
        Double sum = 0.0;
        Integer count = 0;
        for (Integer i : keys) {
            HashMap stu = school.get(i);// 通过键获取值,因为这里的值也是HashMap类型的所以用同样的数据类型接收
//			System.out.println(stu.get("sSex"));
            if (stu.get("sSex") == "woman") {// 如果学生属性HashMap的值为woman则进行平均值计算
                sum += (Double) stu.get("sScore");
                count++;
            }
        }
        System.out.println("女生的平均分为" + sum / count);

        HashMap schoolCopy = new HashMap();// 因为foreach中不能对HashMap进行remove操作,所以我们创建一个新的HashMap用于装满足成绩大于30分的学生
        for (Integer i : keys) {
            HashMap stu = school.get(i);// 通过键获取值,因为这里的值也是HashMap类型的所以用同样的数据类型接收
            if ((Double) stu.get("sScore") < 30) {
                continue;// 如果成绩小于30就跳过
            }
            schoolCopy.put(i, school.get(i));// 如果大于30,则将该学生的主键和主键代表的属性放入新的HashMap中

        }
        school = schoolCopy;// 让旧的HashMap(school)指向新的HashMap(schoolCopy)
        System.out.println(school);
    }
}

class Student {
    private static Integer sIdPool = 2021001;
    private final Integer sId;
    private String sName;
    private String sSex;
    private Double sScore;

    Student(String sName, String sSex, Double sScore) {
        sId = sIdPool;
        sIdPool++;
        this.sName = sName;
        this.sSex = sSex;
        this.sScore = sScore;
    }

    public Integer getSId() {
        return this.sId;
    }

    HashMap getInformation() {
        HashMap studentInformation = new HashMap();
        studentInformation.put("sName", this.sName);
        studentInformation.put("sSex", this.sSex);
        studentInformation.put("sScore", this.sScore);
        return studentInformation;
    }

}
