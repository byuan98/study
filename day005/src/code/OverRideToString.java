package code;

public class OverRideToString {
//��дtoString����,ʹ������Ĳ��ǵ�ַ��������
    public static void main(String[] args) {
        Fish f1 = new Fish();
        f1.setName("����");

        System.out.println(f1);

    }
}

class Fish {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // ��дtoString����,������������͸�����ͬ
    public String toString() {
        return "����һ��" + this.name;
    }
}