package job;

import java.util.*;

public class Chap_02_12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("����������һ����������");
        int sum = 0;
        int number = input.nextInt();
        if (number >= 0) {
            while (number > 0) {
                sum += number % 10;
                number = number / 10;
            }
            System.out.println("�������������λ��Ӻ�Ϊ" + sum);
        } else {
            System.out.println("������Ĳ���һ��������");
        }
    }
}
