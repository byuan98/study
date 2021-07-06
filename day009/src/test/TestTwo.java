package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

public class TestTwo {
//  SimpleDateFormat类
    public static void main(String[] args) throws ParseException {
        // 准备模式--指定字符串的格式
        String pattern = "yyyy-MM-dd E HH:mm:ss";
        // 创建日期格式化对象
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Date date = new Date();
        // 格式化
        String str = sdf.format(date);
        System.out.println(str);
        // 解析
        str = "2021-01-26 星期二 14:01:07";
        date = sdf.parse(str);// Unhandled exception type ParseException
        System.out.println(date.toLocaleString());

    }
}
