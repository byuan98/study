package code;

public class GoldbachConjecture {
//	哥德巴赫猜想：任意一个大于等于6的偶数都能拆分为2个质数
//    求证6到1000内的所有偶数都成立
    public static void main(String[] args) {
        boolean flag = false; // 标记,一个数是否可以分解为两个质数之和
        for (int number = 6; number < 1000; number += 2) { // 2-1000偶数
            flag = false;
            for (int frequency = 2; frequency <= number / 2; frequency++) {
                if (primeNumberJudge(frequency)) { // 以当前的数字作为取值范围,找出第一个质数
                    if (primeNumberJudge(number - frequency)) { // 一个数能分解为两质数之和,意味着这个数减去一个质数其结果也是一个质数
                        System.out.println(number + "可以分为" + frequency + "+" + (number - frequency));
                        flag = true; // 一个数字能分解为两个质数之和则标记为true
                        break; // 找出当前质数的两个素因子直接跳出当前数字的循环
                    }
                }
            }
            if (flag == false) { // 当设定的flag为false则说明上面的循环并未找到两个质数的和,不成立的数字找到,跳出所有循环
                System.out.println(number + "不能分解为两个质数的和");
                break;
            }

        }
    }

    private static boolean primeNumberJudge(int number) { // 质数判断
        for (int frequency = 2; frequency <= number / 2; frequency++) {
            if (number % frequency == 0) {
                return false;
            }
        }
        return true;
    }
}
