package job;

public class Job3 {
//  写一个方法 static String myTrim(String s);模拟字符串的trim方法
    public static void main(String[] args) {
        System.out.println(myTrim("      "));
        System.out.println(myTrim("   123   "));

    }

    static String myTrim(String s) {
        int indexBegin = 0;
        int indexEnd = s.length() - 1;
        for (; indexBegin < s.length();) {
            char cBegin = s.charAt(indexBegin);
            if (cBegin == ' ') {
                indexBegin++;
            } else {
                break;
            }
        }
        for (; indexBegin < s.length();) {
            char cEnd = s.charAt(indexEnd);
            if (cEnd == ' ') {
                indexEnd--;
            } else {
                break;
            }
        }

        return s = s.substring(indexBegin, indexEnd + 1);
    }
}