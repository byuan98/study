package code;

import java.util.*;

public class NumberJudgment {
//	判断一个5位数是什么类型的数(顺子(如12345，五个连号)
//  炸弹(如11111 五个号相同),对称(如12321 前后对称))
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个用以进行判断的五位数");
        int number = input.nextInt();
        System.out.println(numberJudgment(number));
    }

    private static String numberJudgment(int number) {
        String numbersOrder = "123456789";
        String numbersReverse = "987654321"; // 这两个字符串作为顺子的模板
        if (number >= 10000 && number <= 99999) { // 进行判断的必须是一个五位数
            // 将这个五位数的每一位全部分离出来
            int unit = number / 1 % 10; // 个位
            int decade = number / 10 % 10; // 十位
            int hundreds = number / 100 % 10; // 百位
            int myriad = number / 1000 % 10; // 千位
            int thousand = number / 10000 % 10; // 万位
            if (unit == decade && unit == hundreds && unit == myriad && unit == thousand) { // 以个位数为基准,如果个位数等于十位数,等于百位数,等于千位数,等于万位数则说明这是一个五位相同的数
                return "五号相同且前后对称"; // 一个数五号相同则必然前后对称
            }
            if (unit == thousand && decade == myriad) { // 如果一个数的个位和万位相同,十位和千位相同,不论百位是几他都是一个前后对称的数字
                return "前后对称";
            }
            if (numbersOrder.contains(String.valueOf(number))) { // 将原始数据转换为字符串,如果这个数字包含在参数字符numbersOrder序列中,则说明它是一个顺序的顺子
                return "顺序顺子";
            }
            if (numbersReverse.contains(String.valueOf(number))) { //// 将原始数据转换为字符串,如果这个数字包含在参数字符numbersReverse序列中,则说明它是一个逆序的顺子
                return "逆序顺子";
            }
            return "您输入的数字不是顺子,不是炸弹.也不是五号相同"; // 不满足以上所有的分支则说明这个数字不是顺子,不是炸弹.也不是五号相同
        } else {
            return "您输入的不是一个五位数"; // 对应第一个分支,不满足条件number>=10000 && number<=99999则说明不是一个五位数
        }
    }
}
