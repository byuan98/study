package job;

public class Job1 {
//  дһ������ static void getCount(String s,char c);��ӡc�ַ���s�г��ֵĴ���
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
        System.out.println("�ַ�" + c + "��" + s + "�г��ֵĴ���Ϊ:" + count);
    }
}
