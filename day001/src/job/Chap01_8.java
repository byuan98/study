package job;

import java.util.*;

public class Chap01_8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("��������Ҫ�����жϵ����䣺");
        int age = input.nextInt();
        if (age < 6) {
            System.out.println("��ͯ");
        } else if (age <= 13) {
            System.out.println("�ٶ�");
        } else if (age < 18) {
            System.out.println("������");
        } else if (age < 35) {
            System.out.println("����");
        } else if (age <= 50) {
            System.out.println("����");
        } else {
            System.out.println("������");
        }
    }
}
