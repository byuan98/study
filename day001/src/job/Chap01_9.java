package job;

import java.util.*;

public class Chap01_9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("������һ����������");
        int number = input.nextInt();
        switch (number) {
        case 1:
            System.out.println("����");
            break;
        case 2:
            System.out.println("����");
            break;
        case 3:
            System.out.println("����");
            break;
        case 4:
            System.out.println("ӭӭ");
            break;
        case 5:
            System.out.println("����");
            break;
        default:
            System.out.println("������ӭ��");
            break;

        }
    }
}
