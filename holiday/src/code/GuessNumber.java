package code;

import java.util.*;

public class GuessNumber {
//	写一个方法：猜字游戏  先随机一个数字  然后让用户通过键盘输入一个数字
//    判断输入的数字是否猜中  如果没有猜中就告诉他太大或者太小  最后打印猜对需要的次数
    public static void main(String[] args) {
        guessNumber();

    }

    private static void guessNumber() {
        Scanner input = new Scanner(System.in);
        int answer = (int) (Math.random() * 100 + 1);
        int number = 0;
        while (true) {
            System.out.print("请输入您所要猜的数字(0-100)：");
            int answering = input.nextInt();
            number++;
            if (answering > answer) {
                System.out.println("您猜的数字太大啦");
            } else if (answering < answer) {
                System.out.println("您猜的数字太小啦");
            } else {
                System.out.println("恭喜您猜对了,答案是:" + answer + ",您一共猜了" + number + "次;");
                break;
            }
        }
    }
}
