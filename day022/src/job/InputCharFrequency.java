package job;

public class InputCharFrequency {
//	1��дһ������ static void getCount(String s,char c);��ӡc�ַ���s�г��ֵĴ���
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
        System.out.println(c + "�ַ���" + s + "�г��ֵĴ���Ϊ" + number + "��");
    }

}
