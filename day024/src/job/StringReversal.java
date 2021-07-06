package job;

public class StringReversal {
//	写一个方法  把参数字符串反转："123456"--->"654321"
    public static void main(String[] args) {
        System.out.println(strReversal("234432asddsa"));
    }

    static String strReversal(String str) {
        String strCopy = "";
        for (int index = str.length() - 1; index >= 0; index--) {
            strCopy += str.charAt(index);
        }
        return strCopy;
    }
}
