package code;

import java.util.*;

public class GuessNumber {
//	дһ��������������Ϸ  �����һ������  Ȼ�����û�ͨ����������һ������
//    �ж�����������Ƿ����  ���û�в��о͸�����̫�����̫С  ����ӡ�¶���Ҫ�Ĵ���
    public static void main(String[] args) {
        guessNumber();

    }

    private static void guessNumber() {
        Scanner input = new Scanner(System.in);
        int answer = (int) (Math.random() * 100 + 1);
        int number = 0;
        while (true) {
            System.out.print("����������Ҫ�µ�����(0-100)��");
            int answering = input.nextInt();
            number++;
            if (answering > answer) {
                System.out.println("���µ�����̫����");
            } else if (answering < answer) {
                System.out.println("���µ�����̫С��");
            } else {
                System.out.println("��ϲ���¶���,����:" + answer + ",��һ������" + number + "��;");
                break;
            }
        }
    }
}
