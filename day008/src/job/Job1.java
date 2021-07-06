package job;

public class Job1 {
//  写一个方法 static void getCount(String s,char c);打印c字符在s中出现的次数
    public static void main(String[] args) {
        getCount("abcdesdasdafrewfwfwcvrfv", 'v');
    }

    static void getCount(String s, char c) {
        char[] arrayString = s.toCharArray();
        int count = 0;
        for (char ch : arrayString) {
            if (ch == c) {
                count++;
            }
        }
        System.out.println("字符" + c + "在" + s + "中出现的次数为:" + count);
    }
}
