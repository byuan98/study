package job;

public class Job2 {
//	дһ������ static void getCount(String s);��ӡs�������ַ� ��ĸ�ַ� �����ַ����ֵĴ���
    public static void main(String[] args) {
        getCount("^^ss^&&23565gggpg&*(((123sssss");
    }

    static void getCount(String s) {
        int numberCount = 0, letterCount = 0;
        char[] arrayString = s.toCharArray();
        for (char c : arrayString) {
            if (c <= '9' && c >= '0') {
                numberCount++;
            } else if (((int) c <= 90 && (int) c >= 65) || ((int) c <= 122 && (int) c >= 97)) {
                letterCount++;
            }
        }
        System.out.println("�ַ��������ֳ�����" + numberCount + "��,��ĸ������" + letterCount + "��,�����ַ�������"
                + (s.length() - numberCount - letterCount) + "��");
    }
}
