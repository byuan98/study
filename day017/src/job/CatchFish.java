package job;

import java.util.Date;

public class CatchFish {
//	中国有句老话叫“三天打渔，两天晒网” 。
//	假设有一个人从2000 年1 月1 日开始“三天打渔两天晒网” ，
//        判断今天这个人是在打渔还是在晒网？

    public static void main(String[] args) {
        // 想要计算这个人是在打渔还是晒网,首先需要得知2000年1月1日据今一共多少天
        // 拿总天数对5求余则可计算出来
        Date begin = new Date(2000 - 1900, 1 - 1, 1); // 创建一个开始日期的对象
        Date end = new Date(); // 创建一个结束日期的对象
        long beginMs = begin.getTime(); // 获取开始日期对象的毫秒值
        long endMs = end.getTime(); // 获取结束日期对象的毫秒值
        long days = (endMs - beginMs) / 1000 / 3600 / 24; // 将两者毫秒值之差转化为天数
        System.out.println(days);
        if (days % 5 == 0 || days % 5 == 4) { // 如果余数为0,则代表是第五天,为4代表第4天,第五天,第四天晒网
            System.out.println("今天应该晒网");
        } else { // 反之,打渔
            System.out.println("今天应该打渔");
        }

    }

}
