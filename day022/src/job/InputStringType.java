package job;

public class InputStringType {
//	2：写一个方法 static void getCount(String s);打印s中数字字符 字母字符 其他字符出现的次数
    public static void main(String[] args) {
        getCount("a1b2c3d4eee&&&***");

    }

    static void getCount(String s) {
        int numberFrequency = 0;
        int letterFrequency = 0;
        int otherFrequency = 0;

        for (int index = 0; index < s.length(); index++) {
            if (s.charAt(index) >= '0' && s.charAt(index) <= '9') {
                numberFrequency++;
            } else if ((s.charAt(index) >= 'a' && s.charAt(index) <= 'z')
                    || (s.charAt(index) >= 'A' && s.charAt(index) <= 'Z')) {
                letterFrequency++;
            } else {
                otherFrequency++;
            }
        }
        System.out.println("在字符串" + s + "中,数字共出现了" + numberFrequency + "次,字母共出现了" + letterFrequency + "次,其他字符共出现了"
                + otherFrequency + "次");
    }

}
