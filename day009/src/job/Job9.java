package job;

public class Job9 {
//	写一个方法static int  getInt(String s);
//	获取参数字符串中所有数字对应的最大整数："ab1hy75tr0"----7510
    public static void main(String[] args) {
        System.out.println(getInt("bfwuibgfie4545903tu9ll"));

    }

    static int getInt(String s) {
        String sCopy = "";
        int nuuber = 0;
        for (int index = 0; index < s.length(); index++) {
            if (s.charAt(index) >= '0' && s.charAt(index) <= '9') {
                sCopy += s.charAt(index);
            }
        }
        char[] arraySCopy = sCopy.toCharArray();
        char transit;
        for (int low = 0; low < arraySCopy.length; low++) {
            for (int high = low + 1; high < arraySCopy.length; high++) {
                if (arraySCopy[low] < arraySCopy[high]) {
                    transit = arraySCopy[low];
                    arraySCopy[low] = arraySCopy[high];
                    arraySCopy[high] = transit;
                }
            }
        }
        return Integer.parseInt(new String(arraySCopy));
    }
}
