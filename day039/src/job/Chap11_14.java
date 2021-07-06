package job;

import java.util.*;

public class Chap11_14 {

    public static void main(String[] args) {
        UserBizlmpl u = new UserBizlmpl();

    }
}

//����һ��User�û���
class User {
    private String username;// �û���¼��
    private String password;// �û�����
    private String name;// �û���ʵ����
    private String email;// �û����������ַ

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

//����һ���쳣��:LoginException,��ʾ��½�쳣
class LoginException extends Exception {
    LoginException(String message) {
        super(message);// ͨ�����ø����в����Ĺ��췽���������쳣ԭ��
    }
}

//����һ���쳣��:RegisterException,��ʾע���쳣
class RegisterException extends Exception {
    RegisterException(String message) {
        super(message);// ͨ�����ø����в����Ĺ��췽���������쳣ԭ��
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