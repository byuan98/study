package code;

import java.util.*;

public class PerMonthDays {
//	 ����������жϴ�������ж�����
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("����������ж����������:");
        int year = input.nextInt();
        System.out.println("����������ж��������·�:");
        int month = input.nextInt();
        int days = monthDays(year, month);
        if (days != -1) {
            System.out.println(year + "��" + month + "�¹�" + days + "��");
        } else {
            System.out.println("���������ݻ��·�����,��ݱ������0,�·ݱ�����1-12��֮��");
        }
    }

    private static int monthDays(int year, int month) {
        // ʹ�ñ��ѯ��,��һ��12���µ�����д��һ��������,�·ݴ�1��ʼ,�����±��0��ʼ,Ϊ�˷������,����0��λ����,��ֵΪ-1
        int[] monthDays = { -1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (month >= 1 && month <= 12 && year > 0) { // �����·ݺ���ݵĺ������ж�,��ݱ������0,�·ݱ�����1��12֮��
            monthDays[2] = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 29 : 28; // �����ƽ���2�������ǲ�һ����,ͨ����Ŀ������ж�һ���Ƿ�������,�����,2�µ�ȡֵΪ29
            return monthDays[month]; // ���·���Ϊ�����±�ֱ�ӷ��������ڶ�Ӧ������
        }
        return -1; // ���û�н��������if�ж�,��˵����ݻ��·ݲ�����,ֱ�ӷ���-1;
    }
}
