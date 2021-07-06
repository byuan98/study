package job;

import java.util.*;

public class UserRegister {
//	在注册时通常要验证用户名和密码是否合法，运用学习过的知识完成如下操作：
//	用户名长度大于等于6位，必须包含数字和英文字母
//	密码长度大于等于8位，必须包含特殊符合_或者$，英文字母以及数字
//	以上两个条件同时成立注册才能成功。
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter you username:");
        String userName = input.next();
        System.out.println("Please enter you password:");
        String userPassword = input.next();
        if (lengthVerification(userName, userName) && numberVerfication(userName) && letterVerfication(userName)
                && othercharacterVerfication(userName)) {
            System.out.println("用户名通过校检");
            if (numberVerfication(userPassword) && letterVerfication(userPassword)
                    && othercharacterVerfication(userPassword) && characterVerfication(userPassword)) {
                System.out.println("密码通过校检");
                System.out.println("注册成功");
            } else {
                System.out.println("密码未通过校检");
                System.out.println("可能存在的原因:");
                if (numberVerfication(userPassword) != true) {
                    System.out.println("密码中未包含数字");
                }
                if (letterVerfication(userPassword) != true) {
                    System.out.println("密码中未包含字母");
                }
                if (characterVerfication(userPassword) != true) {
                    System.out.println("密码中未包含特殊字符'_'或'$'");
                }
                if (othercharacterVerfication(userPassword) != true) {
                    System.out.println("密码中包含除特殊字符'_'或'$'以外的非法字符");
                }
            }
        } else {
            System.out.println("用户名未通过校检");
            System.out.println("可能存在的原因:");
            if (lengthVerification(userName, userName) != true) {
                System.out.println("用户名或密码的长度中不满指定位数");
            }
            if (numberVerfication(userName) != true) {
                System.out.println("用户名中未包含数字");
            }
            if (letterVerfication(userName) != true) {
                System.out.println("用户名中未包含字母");
            }
            if (othercharacterVerfication(userName) != true) {
                System.out.println("用户名中包含非法字符");
            }
        }
    }

    private static boolean lengthVerification(String userName, String userPassword) { // 长度验证
        if (userName.length() >= 6 && userPassword.length() >= 8) {
            return true;
        }
        return false;
    }

    private static boolean numberVerfication(String str) { // 数字验证
        for (int index = 0; index < str.length(); index++) {
            if (str.charAt(index) >= '0' && str.charAt(index) <= '9') {
                return true;
            }
        }
        return false;
    }

    private static boolean letterVerfication(String str) { // 字母验证
        for (int index = 0; index < str.length(); index++) {
            if ((str.charAt(index) >= 'A' && str.charAt(index) <= 'Z')
                    || (str.charAt(index) >= 'a' && str.charAt(index) <= 'z')) {
                return true;
            }
        }
        return false;
    }

    private static boolean characterVerfication(String str) { // 字符验证
        for (int index = 0; index < str.length(); index++) {
            if (str.charAt(index) == '_' || str.charAt(index) == '$') {
                return true;
            }
        }
        return false;
    }

    private static boolean othercharacterVerfication(String str) { // 其他字符验证
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
