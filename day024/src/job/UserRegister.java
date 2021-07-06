package job;

import java.util.*;

public class UserRegister {
//	��ע��ʱͨ��Ҫ��֤�û����������Ƿ�Ϸ�������ѧϰ����֪ʶ������²�����
//	�û������ȴ��ڵ���6λ������������ֺ�Ӣ����ĸ
//	���볤�ȴ��ڵ���8λ����������������_����$��Ӣ����ĸ�Լ�����
//	������������ͬʱ����ע����ܳɹ���
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter you username:");
        String userName = input.next();
        System.out.println("Please enter you password:");
        String userPassword = input.next();
        if (lengthVerification(userName, userName) && numberVerfication(userName) && letterVerfication(userName)
                && othercharacterVerfication(userName)) {
            System.out.println("�û���ͨ��У��");
            if (numberVerfication(userPassword) && letterVerfication(userPassword)
                    && othercharacterVerfication(userPassword) && characterVerfication(userPassword)) {
                System.out.println("����ͨ��У��");
                System.out.println("ע��ɹ�");
            } else {
                System.out.println("����δͨ��У��");
                System.out.println("���ܴ��ڵ�ԭ��:");
                if (numberVerfication(userPassword) != true) {
                    System.out.println("������δ��������");
                }
                if (letterVerfication(userPassword) != true) {
                    System.out.println("������δ������ĸ");
                }
                if (characterVerfication(userPassword) != true) {
                    System.out.println("������δ���������ַ�'_'��'$'");
                }
                if (othercharacterVerfication(userPassword) != true) {
                    System.out.println("�����а����������ַ�'_'��'$'����ķǷ��ַ�");
                }
            }
        } else {
            System.out.println("�û���δͨ��У��");
            System.out.println("���ܴ��ڵ�ԭ��:");
            if (lengthVerification(userName, userName) != true) {
                System.out.println("�û���������ĳ����в���ָ��λ��");
            }
            if (numberVerfication(userName) != true) {
                System.out.println("�û�����δ��������");
            }
            if (letterVerfication(userName) != true) {
                System.out.println("�û�����δ������ĸ");
            }
            if (othercharacterVerfication(userName) != true) {
                System.out.println("�û����а����Ƿ��ַ�");
            }
        }
    }

    private static boolean lengthVerification(String userName, String userPassword) { // ������֤
        if (userName.length() >= 6 && userPassword.length() >= 8) {
            return true;
        }
        return false;
    }

    private static boolean numberVerfication(String str) { // ������֤
        for (int index = 0; index < str.length(); index++) {
            if (str.charAt(index) >= '0' && str.charAt(index) <= '9') {
                return true;
            }
        }
        return false;
    }

    private static boolean letterVerfication(String str) { // ��ĸ��֤
        for (int index = 0; index < str.length(); index++) {
            if ((str.charAt(index) >= 'A' && str.charAt(index) <= 'Z')
                    || (str.charAt(index) >= 'a' && str.charAt(index) <= 'z')) {
                return true;
            }
        }
        return false;
    }

    private static boolean characterVerfication(String str) { // �ַ���֤
        for (int index = 0; index < str.length(); index++) {
            if (str.charAt(index) == '_' || str.charAt(index) == '$') {
                return true;
            }
        }
        return false;
    }

    private static boolean othercharacterVerfication(String str) { // �����ַ���֤
        for (int index = 0; index < str.length(); index++) {
            if (str.charAt(index) == '_' || str.charAt(index) == '$') {
                continue;
            }

            if ((str.charAt(index) >= 'A' && str.charAt(index) <= 'Z')
                    || (str.charAt(index) >= 'a' && str.charAt(index) <= 'z')) {
                continue;
            }

            if (str.charAt(index) >= '0' && str.charAt(index) <= '9') {
                continue;
            }
            return false;
        }
        return true;

    }
}
