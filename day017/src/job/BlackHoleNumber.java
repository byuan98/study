package job;

import java.util.*;

public class BlackHoleNumber {
//	��֪��һ���������λ��������
//	������������ϳ�һ������������С���������
//	�ظ�������̣�����߲����ص�6174��
//	����7641-1467=6174������Զ��������
//	дһ��������ӡ������λ�����֣�ȫ��ͬ�ĳ��⣩���ܵõ�6174��
//	��������ڶ��Ĳ�����
    public static void main(String[] args) {
        System.out.println("������һ����λ��������");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int step = 0;
        if (identicalJudge(number)) { // ���ж�������Ƿ���λ��ͬ,��ͬ��ֱ�ӷ���
            System.out.println("��λ��ͬ�����޷�����ڶ�");
        } else {
            while (true) {
                int[] array = numberInArray(number); // ������תΪ����,�������
                arraySort(array); // �����齵������
                int numberMax = array[0] * 1000 + array[1] * 100 + array[2] * 10 + array[3]; // ����������˳��ȡ�����,�õ�һ�������
                int numberMin = array[3] * 1000 + array[2] * 100 + array[1] * 10 + array[0]; // ����������˳��ȡ�����,�õ�һ����С��
                System.out.println(numberMax + "-" + numberMin + "=" + (numberMax - numberMin));
                number = numberMax - numberMin;
                step++; // ������ϲ���,����+1
                if (number == 6174) { // �����������6174,�����ڶ�
                    System.out.println("������" + step + "��,�����˺ڶ�");
                    break;
                }
            }
        }
    }

    private static boolean identicalJudge(int number) {
        int unit = number / 1 % 10;
        int decade = number / 10 % 10;
        int hundreds = number / 100 % 10;
        int thousand = number / 1000 % 10;
        if (unit == decade && unit == hundreds && unit == thousand) {
            return true;
        }
        return false;
    }

    private static int[] numberInArray(int number) { // ��λ����ת����
        if (number < 1000 && number > 9999) {
            System.out.println("����������ֲ���һ����λ��,��˶Ժ��ٴ�����");
            return null;
        }
        int unit = number / 1 % 10;
        int decade = number / 10 % 10;
        int hundreds = number / 100 % 10;
        int thousand = number / 1000 % 10;
        return new int[] { unit, decade, hundreds, thousand };
    }

    private static void arraySort(int[] array) { // ����Ľ�������
        int interim;
        for (int low = 0; low < array.length; low++) {
            for (int high = low + 1; high < array.length; high++) {
                if (array[low] < array[high]) {
                    interim = array[low];
                    array[low] = array[high];
                    array[high] = interim;
                }
            }
        }
    }
}
