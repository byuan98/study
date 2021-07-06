package job;

public class Chap_02_15 {

    public static void main(String[] args) {
        /*
         * PI=4/1-4/3+4/5-4/7+4/9-4/11+4/13-4/15+4/17...... 这个算式的结果会无限接近于圆周率的值,
         * 我国古代数学家祖冲之计算出,圆周率在3.1415926 和3.1415927 之间, 请编程计算,要想得到这样的结果,他要经过多少次加减法运算?
         */
        System.out.println(
                "#" + (4 / 1.0 - 4 / 3.0 + 4 / 5.0 - 4 / 7.0 + 4 / 9.0 - 4 / 11.0 + 4 / 13.0 - 4 / 15.0 + 4 / 17.0));
        double pi = 4.0;
        int number = 1;
        for (double denominator = 3.0;; denominator += 2) {
            if (number % 2 != 0) {
                pi -= 4.0 / denominator;
            } else {
                pi += 4.0 / denominator;
            }
            number++;
            if (number == 17) {
                System.out.println(pi);
                break;
            }
            if (pi > 3.1415926 && pi < 3.1415927) {
                System.out.println(pi + ":::" + number);
                break;
            }
        }
    }
}
