package code;

public class BinHexOctDemo {
//进制转换Demo 以十进制转十六进制为例
    public static void main(String[] args) {
        System.out.println(binHexOct16(1998));

    }

    public static String binHexOct16(int number) {
        // 创建一个字符数组,将16进制的所有字符全部装进去
        char[] array = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
        // 存放结果
        String result = "";

        // 只要number不等于0就一直循环
        while (number != 0) {
            // 获取n的m进制,循环拿n余m,再除m,直到0
            // 以上逻辑得到的结果需要倒着看,所以我们使用利用字符串的拼接,
            // 将每次获得的结果放到现有结果之前
            result = array[number % 16] + result;
            number /= 16;
        }
        return result;
    }
}