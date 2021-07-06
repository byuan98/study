package code;

import java.util.*;

public class NarcissisticNumber {
//	�ж�һ�����ǲ���ˮ�ɻ���
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("������һ����Ҫ�жϵ�����:");
        int number = input.nextInt();
        if (narcissisticNumberJudge(number)) {
            System.out.println("��ˮ�ɻ���");
        } else {
            System.out.println("����ˮ�ɻ���");
        }
    }

    private static boolean narcissisticNumberJudge(int number) {
        if (number <= 100 && number >= 999) {// ˮ�ɻ�����һ����λ��,������λ��һ������ˮ�ɻ���
            return false;
        }
        // �ֽ�����ˮ�ɻ����ĸ�λ��ʮλ����λ
        int unit = number / 1 % 10;
        int decade = number / 10 % 10;
        int hundreds = number / 100 % 10;
        if (Math.pow(unit, 3) + Math.pow(decade, 3) + Math.pow(hundreds, 3) == number) {
            // ������ָ�λ��������ӵ����������,˵������һ��ˮ�ɻ���
            return true;
        }
        // �����return trueû��ִ��,��˵������һ��ˮ�ɻ���
        return false;
    }

}
