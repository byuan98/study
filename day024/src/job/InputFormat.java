package job;

public class InputFormat {
//	дһ������ static void getDay(String s);��ӡs��ʾ�������� s�ĸ�ʽ��xxxx��xx��xx��
    public static void main(String[] args) {
        getDay("2021��12��23��");

    }

    static void getDay(String s) {
        String yearStr = "";
        String monthStr = "";
        String dayStr = "";
        for (int indexYear = 0; indexYear < s.length(); indexYear++) {
            if (s.charAt(indexYear) == '��') {
                break;
            }
            yearStr += s.charAt(indexYear);
        }
        monthStr = "" + s.charAt(s.length() - 6) + s.charAt(s.length() - 3);
        dayStr = "" + s.charAt(s.length() - 3) + s.charAt(s.length() - 2);
        System.out.println(s + "��ʾ" + yearStr + "��" + monthStr + "��" + dayStr + "��");

    }
}
