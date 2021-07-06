package job;

public class StringToInt {
//	写一个方法static int getInt(String s);获取参数字符串对应的整数："123"----123
    public static void main(String[] args) {
        System.out.println(getInt("10000"));

    }

    static int getInt(String s) {
        int strInt = 0;
        for (int index = 0; index < s.length(); index++) {
            strInt += (s.charAt(index) - '0') * (Math.pow(10, s.length() - index - 1));
        }
        return strInt;
    }
}
