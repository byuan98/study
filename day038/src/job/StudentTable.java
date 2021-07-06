package job;

import java.util.*;

public class StudentTable {
//  ����һ��Student��,����:ѧ�š����֡��������Ա�
//  ����һ��mapװ10��ѧ��:ѧ������,ѧ����ֵ
//  ��ȡ����Ů����ƽ����;
//  ɾ��map�з���С��30��ѧ��
    public static void main(String[] args) {
//      HashMap<Integer,HashMap> school=new HashMap();
//		һ��ʹ�ü���ʱ,���ö�ʱ�ӿ�����,������ʾ,
//		�������ĺô��������Map�ĸ��õĿ�����,���ʹӱ�����ΪHashMap��Ϊ��Map��ʵ����Ķ��ֿ���
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

        Set<Integer> keys = school.keySet();// ��ȡ���еļ�
        Double sum = 0.0;
        Integer count = 0;
        for (Integer i : keys) {
            HashMap stu = school.get(i);// ͨ������ȡֵ,��Ϊ�����ֵҲ��HashMap���͵�������ͬ�����������ͽ���
//			System.out.println(stu.get("sSex"));
            if (stu.get("sSex") == "woman") {// ���ѧ������HashMap��ֵΪwoman�����ƽ��ֵ����
                sum += (Double) stu.get("sScore");
                count++;
            }
        }
        System.out.println("Ů����ƽ����Ϊ" + sum / count);

        HashMap schoolCopy = new HashMap();// ��Ϊforeach�в��ܶ�HashMap����remove����,�������Ǵ���һ���µ�HashMap����װ����ɼ�����30�ֵ�ѧ��
        for (Integer i : keys) {
            HashMap stu = school.get(i);// ͨ������ȡֵ,��Ϊ�����ֵҲ��HashMap���͵�������ͬ�����������ͽ���
            if ((Double) stu.get("sScore") < 30) {
                continue;// ����ɼ�С��30������
            }
            schoolCopy.put(i, school.get(i));// �������30,�򽫸�ѧ����������������������Է����µ�HashMap��

        }
        school = schoolCopy;// �þɵ�HashMap(school)ָ���µ�HashMap(schoolCopy)
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
