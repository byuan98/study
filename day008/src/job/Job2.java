package job;

public class Job2 {
//	写一个方法 static void getCount(String s);打印s中数字字符 字母字符 其他字符出现的次数
    public static void main(String[] args) {
        getCount("^^ss^&&23565gggpg&*(((123sssss");
    }

    static void getCount(String s) {
        int numberCount = 0, letterCount = 0;
        char[] arrayString = s.toCharArray();
        for (char c : arrayString) {
            if (c <= '9' && c >= '0') {
                numberCount++;
            } else if (((int) c <= 90 && (int) c >= 65) || ((int) c <= 122 && (int) c >= 97)) {
                letterCount++;
            }
        }
        System.out.println("字符串中数字出现了" + numberCount + "次,字母出现了" + letterCount + "次,其他字符出现了"
                + (s.length() - numberCount - letterCount) + "次");
    }
}
