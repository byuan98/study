package job;

public class RetainDecimal {
//	дһ��������public static double change5(double d,int n)
//    ��d������������ ����nΪС��
    public static void main(String[] args) {
        System.out.println(change5(1.1234561, 6));

    }

    public static double change5(double d, int n) {
        for (int number = 0; number < n; number++) { // ������λС���ͳ��Լ���10,�����������λ������������
            d *= 10;
        }
        if (d % 10 >= 5) { // �����λ�����ڵ���5,�ͽ�һ
            d += 10; // ��һ����
            d -= (int) (d % 10); // ��ȥ����ĸ�λ��,����d�Ǹ�double,����Ϊ�˱�֤��ȷ����ȥ��С��λ
        }
        d = (int) d; // ȥ�������С��λ
        for (int number = 0; number < n; number++) {
            d /= 10; // ������λ�ͳ�����10,��һ��������С������ǰ�ƶ�
        }
        return d; // ��������ֵ
    }

}
