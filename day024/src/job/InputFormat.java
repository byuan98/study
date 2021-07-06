package job;

public class InputFormat {
//	写一个方法 static void getDay(String s);打印s表示的年月日 s的格式：xxxx年xx月xx日
    public static void main(String[] args) {
        getDay("2021年12月23日");

    }

    static void getDay(String s) {
        String yearStr = "";
        String monthStr = "";
        String dayStr = "";
        for (int indexYear = 0; indexYear < s.length(); indexYear++) {
            if (s.charAt(indexYear) == '年') {
                break;
            }
            yearStr += s.charAt(indexYear);
        }
        monthStr = "" + s.charAt(s.length() - 6) + s.charAt(s.length() - 3);
        dayStr = "" + s.charAt(s.length() - 3) + s.charAt(s.length() - 2);
        System.out.println(s + "表示" + yearStr + "年" + monthStr + "月" + dayStr + "日");

    }
}
