package job;

public class Job5 {
//	写一个方法 static void getDay(String s);打印s表示的年月日  s的格式：xxxx年xx月xx日
    public static void main(String[] args) {
        getDay("20201130");
    }

    static void getDay(String s) {
        int day = Integer.parseInt(s.substring(s.length() - 2, s.length()));
        int month = Integer.parseInt(s.substring(s.length() - 4, s.length() - 2));
        int year = Integer.parseInt(s.substring(0, s.length() - 4));
        if (day > 31 || day < 1) {
            System.out.println("您输入的字符串无法转换成日期格式,理由:末尾的天数不对");
            return;
        } else if (month > 12 || month < 1) {
            System.out.println("您输入的字符串无法转换成日期格式,理由:月份不对");
            return;
        }
        int[] monthDays = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        monthDays[2] = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 29 : 28;
        if (day > monthDays[month]) {
            System.out.println("您输入的字符串无法转换成日期格式,理由:月份对应的天数不对");
            return;
        }
        System.out.println(year + "年" + (month < 10 ? "0" + month : month) + "月" + (day < 10 ? "0" + day : day) + "日");
    }
}
