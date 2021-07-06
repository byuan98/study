package code;

public class InnerCode {
//  �ڲ���:���ж������
    public static void main(String[] args) {
        // �ڲ����Ϊ���¼���:
        // 1����Ա�ڲ���(�ڲ������ⲿ��ĳ�Ա);
        System.out.println("��Ա�ڲ���ʾ��:");
        {
            Outer1 o1 = new Outer1();
            Outer1.Inner1 i1; // �����Ա�ڲ�������
            i1 = o1.new Inner1(); // �����ڲ������:ͨ���ⲿ������������ڲ������
            i1.show();
        }
        System.out.println("--------------------");
        // 2����̬�ڲ���(�ڲ������ⲿ��ľ�̬��Ա);
        System.out.println("��̬�ڲ���ʾ��:");
        {
            Outer2.Inner2 i2;// ���徲̬�ڲ�������
            i2 = new Outer2.Inner2();// ������̬�ڲ������
            i2.show();
        }
        System.out.println("--------------------");
        // 3���ֲ��ڲ���(�ڷ�����/������ж������);
        System.out.println("�ֲ��ڲ���ʾ��:");
        {
            // Inner3_2��Ķ���ֻ��������ڵķ����д���
            new Outer3().innerClass(); // new Outer3()û�ж�������,���ǽ�����д����֮Ϊ��������
        }
        System.out.println("--------------------");
        // 4�������ڲ���(û�ж������ֵ��ڲ���,�޷��ٴδ�������);
        System.out.println("�����ڲ���ʾ��:");
        {
            // �����ڲ����ʹ�ó���:����������������һ������:
            // ���ó�����Fu��show����(�������޷�ʵ��������,����һ����˵����ֱ�ӵ���ʵ����Ա:show����)

            // ��ʽ1:���������������,ͨ������������show����
            Fu f1 = new Zi();
            f1.show();

            // ��ʽ2:ʹ�������ڲ���
            Fu f2 = new Fu() {
                void hello() {
                    System.out.println("Hello");
                }
            };
            f2.show();
        }
    }
}

//�ڲ���֮��Ա�ڲ���
class Outer1 {
    String name = "�ⲿ��name";

    class Inner1 {// ��Ա�ڲ���
        String name = "��Ա�ڲ���name";

        void show() {
            String name = "�ֲ�����name";
            System.out.println("name=" + name);// �ͽ�ԭ��,�ֲ�����name;
            System.out.println("this.name=" + this.name);// �ڲ���name;
            System.out.println("Outer1.this.name" + Outer1.this.name);// �ⲿ��name;
        }
    }
}

//�ڲ���֮��̬�ڲ���
class Outer2 {
    String name = "�ⲿ��name";
    static String logo = "�ⲿ�ྲ̬��Աlogo";

    static class Inner2 {
        String name = "��̬�ڲ���name";

        void show() {
            String name = "�ֲ�����name";
            System.out.println("name=" + name);// �ͽ�ԭ��,�ֲ�����name;
            System.out.println("this.name=" + this.name);// ��̬�ڲ���name;
            // System.out.println("Outer2.this.name"+Outer2.this.name);//��̬�ڲ��಻��ֱ�ӵ����ⲿ��ķǾ�̬��Ա
            System.out.println("Outer2.logo" + Outer2.logo);// �ⲿ�ྲ̬��Աlogo
        }
    }
}

//�ڲ���֮�ֲ��ڲ���
class Outer3 {
    {// ��һ��:д�ڹ��������е��ڲ���
        class Inner3_1 { // �ֲ��ڲ���
        }
    }
    String name = "�ⲿ��name";

    void innerClass() {// �ڶ���:�ڷ������ж������
        class Inner3_2 {// �ֲ��ڲ���
            String name = "�ڲ���name";

            void show() {
                String name = "�ֲ�����name";
                System.out.println("name=" + name);// �ֲ�����name
                System.out.println("this.name" + this.name);// �ڲ���name
                System.out.println("Outer3.this.name" + Outer3.this.name);// �ⲿ��name
            }
        }
        // Inner3_2��Ķ���ֻ���ڴ˷����д���
        Inner3_2 i3_2;// ����ֲ��ڲ�������
        i3_2 = new Inner3_2();// �����ֲ��ڲ������
        i3_2.show();
    }
}

//�ڲ���֮�����ڲ���
abstract class Fu {
    abstract void hello();

    void show() {
        System.out.println("Fu���show����");
    }
}

class Zi extends Fu {
    void hello() {
        System.out.println("Hello");
    }
}