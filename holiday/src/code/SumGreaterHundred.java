package code;

public class SumGreaterHundred {
//	求1+2+3+...加到几的时候和开始大于1000
    public static void main(String[] args) {
        int sum = 0;
        for (int number = 1;; number++) {
            sum += number;
            if (sum > 1000) {
                System.out.println("1+2+3+...加到" + number + "的时候和开始大于1000");
                break;
            }
        }

    }

}
