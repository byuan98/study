package job;

import java.util.Date;

public class TodayWeek {
//	дһ������ ��ӡ�������ܼ�?(�������ܶ�)  Ȼ�����жϽ����ǽ���ĵڼ����ܶ�
    public static void main(String[] args) {
        todayWeek();

    }

    static void todayWeek() {
        Date now = new Date();
        Date before = new Date(now.getYear(), 1 - 1, 1);
        String[] weeks = { "", "һ", "��", "��", "��", "��", "��", "��" };
        long history = now.getTime() - before.getTime();
        System.out.println("�����ǽ����" + (history / 1000 / 3600 / 24 % 7) + "����" + weeks[now.getDay()]);
    }

}
