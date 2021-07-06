package job;

import java.util.Date;

public class ReunionCountdown {
//	写一个方法 打印：
//	当前时间xxxx年xx月xx日 星期x xx点xx分xx秒  过年(阴历年2021-2-12)倒计时：xx天
    public static void main(String[] args) {
        countdown();

    }

    static void countdown() {
        Date begin = new Date();
        Date end = new Date(2021 - 1900, 2 - 1, 12);
        long history = begin.getTime() - end.getTime();
        String[] weeks = { "", "一", "二", "三", "四", "五", "六", "日" };
        System.out.println("当前时间" + (begin.getYear() + 1900) + "年" + (begin.getMonth() + 1) + "月" + begin.getDate()
                + "日 星期" + weeks[begin.getDay()] + " " + begin.getHours() + "点" + begin.getMinutes() + "分"
                + begin.getSeconds() + "秒 过年(阴历年2021-2-12)倒计时：" + (history / 1000 / 3600 / 24 + 1) + "天");
    }

}
