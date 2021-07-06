package job;

import java.util.*;

public class Chap01_14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入税前收入");
        double money = input.nextDouble();
        if (money <= 2000) {
            System.out.println("您无需缴税");
        } else if ((money -= 2000) <= 500) {
            System.out.println("您应当缴纳的个人所得税为：" + money * 0.05 + "您的税后收入为：" + (money + 2000 - (money * 0.05)));
        } else if ((money -= 2000) <= 2000) {
            System.out.println("您应当缴纳的个人所得税为：" + money * 0.05 + "您的税后收入为：" + (money + 2000 - (money * 0.1)));
        } else if ((money -= 2000) <= 5000) {
            System.out.println("您应当缴纳的个人所得税为：" + money * 0.05 + "您的税后收入为：" + (money + 2000 - (money * 0.15)));
        } else if ((money -= 2000) <= 20000) {
            System.out.println("您应当缴纳的个人所得税为：" + money * 0.05 + "您的税后收入为：" + (money + 2000 - (money * 0.2)));
        } else if ((money -= 2000) <= 40000) {
            System.out.println("您应当缴纳的个人所得税为：" + money * 0.05 + "您的税后收入为：" + (money + 2000 - (money * 0.25)));
        } else if ((money -= 2000) <= 60000) {
            System.out.println("您应当缴纳的个人所得税为：" + money * 0.05 + "您的税后收入为：" + (money + 2000 - (money * 0.3)));
        } else if ((money -= 2000) <= 80000) {
            System.out.println("您应当缴纳的个人所得税为：" + money * 0.05 + "您的税后收入为：" + (money + 2000 - (money * 0.35)));
        } else if ((money -= 2000) <= 100000) {
            System.out.println("您应当缴纳的个人所得税为：" + money * 0.05 + "您的税后收入为：" + (money + 2000 - (money * 0.4)));
        } else {
            System.out.println("您应当缴纳的个人所得税为：" + money * 0.05 + "您的税后收入为：" + (money + 2000 - (money * 0.45)));
        }
    }
}
