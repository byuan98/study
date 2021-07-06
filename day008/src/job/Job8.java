package job;

public class Job8 {
//	写一个方法static int  getInt(String s);获取参数字符串对应的整数："123"----123
    public static void main(String[] args) {
        System.out.println(getInt("123657"));

    }

    static int getInt(String s) {
        int numberStr = 0;
        for (int index = 0; index < s.length(); index++) {
            if ((int) s.charAt(index) > 57 || (int) s.charAt(index) < 48) {
                System.err.println("您输入的参数有误,不能带有除数字以外的其他字符");
                return 0;
            }
        }
        for (int index = 0; index < s.length(); index++) {
            numberStr += ((int) s.charAt(index) - 48) * (int) Math.pow(10, s.length() - index - 1);
        }
        return numberStr;
    }
}
