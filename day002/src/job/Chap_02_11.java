package job;

import java.util.*;

public class Chap_02_11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("������һ����Ҫ�����жϵ���λ��������");
        int number = input.nextInt();

        if (number >= 100 && number <= 999) {
            int unit, decade, hundreds, kilobit;
            unit = number / 1 % 10;
            decade = number / 10 % 10;
            hundreds = number / 100 % 10;
            if (((unit * unit * unit) + (decade * decade * decade) + (hundreds * hundreds * hundreds)) == number) {
                System.out.println("�������������һ��ˮ�ɻ���");
            } else {
                System.out.println("����������ֲ���һ��ˮ�ɻ���");
            }
        } else {
            System.out.println("������Ĳ���һ����λ������");
        }
    }
}
