package job;

import java.util.Date;

public class CatchFish {
//	写一个方法 static void daYuShaiWang(String s);
//	判断从2000年1月1日开始三天打渔两天晒网 到s(格式是xxxx-xx-xx)表示的时间
//	是打渔还是晒网
    public static void main(String[] args) {
        // 首先编写一个方法将字符串中的日期信息提取出来
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
            System.out.println("今天打渔");
        } else {
            System.out.println("今天晒网");
        }

    }

    static int[] dateStrToDateInt(String str) {
        int[] dateInt = new int[3]; // 下标0:年,下标1:月,下标2:日
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
