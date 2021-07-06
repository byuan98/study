package code;

public class OverRideEqualsDemo {
//��дEquals����,ʹ��ȽϵĲ��ǵ�ַ��������
    public static void main(String[] args) {
        Bird b1 = new Bird();
        b1.setName("ϲȵ");

        Bird b2 = new Bird();
        b2.setName(b1.getName());

        System.out.println(b1.equals(b2));
    }
}

class Bird {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // ��дObject���equals����,������������͸�����ͬ
    public boolean equals(Object obj) {
        if (obj instanceof Bird) {
            // ����ת��
            Bird b = (Bird) obj;
            // �ж����ַ����Ƿ���ͬ,�����ַ�����equals����;
            return this.name.equals(b.name);
        }
        return false;
    }
}