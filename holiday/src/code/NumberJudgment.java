package code;

import java.util.*;

public class NumberJudgment {
//	�ж�һ��5λ����ʲô���͵���(˳��(��12345���������)
//  ը��(��11111 �������ͬ),�Գ�(��12321 ǰ��Գ�))
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("������һ�����Խ����жϵ���λ��");
        int number = input.nextInt();
        System.out.println(numberJudgment(number));
    }

    private static String numberJudgment(int number) {
        String numbersOrder = "123456789";
        String numbersReverse = "987654321"; // �������ַ�����Ϊ˳�ӵ�ģ��
        if (number >= 10000 && number <= 99999) { // �����жϵı�����һ����λ��
            // �������λ����ÿһλȫ���������
            int unit = number / 1 % 10; // ��λ
            int decade = number / 10 % 10; // ʮλ
            int hundreds = number / 100 % 10; // ��λ
            int myriad = number / 1000 % 10; // ǧλ
            int thousand = number / 10000 % 10; // ��λ
            if (unit == decade && unit == hundreds && unit == myriad && unit == thousand) { // �Ը�λ��Ϊ��׼,�����λ������ʮλ��,���ڰ�λ��,����ǧλ��,������λ����˵������һ����λ��ͬ����
                return "�����ͬ��ǰ��Գ�"; // һ���������ͬ���Ȼǰ��Գ�
            }
            if (unit == thousand && decade == myriad) { // ���һ�����ĸ�λ����λ��ͬ,ʮλ��ǧλ��ͬ,���۰�λ�Ǽ�������һ��ǰ��ԳƵ�����
                return "ǰ��Գ�";
            }
            if (numbersOrder.contains(String.valueOf(number))) { // ��ԭʼ����ת��Ϊ�ַ���,���������ְ����ڲ����ַ�numbersOrder������,��˵������һ��˳���˳��
                return "˳��˳��";
            }
            if (numbersReverse.contains(String.valueOf(number))) { //// ��ԭʼ����ת��Ϊ�ַ���,���������ְ����ڲ����ַ�numbersReverse������,��˵������һ�������˳��
                return "����˳��";
            }
            return "����������ֲ���˳��,����ը��.Ҳ���������ͬ"; // �������������еķ�֧��˵��������ֲ���˳��,����ը��.Ҳ���������ͬ
        } else {
            return "������Ĳ���һ����λ��"; // ��Ӧ��һ����֧,����������number>=10000 && number<=99999��˵������һ����λ��
        }
    }
}
