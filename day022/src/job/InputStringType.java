package job;

public class InputStringType {
//	2��дһ������ static void getCount(String s);��ӡs�������ַ� ��ĸ�ַ� �����ַ����ֵĴ���
    public static void main(String[] args) {
        getCount("a1b2c3d4eee&&&***");

    }

    static void getCount(String s) {
        int numberFrequency = 0;
        int letterFrequency = 0;
        int otherFrequency = 0;

        for (int index = 0; index < s.length(); index++) {
            if (s.charAt(index) >= '0' && s.charAt(index) <= '9') {
                numberFrequency++;
            } else if ((s.charAt(index) >= 'a' && s.charAt(index) <= 'z')
                    || (s.charAt(index) >= 'A' && s.charAt(index) <= 'Z')) {
                letterFrequency++;
            } else {
                otherFrequency++;
            }
        }
        System.out.println("���ַ���" + s + "��,���ֹ�������" + numberFrequency + "��,��ĸ��������" + letterFrequency + "��,�����ַ���������"
                + otherFrequency + "��");
    }

}
