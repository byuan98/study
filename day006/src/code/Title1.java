package code;

import java.util.*;

public class Title1 {
//	�ŵ�����:��һ�����ӣ��ӳ������3������ÿ���¶���һ������,
//	С���ӳ����������º�ÿ��������һ������,
//	�������Ӷ���������ÿ���µ���������Ϊ����?
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rabbitPair = 1;// ��һ����,���ӵĶ���(1-3��);
        int rabbitPairNext = 1;// �¸������ӵĶ���(1-3��);
        System.out.println("���������������:");
        int endMonth = input.nextInt();
        if (endMonth < 3) {
            System.out.println(endMonth + "�µ���������Ϊ" + rabbitPair * 2 + "ֻ");
        } else if (endMonth == 3) {
            System.out.println(endMonth + "�µ���������Ϊ" + rabbitPairNext * 2 + "ֻ");
        } else {
            for (int beginMonth = 4; beginMonth <= endMonth; beginMonth++) {
                int rabbitPairSum = rabbitPair + rabbitPairNext;
                rabbitPairNext = rabbitPair;
                rabbitPair = rabbitPairSum;
                System.out.println(beginMonth + "�µ���������Ϊ" + rabbitPairSum * 2 + "ֻ");
            }

        }

    }
}
