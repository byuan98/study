package code;

import java.util.*;

public class Title5 {
//	利用条件运算符的嵌套来完成此题：
//	学习成绩> =90分的同学用A表示,60-89分之间的用B表示,60分以下的用C表示;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();
        char level;
        level = score >= 90 ? 'A' : (score < 60 ? 'C' : 'B');
        System.out.println(level);

    }

}
