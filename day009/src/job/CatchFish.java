package job;

import java.util.Date;

public class CatchFish {
//	дһ������ static void daYuShaiWang(String s);
//	�жϴ�2000��1��1�տ�ʼ�����������ɹ����s(��ʽ��xxxx-xx-xx)��ʾ��ʱ��
//	�Ǵ��滹��ɹ��
    public static void main(String[] args) {
        daYuShaiWang("2000-1-1");
        daYuShaiWang("2000-1-2");
        daYuShaiWang("2000-1-3");
        daYuShaiWang("2000-1-4");
        daYuShaiWang("2000-1-5");
        daYuShaiWang("2000-1-6");
        daYuShaiWang("2000-1-7");
        daYuShaiWang("2000-1-8");
        daYuShaiWang("2000-1-9");
        daYuShaiWang("2000-1-10");

    }

    static void daYuShaiWang(String s) {
        int year = Integer.parseInt(s.substring(0, s.indexOf('-')));
        int month = Integer.parseInt(s.substring(s.indexOf('-') + 1, s.lastIndexOf('-')));
        int day = Integer.parseInt(s.substring(s.lastIndexOf('-') + 1));

        Date begin = new Date(2000, 1, 1);
        Date end = new Date(year, month, day);
        System.out.println(end);

        long timeHistory = (end.getTime() - begin.getTime()) % (1000 * 60 * 60 * 24 * 5);

        if (timeHistory < (1000 * 60 * 60 * 24 * 3L)) {
            System.out.println(year + "��" + month + "��" + day + "��" + "����");
        } else {
            System.out.println(year + "��" + month + "��" + day + "��" + "ɹ��");
        }
    }

}
