package job;

import java.util.*;

public class NumberDigit {
//	дһ�������жϲ���int�� �Ǽ�λ��
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("������һ����Ҫ�ж���λ�����֣�");
        int number = input.nextInt();
        System.out.println(number + "��һ��" + numberDigit(number) + "λ��");

    }

    private static int numberDigit(int number) {
        int digit = 0;
        while (true) {
            number /= 10;
            digit++;
            if (number == 0) {
                return digit;
            }
        }
    }
}
