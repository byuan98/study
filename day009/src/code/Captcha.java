package code;

public class Captcha {

    public static void main(String[] args) {
        captcha("zby123456", "123456aa$");
        // 固定功能、出现两次或两次以上
    }

    private static void captcha(String id, String password) {
        boolean number = false;
        boolean letter = false;
        boolean special = false;
        if (id.length() < 6) {
            System.out.println("用户名长度小于6,请重新输入");
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
            System.out.println("用户名通过验证");
        } else {
            System.out.println("用户名未通过验证,请重新输入");
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
            System.out.println("密码通过验证");
            System.out.println("恭喜您注册成功");
        } else {
            System.out.println("用户密码未通过验证,请重新输入");
            return;
        }
    }
}
