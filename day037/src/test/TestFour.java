package test;

public class TestFour {
//  写一个方法实现字符串转换:大小写互转,数字删除;只能使用字符串缓冲区
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("1a2b3c4dABCDEFG");
        convertString(s);
    }

    private static void convertString(StringBuffer s) {
        for (int index = 0; index < s.length(); index++) {
            if (s.charAt(index) >= '0' && s.charAt(index) <= '9') {
                s.deleteCharAt(index);
                continue;
            }
        }
        System.out.println(s);

        for (int index = 0; index < s.length(); index++) {
            if (s.charAt(index) >= 'A' && s.charAt(index) <= 'Z') {
                s.setCharAt(index, (char) (s.charAt(index) + 32));
            } else if (s.charAt(index) >= 'a' && s.charAt(index) <= 'z') {
                s.setCharAt(index, (char) (s.charAt(index) - 32));
            }
        }
        System.out.println(s);
    }
}
