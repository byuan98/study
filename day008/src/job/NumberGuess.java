package job;

import java.util.*;

public class NumberGuess {
//	写一个方法:猜字游戏,先随机一个数字,然后让用户通过键盘输入一个数字
//  判断输入的数字是否猜中,如果没有猜中就告诉他太大或者太小,最后打印猜对需要的次数
    public static void main(String[] args) {
        numberGuess();
    }

    private static void numberGuess() {
        int answer = (int) (Math.random() * 100 + 1);
        Scanner input = new Scanner(System.in);
        int count = 0;
        int number;
        while (true) {
            System.out.println("请输入您所猜的数字:");
            number = input.nextInt();
            count++;
            if (number > answer) {
                System.out.println("您猜的数字大于正确答案");
            } else if (number < answer) {
                System.out.println("您猜的数字小于正确答案");
            } else {
                System.out.println("恭喜您猜对了,答案是" + answer + ",您一共猜了" + count + "次");
                break;
            }
        }
    }
}
