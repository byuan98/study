package job;

import java.util.*;

public class NumberGuess {
//	дһ������:������Ϸ,�����һ������,Ȼ�����û�ͨ����������һ������
//  �ж�����������Ƿ����,���û�в��о͸�����̫�����̫С,����ӡ�¶���Ҫ�Ĵ���
    public static void main(String[] args) {
        numberGuess();
    }

    private static void numberGuess() {
        int answer = (int) (Math.random() * 100 + 1);
        Scanner input = new Scanner(System.in);
        int count = 0;
        int number;
        while (true) {
            System.out.println("�����������µ�����:");
            number = input.nextInt();
            count++;
            if (number > answer) {
                System.out.println("���µ����ִ�����ȷ��");
            } else if (number < answer) {
                System.out.println("���µ�����С����ȷ��");
            } else {
                System.out.println("��ϲ���¶���,����" + answer + ",��һ������" + count + "��");
                break;
            }
        }
    }
}
