package job;

import java.util.*;

public class Chap02_9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("������Ҫ��ӡ�������εĸߣ�");
        int high = input.nextInt();
        for (int low = 1; low <= high; low++) {
            for (int number = high - low; number > 0; number--) {
                System.out.print(" ");
            }
            for (int number = low * 2 - 1; number > 0; number--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
