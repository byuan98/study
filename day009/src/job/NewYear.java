package job;

import java.util.Date;

public class NewYear {
//	дһ��������ӡ����ǰʱ��xxxx��xx��xx�� ����x xx��xx��xx��  
//	����(������2021-2-12)����ʱ��xx��
    public static void main(String[] args) {
        myDate();
    }

    static void myDate() {
        Date now = new Date();
        Date future = new Date(2021 - 1900, 2 - 1, 12);
        int year = now.getYear() + 1900;
        int month = now.getMonth() + 1;
        int day = now.getDate();
        int week = now.getDay();
        int hour = now.getHours();
        int minutes = now.getMinutes();
        int seconds = now.getSeconds();
        String weeks = "��һ��������";

        long interval = future.getTime() - now.getTime();
        System.out.println(year + "��" + month + "��" + day + "�� ����" + weeks.charAt(week) + " " + hour + "��" + minutes
                + "��" + seconds + "��");
        System.out.println("�ݹ���(������2021-2-12)����" + interval / 1000 / 60 / 60 / 24 + "��");
    }
}
