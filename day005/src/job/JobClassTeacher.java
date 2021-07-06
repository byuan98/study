package job;

public class JobClassTeacher {

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("����");
        t1.setSex('��');
        t1.setAge(30);
        t1.setWages(1000);
        System.out.println(t1);

        Teacher t2 = new Teacher();
        t2.setName("����");
        t2.setSex('��');
        t2.setAge(31);
        t2.setWages(1099);

        Teacher t3 = new Teacher();
        t3.setName("Ī��");
        t3.setSex('��');
        t3.setAge(31);
        t3.setWages(1099);

        System.out.println(t1.getName() + "��" + t2.getName() + ":" + t1.equals(t2));

        System.out.println(t1.getName() + "��" + t3.getName() + ":" + t1.equals(t3));
    }
}

class Teacher {
    private String name;
    private int age;
    private char sex;
    private double wages;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        this.wages = wages;
    }

    // ��дtoString����
    public String toString() {
        return "�ҽ�" + this.name + " ��һ��" + this.sex + "��ʦ ����" + this.age + "�� ÿ�¹�����" + this.wages + "Ԫ";
    }

    // ��дequals����
    public boolean equals(Object obj) {
        if (obj instanceof Teacher) {
            Teacher t = (Teacher) obj;

            if (this.name.equals(t.name) && this.sex == t.sex
                    && (((int) this.age + 1 == (int) t.age || (int) this.age == (int) t.age + 1)
                            && (this.wages - t.wages < 100 || this.wages - t.wages < 100))) {
                return true;
            }
        }
        return false;
    }
}