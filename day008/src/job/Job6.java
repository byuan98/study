package job;

public class Job6 {
//	дһ������static String changeStr(String s);
//	��ȡs������ȫ�������ظ����ַ�����"12312345123"--"12345"
    public static void main(String[] args) {
        System.out.println(changeStr("12312345123"));

    }

    static String changeStr(String s) {
        String sCopy = "";
        for (int index = 0; index < s.length(); index++) {
            if (sCopy.contains("" + s.charAt(index))) {
                continue;
            } else {
                sCopy += s.charAt(index);
            }
        }
        return sCopy;
    }
}
