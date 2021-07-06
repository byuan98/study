package job;

public class Chap02_3 {

    public static void main(String[] args) {
        sumWhile();
        sumDoWhile();
        oddSumWhile();
        oddSumDoWhile();
    }

    private static void oddSumDoWhile() {
        int sum = 0, number = 1;
        do {
            sum += number;
            number += 2;
        } while (number <= 100);
        System.out.println("0-100的所有奇数和为" + sum);
    }

    private static void oddSumWhile() {
        int sum = 0, number = 1;
        while (number <= 100) {
            sum += number;
            number += 2;
        }
        System.out.println("0-100的所有奇数和为" + sum);
    }

    private static void sumDoWhile() {
        int sum = 0, number = 0;
        do {
            sum += number;
            number++;
        } while (number <= 100);
        System.out.println("0-100的和为：" + sum);
    }

    private static void sumWhile() {
        int sum = 0, number = 1;
        while (number <= 100) {
            sum += number;
            number++;
        }
        System.out.println("0-100的和为：" + sum);
    }
}
