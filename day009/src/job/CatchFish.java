package job;

import java.util.Date;

public class CatchFish {
//	写一个方法 static void daYuShaiWang(String s);
//	判断从2000年1月1日开始三天打渔两天晒网到s(格式是xxxx-xx-xx)表示的时间
//	是打渔还是晒网
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
            System.out.println(year + "年" + month + "月" + day + "日" + "打渔");
        } else {
            System.out.println(year + "年" + month + "月" + day + "日" + "晒网");
        }
    }

}
