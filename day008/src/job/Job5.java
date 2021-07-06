package job;

public class Job5 {
//	дһ������ static void getDay(String s);��ӡs��ʾ��������  s�ĸ�ʽ��xxxx��xx��xx��
    public static void main(String[] args) {
        getDay("20201130");
    }

    static void getDay(String s) {
        int day = Integer.parseInt(s.substring(s.length() - 2, s.length()));
        int month = Integer.parseInt(s.substring(s.length() - 4, s.length() - 2));
        int year = Integer.parseInt(s.substring(0, s.length() - 4));
        if (day > 31 || day < 1) {
            System.out.println("��������ַ����޷�ת�������ڸ�ʽ,����:ĩβ����������");
            return;
        } else if (month > 12 || month < 1) {
            System.out.println("��������ַ����޷�ת�������ڸ�ʽ,����:�·ݲ���");
            return;
        }
        int[] monthDays = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        monthDays[2] = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 29 : 28;
        if (day > monthDays[month]) {
            System.out.println("��������ַ����޷�ת�������ڸ�ʽ,����:�·ݶ�Ӧ����������");
            return;
        }
        System.out.println(year + "��" + (month < 10 ? "0" + month : month) + "��" + (day < 10 ? "0" + day : day) + "��");
    }
}
