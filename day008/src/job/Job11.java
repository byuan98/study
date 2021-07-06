package job;

public class Job11 {
//	写一个方法:用于两个字符串的比较
//  先比较长度:s1长度大于s2就返回1,小于就返回-1   
//  如果长度相同:再逐个字符按编码集做比较,s1大就返回1,s1小返回-1相同返回0
//  public static int  myCompareto(String s1,String s2)
    public static void main(String[] args) {
        System.out.println(myCompareto("123", "678"));

    }

    public static int myCompareto(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return 1;
        } else if (s1.length() < s2.length()) {
            return -1;
        } else {
            for (int index = 0; index < s1.length(); index++) {
                if ((int) s1.charAt(index) > (int) s2.charAt(index)) {
                    return 1;
                } else if ((int) s1.charAt(index) < (int) s2.charAt(index)) {
                    return -1;
                }
            }
        }
        return 0;
    }
}
