package job;

public class LetterShift {
//	写一个方法 static String changeStr(String s); 大写转换为小写 小写转换为大写 删除数字
    public static void main(String[] args) {
        System.out.println(changeStr("azAZ123@"));

    }

    static String changeStr(String s) {
        String sCopy = "";
        for (int index = 0; index < s.length(); index++) {
            if (s.charAt(index) >= 'a' && s.charAt(index) <= 'z') {
                sCopy += (char) (s.charAt(index) - 32);
            } else if (s.charAt(index) >= 'A' && s.charAt(index) <= 'Z') {
                sCopy += (char) (s.charAt(index) + 32);
            } else if (s.charAt(index) >= '0' && s.charAt(index) <= '9') {
                continue;
            } else {
                sCopy += s.charAt(index);
            }
        }

        return sCopy;
    }

}
