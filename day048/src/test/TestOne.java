package test;

public class TestOne {

    public static void main(String[] args) {
        System.out.println(sum(100));
    }

    private static int sum(int number) {
        if (number == 1) {
            return 1;
        }
        return sum(number - 1) + number;
    }

}
