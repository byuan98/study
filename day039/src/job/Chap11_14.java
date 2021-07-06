package job;

import java.util.*;

public class Chap11_14 {

    public static void main(String[] args) {
        UserBizlmpl u = new UserBizlmpl();

    }
}

//创建一个User用户类
class User {
    private String username;// 用户登录名
    private String password;// 用户密码
    private String name;// 用户真实姓名
    private String email;// 用户电子邮箱地址

    User() {

    }

    User(String username, String password, String name, String email) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {

        return "password:" + this.password + ",name:" + this.name + ",email:" + this.email;
    }

}

//定义一个异常类:LoginException,表示登陆异常
class LoginException extends Exception {
    LoginException(String message) {
        super(message);// 通过调用父类有参数的构造方法来传递异常原因
    }
}

//定义一个异常类:RegisterException,表示注册异常
class RegisterException extends Exception {
    RegisterException(String message) {
        super(message);// 通过调用父类有参数的构造方法来传递异常原因
    }
}

interface UserBiz {
    void register(String username, String password, String password2, String name, String email)
            throws RegisterException;

    void login(String username, String password) throws LoginException;
}

class UserBizlmpl {

    private User u1 = new User("admin", "admin", "Administrator", "admin@123.com");
    private User u2 = new User("Tom", "cat", "tomcat", "tomcat@cat.com");
    private Map<String, User> userMap = new HashMap<String, User>();

    {
        userMap.put(u1.getUsername(), u1);
        userMap.put(u2.getUsername(), u2);
    }

    public void register(String username, String password, String password2, String name, String email)
            throws RegisterException {

    }

    public void login(String username, String password) throws LoginException {

    }
}