package job;

import java.util.Date;

public class TodayWeek {
//	写一个方法 打印今天是周几?(比如是周二)  然后再判断今天是今年的第几个周二
    public static void main(String[] args) {
        todayWeek();

    }

    static void todayWeek() {
        Date now = new Date();
        Date before = new Date(now.getYear(), 1 - 1, 1);
        String[] weeks = { "", "一", "二", "三", "四", "五", "六", "日" };
        long history = now.getTime() - before.getTime();
        System.out.println("今天是今年第" + (history / 1000 / 3600 / 24 % 7) + "个周" + weeks[now.getDay()]);
    }

}
