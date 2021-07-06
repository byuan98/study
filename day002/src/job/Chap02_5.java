package job;

public class Chap02_5 {

    public static void main(String[] args) {
        int sum = 0;
        for (int number = 1; number < 100; number++) {
            if (number % 3 == 0 && number % 5 != 0) {
                sum += number;
            }
        }
        System.out.println("100以内所有能被3整除但不能被5整除的数字和为：" + sum);
    }
}
