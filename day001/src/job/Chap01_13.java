package job;

import java.util.*;

public class Chap01_13 {

    public static void main(String[] args) {
        double weight;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入公斤数：");
        weight = input.nextDouble();
        if (weight <= 20) {
            System.out.println(weight + "公斤货物的运费为：" + 5 + "元");
        } else if (weight <= 100) {
            System.out.println(weight + "公斤货物的运费为：" + (5 + (weight - 20) * 0.2) + "元");
        } else {
            System.out.println(weight + "公斤货物的运费为：" + (5 + (weight - 100) * 0.15) + "元");
        }
    }
}
