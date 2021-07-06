package test;

public class TestOne {

    public static void main(String[] args) {
        boolean flag = true;
        for (int number = 2; number <= 100; number++) {
            flag = true;
            for (int numberr = number + 1; numberr < number; numberr++) {
                if (number % numberr == 0) {
                    flag = false;
                }
            }
            if (flag == true) {
                System.out.println(number);
            }
        }
    }
}
