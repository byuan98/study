package job;

import java.util.*;

public class Chap01_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("������һ����Ҫ�����жϵ���������");
        int number = input.nextInt();
        if (number <= 0) {
            System.out.println("0����û����ż��");
        } else if (number % 2 == 0) {
            System.out.println("�������������ż��");
        } else if (number % 2 != 0) {
            System.out.println("�����������������");
        }
    }
}
