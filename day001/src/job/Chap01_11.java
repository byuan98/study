package job;

import java.util.*;

public class Chap01_11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("��������Ҫ�ж��Ƿ�Ϊ�������ݣ�");
        int year = input.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + "������");
        } else {
            System.out.println(year + "��������");
        }
    }
}
