package code;

import java.util.Date;
import java.util.Scanner;

public class Countdown {
//	дһ��������public static int getDays(int year,int month,int day);
//	��ȡָ����ָ����ָ���� �����������(xxxx-12-31)���ж�����	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("��������ݣ�");
        int year = input.nextInt();
        System.out.println("�������·ݣ�");
        int month = input.nextInt();
        System.out.println("�������գ�");
        int day = input.nextInt();

        System.out.println(
                year + "��" + month + "��" + day + "�վ����������(" + year + "-12-31)����" + getDays(year, month, day) + "��");

    }

    public static int getDays(int year, int month, int day) {
        Date begin = new Date(year, month, day);
        Date end = new Date(year, 12, 31);
        long time = end.getTime() - begin.getTime();
        return (int) (time / 1000 / 3600 / 24);
    }
}
