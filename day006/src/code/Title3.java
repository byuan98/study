package code;

public class Title3 {
//	��ӡ�����е� "ˮ�ɻ��� ",��ν "ˮ�ɻ��� "��ָһ����λ����
//	���λ���������͵��ڸ�������
//	����:153��һ�� "ˮ�ɻ��� ",��Ϊ153=1�����η���5�����η���3�����η���
    public static void main(String[] args) {
        System.out.println("���е�ˮ�ɻ���Ϊ:");
        for (int number = 100; number <= 999; number++) {
            if (narcissisticNumber(number)) {
                System.out.println(number);
            }
        }
    }

    private static boolean narcissisticNumber(int number) {
        int unit = number / 1 % 10;
        int decade = number / 10 % 10;
        int hundred = number / 100 % 10;
        if (Math.pow(unit, 3) + Math.pow(decade, 3) + Math.pow(hundred, 3) == number) {
            return true;
        }
        return false;
    }

}
