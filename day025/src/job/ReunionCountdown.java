package job;

import java.util.Date;

public class ReunionCountdown {
//	дһ������ ��ӡ��
//	��ǰʱ��xxxx��xx��xx�� ����x xx��xx��xx��  ����(������2021-2-12)����ʱ��xx��
    public static void main(String[] args) {
        countdown();

    }

    static void countdown() {
        Date begin = new Date();
        Date end = new Date(2021 - 1900, 2 - 1, 12);
        long history = begin.getTime() - end.getTime();
        String[] weeks = { "", "һ", "��", "��", "��", "��", "��", "��" };
        System.out.println("��ǰʱ��" + (begin.getYear() + 1900) + "��" + (begin.getMonth() + 1) + "��" + begin.getDate()
                + "�� ����" + weeks[begin.getDay()] + " " + begin.getHours() + "��" + begin.getMinutes() + "��"
                + begin.getSeconds() + "�� ����(������2021-2-12)����ʱ��" + (history / 1000 / 3600 / 24 + 1) + "��");
    }

}
