package job;

import java.util.*;

public class SeasonJudgment {
//	�����·��жϼ���
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("��������Ҫ�жϼ��ڵ��·�:");
        int month = input.nextInt();
        String season = seasonJudgment(month); // ʹ��һ��String���͵ı��������ܽ��;
        if (season != null) { // ������صĲ���һ��������,��˵��������·ݴ���,������ֵ�������
            System.out.println(month + "�¶�Ӧ���·���" + season);
        } else { // ��֮,������һ����������˵��������·ݲ�����;
            System.out.println("һ��ֻ��1-12����,û��" + month + "��");
        }
    }

    private static String seasonJudgment(int month) {
        // ʹ�ñ��ѯ���������ж�,��ٳ����п���,��������Ӧ�������±���,
        // �����±�����ֶ�Ӧ�·�,��Ϊû��0������λ��0����;
        String[] season = { null, "����", "����", "����", "����", "����", "�ļ�", "�ļ�", "�ļ�", "�＾", "�＾", "�＾", "����" };
        if (month >= 1 && month <= 12) { // �·�ֻ��1-12,�������Χ�ڲ��ܽ����ж�
            return season[month]; // ͨ���·ݶ�Ӧ�������±���������ҳ���Ӧ���,ֱ�ӷ���
        }
        return null; // ����1-12�·�Χ�ڵ�ֱ�ӷ���null;
    }

}
