package job;

public class Job12 {
//	写一个方法  把参数字符串反转："123456"--->"654321"
    public static void main(String[] args) {
        System.out.println(stringReverse("123456"));
        System.out.println(stringReverse("fewgvrgehrthj"));

    }

    static String stringReverse(String str) {
        String strReverse = "";
        for (int index = str.length() - 1; index >= 0; index--) {
            strReverse += str.charAt(index);
        }
        return strReverse;
    }
}
