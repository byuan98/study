package code;

import java.util.*;

public class Title4$ {
//	��һ���������ֽ�������������:����90,��ӡ��90=2*3*3*5
    public static void main(String[] args) {
        System.out.println("��������Ҫ���зֽ���������һ��������");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int factor = 2;
        while (number <= number) {
            if (number == factor) {
                System.out.println(factor);
                break;
            } else if (number % factor == 0) { // �����������
                System.out.print(factor + "*");
                number = number / factor;
            } else {
                factor++; // ����������++
            }
        }
    }
}
