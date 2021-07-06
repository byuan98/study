package job;

public class StringCompare {
//	写一个方法用于两个字符串的比较
//  先比较长度 s1长度大于s2就返回1 小于就返回-1   
//  如果长度相同：再逐个字符按编码集做比较s1大就返回1 s1小返回-1相同返回0
//  public static int  myCompareto(String s1,String s2)
    public static void main(String[] args) {
        System.out.println(myCompareto("a123450", "b612345"));

    }

    public static int myCompareto(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return s1.length() > s2.length() ? 1 : -1;
        }

        for (int index = 0; index < s1.length(); index++) {
            if (s1.charAt(index) > s2.charAt(index)) {
                return 1;
            } else if (s1.charAt(index) < s2.charAt(index)) {
                return -1;
            }
        }
        return 0;
    }
}
