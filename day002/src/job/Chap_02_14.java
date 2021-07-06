package job;

public class Chap_02_14 {

    public static void main(String[] args) {
        System.out.println("1000以内的完数有：");
        for (int number = 1; number <= 1000; number++) {
            int sum = 0;
            for (int product = 1; product < number; product++) {
                if (number % product == 0) {
                    sum += product;
                }
            }
            if (number == sum) {
                System.out.println(number);
            }
        }
    }
}
