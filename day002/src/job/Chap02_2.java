package job;

public class Chap02_2 {

    public static void main(String[] args) {
        int sum = 0;
        for (int number = 1; number <= 100; number += 2) {
            sum += number;
        }
        System.out.println("0-100的所有奇数和为" + sum);
    }
}
