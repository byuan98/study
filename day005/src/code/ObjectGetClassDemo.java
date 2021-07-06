package code;

public class ObjectGetClassDemo {
//Object���÷���2��Class getClass() ��ȡ��ǰ����ֽ����ļ�����(class�ļ�)
    public static void main(String[] args) {
        People p1 = new People();
        p1.setName("Godfery");
        p1.steAge(18);

        System.out.println(p1.getClass());// ��ӡ����p1����(class code.People)
        Class c1 = p1.getClass();
        System.out.println(c1);

        // ����Class�������������
        // 1��String getName() ��ȡ���ȫ�ƣ�����.����
        System.out.println(c1.getName());

        // 2��String getSimpleName() ��ȡ����
        System.out.println(c1.getSimpleName());

    }
}

class People {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void steAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}