package job;

public class DeleteReduplication {
//	дһ������static String changeStr(String s);
//	ȥ�����ʣ���"123111222444766"--"12312476"
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
