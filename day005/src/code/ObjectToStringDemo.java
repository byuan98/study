package code;

public class ObjectToStringDemo {
//Object���÷���3��String toString()//��ȡ��ǰ������ַ�����ʾ��ʽ
    public static void main(String[] args) {
        Animal a = new Animal();
        a.setName("Tiger");

        System.out.println(a.toString());// code.Animal@2f92e0f4
                                         // ��ӡ���󡢶�����ַ���ƴ�ӣ�
                                         // Ĭ�ϵ��õ��Ƕ����toString����

        String s = a.toString();
        System.out.println(s);

    }
}

class Animal {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}