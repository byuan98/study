package test;

public class TestFour {
//  дһ������ʵ���ַ���ת��:��Сд��ת,����ɾ��;ֻ��ʹ���ַ���������
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("1a2b3c4dABCDEFG");
        convertString(s);
    }

    private static void convertString(StringBuffer s) {
        for (int index = 0; index < s.length(); index++) {
            if (s.charAt(index) >= '0' && s.charAt(index) <= '9') {
                s.deleteCharAt(index);
                continue;
            }
        }
        System.out.println(s);

        for (int index = 0; index < s.length(); index++) {
            if (s.charAt(index) >= 'A' && s.charAt(index) <= 'Z') {
                s.setCharAt(index, (char) (s.charAt(index) + 32));
            } else if (s.charAt(index) >= 'a' && s.charAt(index) <= 'z') {
                s.setCharAt(index, (char) (s.charAt(index) - 32));
            }
        }
        System.out.println(s);
    }
}
