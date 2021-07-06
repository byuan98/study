package job;

public class PrimeNumberOne {
//	获取1到100内位数上含有1的所有质数的平均值
    public static void main(String[] args) {
        boolean flag;
        int frequency = 0, sum = 0;
        for (int number = 11; number < 100; number += 10) {
            flag = false;
            for (int factor = 2; factor <= number / 2; factor++) {
                if (number % factor == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag != true) {
                sum += number;
                frequency++;
            }
        }
        System.out.println("1到100内位数上含有1的所有质数的平均值为:" + (double) sum / frequency);

    }

}
