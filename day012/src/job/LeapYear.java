package job;

import java.util.*;

public class LeapYear {
//	�ж�һ�����ǲ�������
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("��������Ҫ���������жϵ����:");
        int year = input.nextInt();
        if (leapYear(year)) { // ���ݷ������صĲ���ֵ�����ж�,�������true,��˵��������
            System.out.println("����������������");
        } else { // ��֮,��˵����������
            System.out.println("���������ݲ�������");
        }

    }

    private static boolean leapYear(int year) {
        // �����жϱ�׼:�ܱ�4��400���������ܱ�100����
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true; // ���������˵��������,��������,����true
        }
        return false; // ������������ﻹû�н���,��˵����������
    }
}
