package test;

public class TestTwo {
//  ��װ��
    public static void main(String[] args) {
        // ������������--->��װ��
        Integer i1 = new Integer(10); // ���췽��
        Integer i2 = Integer.valueOf(20); // ��̬����
        Integer i3 = 30; // �Զ�װ��:�Զ�����256������[-128��127]

        // ��װ��--->������������
        int n = i1.intValue(); // ��ͨ����
        n = i2; // �Զ�����
        System.out.println(n);

        // �ַ�������--->��װ�����
        String s = "12345";
        Integer i4 = new Integer(s);
        System.out.println(i4);
        i4 = Integer.valueOf(s, 6);
        System.out.println(i4);
        System.out.println(12345 + "");

    }

}
