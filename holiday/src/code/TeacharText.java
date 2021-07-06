package code;

public class TeacharText {
//	����һ����ʦ�ࣺ���ԣ����� ���� �Ա� ����  ��������˽�л���װ   
//	��дtoString��������ӡ�����磺 �ҽк���,��һ������ʦ,����30��,ÿ�¹�����1000Ԫ; 
//	��дequals���� Ҫ��������ͬ �Ա���ͬ �������1������ �������100Ԫ���� Ϊͬһ���� 
//	�ṩ�������췽����һ���в����ĸ��������Ը�ֵ  
//	һ���޲����ģ��������Զ����  �������4���ַ�������+��ĸ�� ����(3000.0-5000.0) ����(30-40) �Ա�(��-Ů)  
    public static void main(String[] args) {
        Teacher t = new Teacher("Godfery", 18, "��", 50000);
        Teacher t1 = new Teacher("Godfery", 19, "��", 49900);
        System.out.println(t);
        System.out.println(t1);
        System.out.println(t.equals(t1));

        Teacher t3 = new Teacher();
        System.out.println(t3);

    }

}

class Teacher {
    private String name = "";
    private int age;
    private String sex;
    private double wage;

    Teacher() {
        for (int number = 0; number < 4; number++) {
            int select = (int) (Math.random() * 3 + 1);
            if (select == 1) {
                this.name += (char) ((int) (Math.random() * 10 + 48));
            } else if (select == 2) {
                this.name += (char) ((int) (Math.random() * 26 + 97));
            } else {
                this.name += (char) ((int) (Math.random() * 26 + 65));
            }
        }
        this.age = (int) (Math.random() * 11 + 30);
        this.sex = (int) (Math.random() * 2 + 1) == 1 ? "��" : "Ů";
        this.wage = (int) (Math.random() * 20000 + 30000) / 10.0;
    }

    Teacher(String name, int age, String sex, double wage) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.wage = wage;
    }

    public String toString() {
        return "�ҽ�" + this.name + "��һ��" + this.sex + "��ʦ,����" + this.age + "��,ÿ�¹�����" + this.wage + "Ԫ";
    }

    public boolean equals(Object obj) {
        if (obj instanceof Teacher) {
            Teacher t1 = (Teacher) obj;
            if (this.name.equals(t1.name) && this.sex.equals(t1.sex) && Math.abs(this.age - t1.age) <= 1
                    && Math.abs(this.wage - t1.wage) <= 100) {
                return true;
            }
        }
        return false;
    }
}