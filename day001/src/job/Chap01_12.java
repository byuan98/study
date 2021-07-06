package job;

import java.util.*;

public class Chap01_12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2, result;
        String operator;
        System.out.println("请输入第一个正整数：");
        number1 = input.nextInt();
        System.out.println("请输入第二个正整数：");
        number2 = input.nextInt();
        System.out.println("请选择运算符号+、-、*、/");
        operator = input.next();
        switch (operator) {
        case "+":
            System.out.println(number1 + "+" + number2 + "=" + (number1 + number2));
            break;
        case "-":
            System.out.println(number1 + "-" + number2 + "=" + (number1 - number2));
            break;
        case "*":
            System.out.println(number1 + "*" + number2 + "=" + (number1 * number2));
            break;
        case "/":
            System.out.println(number1 + "/" + number2 + "=" + (number1 / number2));
            break;
        }
    }
}
