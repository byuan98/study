package code;

public class Captcha {

    public static void main(String[] args) {
        captcha("zby123456", "123456aa$");
        // �̶����ܡ��������λ���������
    }

    private static void captcha(String id, String password) {
        boolean number = false;
        boolean letter = false;
        boolean special = false;
        if (id.length() < 6) {
            System.out.println("�û�������С��6,����������");
        }
        for (int index = 0; index < id.length(); index++) {
            if (id.charAt(index) >= '0' && id.charAt(index) <= '9') {
                number = true;
            }
            if ((id.charAt(index) >= 'a' && id.charAt(index) <= 'z')
                    || (id.charAt(index) >= 'A' && id.charAt(index) <= 'Z')) {
                letter = true;
            }
        }
        if (number == true && letter == true) {
            System.out.println("�û���ͨ����֤");
        } else {
            System.out.println("�û���δͨ����֤,����������");
            return;
        }

        number = false;
        letter = false;

        for (int index = 0; index < password.length(); index++) {
            if (password.charAt(index) >= '0' && password.charAt(index) <= '9') {
                number = true;
            }
            if ((password.charAt(index) >= 'a' && password.charAt(index) <= 'z')
                    || (password.charAt(index) >= 'A' && password.charAt(index) <= 'Z')) {
                letter = true;
            }
            if (password.charAt(index) == '_' || password.charAt(index) <= '$') {
                special = true;
            }
        }
        if (number == true && letter == true && special == true) {
            System.out.println("����ͨ����֤");
            System.out.println("��ϲ��ע��ɹ�");
        } else {
            System.out.println("�û�����δͨ����֤,����������");
            return;
        }
    }
}
