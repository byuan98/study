package code;

public class Title2 {
//  判断101-200之间有多少个素数,并输出所有素数。
    public static void main(String[] args) {
        int sum = 0;
        for (int number = 101; number <= 200; number++) {
            if (primeNumber(number)) {
                System.out.println(number + "是素数");
                sum++;
            }
        }
        System.out.println("101-200共有素数" + sum + "个");
    }

    private static boolean primeNumber(int number) {
        for (int factor = 2; factor < number; factor++) {
            if (number % factor == 0) {
                return false;
            }
        }
        return true;
    }
}
