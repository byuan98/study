package job;

import java.util.Date;

public class AFewWeek {
//	дһ������ ��ӡ�������ܼ�?(�������ܶ�)  Ȼ�����жϽ����ǽ���ĵڼ����ܶ�
    public static void main(String[] args) {
        nowWeek();
    }

    static void nowWeek() {
        Date now = new Date();
        Date begin = new Date(now.getYear(), 1 - 1, 1);

        long interval = now.getTime() - begin.getTime();

        String weeks = "��һ��������";
        System.out.println(
                "��������" + (weeks.charAt(now.getDay())) + "Ҳ�ǽ���ĵ�" + (interval / 1000 / 3600 / 24 / 7 + 1) + "���ܶ�");

    }
}
