package test;

import java.util.regex.*;

public class TestTwo {
//    正则测试（正确规则，为字符串提供正确规则）
    public static void main(String[] args) { 
        String str1="11111233333";//除了中间前后都是叠词
        String regex1="(.)\\1+.(.)\\2+";//这里每个括号都代表了一组匹配规则，\\1代表了1组，\\2代表了2组
        System.out.println(str1.matches(regex1));
        
        String str2="11111233333455555";//得到结果：12345
        String regex2="(.)\\1+";
        System.out.println(str2.replaceAll(regex2, "$1"));
    }
    
    private static void wayOne() {
//        1、创建一个Pattern对象，参数为匹配规则；
        Pattern pattern=Pattern.compile("[0-9]");//规则：数字0-9
//        2、获取匹配器对象，并关联要判断的字符串；
        Matcher matcher=pattern.matcher("10");//带判断字符串：10
//        3、调用匹配器对象的方法获取匹配结果；
        System.out.println(matcher.matches());//打印结果：false
    }
}
