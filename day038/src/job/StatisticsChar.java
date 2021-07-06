package job;

import java.util.*;

public class StatisticsChar {

    public static void main(String[] args) {
        statisticsChar();

    }

    private static void statisticsChar() {
        System.out.println("请输入一个任意长度的字符串:");
        Scanner input = new Scanner(System.in);
        String str = input.next();
//		String str=new Scanner(System.in).next();//这行代码与上面两行等价,这行代码使用了匿名对象

        HashMap<Character, Integer> countChar = new HashMap();// 创建一个HashMap用来装字符和每个字符的个数
        for (int index = 0; index < str.length(); index++) {
            countChar.put(str.charAt(index), 0);// 遍历这个字符串,将每个字符作为主键放入HashMap中,初始值设为0
        }
        System.out.println(countChar);

        for (int index = 0; index < str.length(); index++) {// 同样开始对这个字符串进行遍历,拿出每一个字符
            Set<Character> keys = countChar.keySet();// 获取这个HashMap中的所有主键
            for (Character key : keys) {// 开始遍历主键
                if (key == str.charAt(index)) {
                    Integer number = countChar.get(key) + 1;// 如果说这个主键等于遍历的字符串的字符,就对这个主键对应的值进行+1操作
                    countChar.put(str.charAt(index), number);// 将新的值(进行了+1操作的值)放入目前的主键中(覆盖旧值)
                    // countChar.put(key, number);//与上一条语句等价
                }
            }
        }
        System.out.println(countChar);
    }

}
