package job;

import java.util.Date;

public class AFewWeek {
//	写一个方法 打印今天是周几?(比如是周二)  然后再判断今天是今年的第几个周二
    public static void main(String[] args) {
        nowWeek();
    }

    static void nowWeek() {
        Date now = new Date();
        Date begin = new Date(now.getYear(), 1 - 1, 1);

        long interval = now.getTime() - begin.getTime();

        String weeks = "日一二三四五";
        System.out.println(
                "今天是周" + (weeks.charAt(now.getDay())) + "也是今年的第" + (interval / 1000 / 3600 / 24 / 7 + 1) + "个周二");

    }
}
