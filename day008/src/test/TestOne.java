package test;

import java.util.*;

public class TestOne {
    // Math��
    public static void main(String[] args) {
        String verify = randomString();
        Scanner input = new Scanner(System.in);
        System.out.println("������֤��Ϊ��" + verify);
        while (true) {
            System.out.println("������������֤�룺");
            String youVerify = input.next();
            if (youVerify.equals(verify)) {
                System.out.println("��֤ͨ��");
                break;
            }
            System.out.println("��֤ʧ��,������");
        }
    }

    private static String randomString() {
        String str = "";
        for (int number = 0; number < 4; number++) {
            int index = (int) (Math.random() * 3);
            if (index == 0) {
                str += ("" + (int) (Math.random() * 10)); // 0-9
            } else if (index == 1) {
                str += ((char) (Math.random() * 26 + 97)); // a-z
            } else {
                str += ((char) (Math.random() * 26 + 65)); // A-Z
            }
        }
        return str;
    }
}