package job;

public class Pi {
//	计算圆周率
//	中国古代数学家研究出了计算圆周率最简单的办法:
//	PI=4/1-4/3+4/5-4/7+4/9-4/11+4/13-4/15+4/17......
//	这个算式的结果会无限接近于圆周率的值,
//	我国古代数学家祖冲之计算出,圆周率在3.1415926 和3.1415927 之间,
//	请编程计算,要想得到这样的结果,他要经过多少次加减法运算?
//	注意：此题需要研究 循环的条件和每次加减的数的规律
    public static void main(String[] args) {
        double pi = 4; // 初始值从4开始
        int number = 0; // 次数从零开始
        for (double denominator = 3;; denominator += 2) {
            if (number % 2 == 0) { // 从零开始,偶数次做减法
                pi -= 4.0 / denominator;
            } else { // 奇数次做加法
                pi += 4.0 / denominator;
            }
            number++; // 完成一次加/减运算就把次数加一
            if (pi >= 3.1415926 && pi <= 3.1415927) {
                System.out.println("要想得到圆周率在3.1415926 和3.1415927 之间,这样的结果,他要经过" + number + "次加减法运算");
                break;
            }
        }
    }
}
