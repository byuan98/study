package job;

public class RetainDecimal {
//	写一个方法：public static double change5(double d,int n)
//    对d进行四舍五入 保留n为小数
    public static void main(String[] args) {
        System.out.println(change5(1.1234561, 6));

    }

    public static double change5(double d, int n) {
        for (int number = 0; number < n; number++) { // 保留几位小数就乘以几次10,方便进行任意位数的四舍五入
            d *= 10;
        }
        if (d % 10 >= 5) { // 如果个位数大于等于5,就进一
            d += 10; // 进一操作
            d -= (int) (d % 10); // 舍去进入的个位数,由于d是个double,所以为了保证精确我们去掉小数位
        }
        d = (int) d; // 去除多余的小数位
        for (int number = 0; number < n; number++) {
            d /= 10; // 保留几位就除几次10,这一操作是让小数点向前移动
        }
        return d; // 返回最终值
    }

}
