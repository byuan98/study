package code;

public class Title3 {
//	打印出所有的 "水仙花数 ",所谓 "水仙花数 "是指一个三位数，
//	其各位数字立方和等于该数本身。
//	例如:153是一个 "水仙花数 ",因为153=1的三次方＋5的三次方＋3的三次方。
    public static void main(String[] args) {
        System.out.println("所有的水仙花数为:");
        for (int number = 100; number <= 999; number++) {
            if (narcissisticNumber(number)) {
                System.out.println(number);
            }
        }
    }

    private static boolean narcissisticNumber(int number) {
        int unit = number / 1 % 10;
        int decade = number / 10 % 10;
        int hundred = number / 100 % 10;
        if (Math.pow(unit, 3) + Math.pow(decade, 3) + Math.pow(hundred, 3) == number) {
            return true;
        }
        return false;
    }

}
