package job;

import java.util.Date;

public class CatchFish {
//	�й��о��ϻ��С�������棬����ɹ���� ��
//	������һ���˴�2000 ��1 ��1 �տ�ʼ�������������ɹ���� ��
//        �жϽ�����������ڴ��滹����ɹ����

    public static void main(String[] args) {
        // ��Ҫ������������ڴ��滹��ɹ��,������Ҫ��֪2000��1��1�վݽ�һ��������
        // ����������5������ɼ������
        Date begin = new Date(2000 - 1900, 1 - 1, 1); // ����һ����ʼ���ڵĶ���
        Date end = new Date(); // ����һ���������ڵĶ���
        long beginMs = begin.getTime(); // ��ȡ��ʼ���ڶ���ĺ���ֵ
        long endMs = end.getTime(); // ��ȡ�������ڶ���ĺ���ֵ
        long days = (endMs - beginMs) / 1000 / 3600 / 24; // �����ߺ���ֵ֮��ת��Ϊ����
        System.out.println(days);
        if (days % 5 == 0 || days % 5 == 4) { // �������Ϊ0,������ǵ�����,Ϊ4�����4��,������,������ɹ��
            System.out.println("����Ӧ��ɹ��");
        } else { // ��֮,����
            System.out.println("����Ӧ�ô���");
        }

    }

}
