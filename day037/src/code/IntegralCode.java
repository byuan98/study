package code;

public class IntegralCode {
//��װ��֮Integer
    public static void main(String[] args) {
        // 1 ������������-->��װ�����
        // 1.1 ���췽��
        Integer i1 = new Integer(10);
        // 1.2 ��̬����
        Integer i2 = Integer.valueOf(20);
        // 1.3 �Զ�װ��
        Integer i3 = 30;// �������Զ�ʵ��i3=new Integer(30);
        for (int number = -150; number <= 150; number++) {
            Integer i4 = number, i5 = number;
            System.out.println(number + "�ıȽϽ��Ϊ:" + (i4 == i5));
        } // �Զ�װ��ʱ,��ȡֵ��Χ��[-128,127]֮��ʹ�õ�����ͬ����,
          // �������Χ֮��ÿװ��һ�ξ���һ���µĶ���

        // 2 ��װ�����-->������������
        // 2.1 ��ͨ����
        int n1 = i1.intValue();
        // 2.2 �Զ�����
        int n2 = i2;

        // 3 �ַ�������-->��װ�����
        // 3.1 ���췽��
        String s1 = "10";
        i1 = new Integer(s1);
        // 3.2 ��̬����
        // static Integer valueOf(String s);
        // Static Integer valueOf(String s,int radix);//���ַ���sת��Ϊradix���Ƶ�����
        i1 = Integer.valueOf("10");
        i2 = Integer.valueOf("20", 2); // 10��2����

        // 4 ��װ�����-->�ַ�������
        // 4.1 ��ͨ����
        s1 = i1.toString();
        // 4.2 ʹ��""����
        s1 = i1 + "";

        // 5 ������������-->�ַ���
        // 5.1 ��̬����
        // static String toBinaryString(int i);
        // static String toHexString(int i);
        // static String toOctalString(int i);
        // static String toString(int i,int radix);//������iת��Ϊradix���Ƶ��ַ���
        // 5.2 ʹ��""����
        s1 = 10 + "";

        // 6 �ַ���-->������������
        // 6.1 ��̬����
        // static int parseInt(String s);
        n1 = Integer.parseInt("10");
        n2 = Integer.parseInt("20a");// NumberFormatException
    }

}
