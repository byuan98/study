package job;

import java.util.*;

public class NumberFactorial {
//	дһ��������һ��С��10�����Ľ׳�
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("����Ҫ���㼸�Ľ׳�?");
        int number = input.nextInt();
        System.out.println(number + "�Ľ׳�Ϊ��" + numberFactorial(number));

    }

    private static long numberFactorial(int number) {
        if (number >= 1 && number < 10) {
            long product = 1;
            for (int i = 2; i <= number; i++) {
                product *= i;
            }
            return product;
        } else {
            System.out.println("�ú���ֻ����С��10�����Ľ׳�");
            return -1;
        }

    }

}
