package job;

public class Job7 {
//	写一个方法static String changeStr(String s);
//	去除叠词：："123111222444766"--"12312476"
    public static void main(String[] args) {
        System.out.println(changeStr("uiiuggggggggguguyg"));
        System.out.println(changeStrCount("uiiuuguyg"));

    }

    static String changeStr(String s) {
        String sCopy = "";
        char[] arrayString = s.toCharArray();
        for (int index = 1; index < arrayString.length; index++) {
            if (arrayString[index - 1] != arrayString[index]) {
                sCopy += arrayString[index];
            }
        }
        return sCopy;
    }

    static String changeStrCount(String s) {
        String sCopy = "";
        for (int index = 1; index < s.length(); index++) {
            System.out.println(s.charAt(index) + "::" + s.charAt(index - 1));
        }
        return sCopy;
    }
}
