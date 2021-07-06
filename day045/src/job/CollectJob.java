package job;

import java.util.*;

public class CollectJob {

    public static void main(String[] args) throws Exception {
        Teacher teacher = Teacher.getTeacher();// ʵ����һ����ʦ��

        Student student1 = new Student(teacher);// ʵ�������ѧ����
        Student student2 = new Student(teacher);
        Student student3 = new Student(teacher);
        Student student4 = new Student(teacher);
        Student student5 = new Student(teacher);

        Thread stu1 = new Thread(student1, "��ͬѧ");// ��������߳��࣬ͨ�����췽����������ʵ�������
        Thread stu2 = new Thread(student2, "Ǯͬѧ");
        Thread stu3 = new Thread(student3, "��ͬѧ");
        Thread stu4 = new Thread(student4, "��ͬѧ");
        Thread stu5 = new Thread(student5, "��ͬѧ");

        stu1.start();// �����߳�
        stu2.start();
        stu3.start();
        stu4.start();
        stu5.start();
    }
}

class Teacher {
    private static Teacher teacher = new Teacher();// ����ʽʵ����һ��Ψһ��teacher��
    private List<String> jobs = new ArrayList();// һ����ҵ���ϴ�ŵ���ͬѧ�����е���ҵ

    private Teacher() {// ˽�л����췽��

    }

    public static Teacher getTeacher() {// �ṩһ�������ķ���������ʵ�����Ķ���
        return teacher;
    }

    public void setJobs(String job) {// ����һ����������ҵ�����д����ҵ
        jobs.add(job);// ����ҵ�����д����ҵ
        System.out.println("��ʦ��ȡ��" + job + "��ҵ������" + jobs.size());// �����ҵ�����ֺʹ�С
    }
}

class Student implements Runnable {
    private static Teacher teacher;// ��Ա������ʦ��

    Student(Teacher tercher) {// ͨ�����췽����Teacher�ำֵ��ָ��ѧ����˭����ҵ
        this.teacher = tercher;
    }

    public void run() {
        for (int count = 97; count <= 100; count++) {
            String job = Thread.currentThread().getName() + "����ҵ" + (char) count;// ��ҵ����
            teacher.setJobs(job);// ѭ���ĴΣ�����teacher�Ľ���ҵ����
        }
    }
}