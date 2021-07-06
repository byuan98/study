package job;

public class InputCharFrequency {
//	1：写一个方法 static void getCount(String s,char c);打印c字符在s中出现的次数
    public static void main(String[] args) {
        getCount("rtfthtyhyh", 'r');

    }

    static void getCount(String s, char c) {
        int number = 0;
        for (int index = 0; index < s.length(); index++) {
            if (s.charAt(index) == c) {
                number++;
            }
        }
        System.out.println(c + "字符在" + s + "中出现的次数为" + number + "次");
    }

}
