package job;

import java.util.Date;

public class CatchFish {
//	дһ������ static void daYuShaiWang(String s);
//	�жϴ�2000��1��1�տ�ʼ�����������ɹ�� ��s(��ʽ��xxxx-xx-xx)��ʾ��ʱ��
//	�Ǵ��滹��ɹ��
    public static void main(String[] args) {
        // ���ȱ�дһ���������ַ����е�������Ϣ��ȡ����
        daYuShaiWang("2000-01-01");
        daYuShaiWang("2000-01-02");
        daYuShaiWang("2000-01-03");
        daYuShaiWang("2000-01-04");
        daYuShaiWang("2000-01-05");
        daYuShaiWang("2000-01-06");
        daYuShaiWang("2000-01-07");
        daYuShaiWang("2000-01-08");
        daYuShaiWang("2000-01-09");
        daYuShaiWang("2000-01-10");
    }

    static void daYuShaiWang(String s) {
        int[] date = dateStrToDateInt(s);
        Date begin = new Date(2000, 1, 1);
        Date end = new Date(date[0], date[1], date[2]);
        long beginMs = begin.getTime();
        long endMs = end.getTime();

        long days = (endMs - beginMs) / 1000 / 3600 / 24 + 1;

        if (days % 5 == 1 || days % 5 == 2 || days % 5 == 3) {
            System.out.println("�������");
        } else {
            System.out.println("����ɹ��");
        }

    }

    static int[] dateStrToDateInt(String str) {
        int[] dateInt = new int[3]; // �±�0:��,�±�1:��,�±�2:��
        String year = "";
        String month = "";
        String day = "";
        for (int indexYear = 0; indexYear < str.length(); indexYear++) {
            if (str.charAt(indexYear) == '-') {
                break;
            }
            year += str.charAt(indexYear);
        }

        for (int indexMonth = 0; indexMonth < str.length(); indexMonth++) {
            if (str.charAt(indexMonth) == '-') {
                month = month + str.charAt(indexMonth + 1) + str.charAt(indexMonth + 2);
                break;
            }
        }

        for (int indexDay = str.length() - 1; indexDay >= 0; indexDay--) {
            if (str.charAt(indexDay) == '-') {
                break;
            }
            day = str.charAt(indexDay) + day;
        }
        dateInt[0] = Integer.parseInt(year);
        dateInt[1] = Integer.parseInt(month);
        dateInt[2] = Integer.parseInt(day);
        return dateInt;
    }
}
