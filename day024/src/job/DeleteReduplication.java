package job;

public class DeleteReduplication {
//	写一个方法static String changeStr(String s);
//	去除叠词：："123111222444766"--"12312476"
    public static void main(String[] args) {
        System.out.println(changeStr("1123111222444766"));

    }

    static String changeStr(String s) {
        String sCopy = "" + s.charAt(0);
        for (int index = 1; index < s.length(); index++) {
            if (s.charAt(index - 1) != s.charAt(index)) {
                sCopy += s.charAt(index);
            }
        }
        return sCopy;

    }
}
