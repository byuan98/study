package code;

import java.util.*;

public class AccountText {
//	创建一个账户Account类，该类有id:账户号码(长整数),password:账户密码,
//	name:真实姓名,personId:身份证号码 字符串类型,email:客户的电子邮箱,
//	balance:账户余额.方法:
//	deposit: 存款方法,参数是double型的金额;
//  withdraw:取款方法,参数是double型的金额.
//  构造方法:有参和无参,有参构造方法用于设置必要的属性
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.deposit(10000);
        a1.withdraw(100);
    }
}

class Account {
    private static long idPool = 2021001;
    private long id;
    private String password;
    private String name;
    private String personId;
    private String email;
    private double balance;

    Account() {
        this.id = idPool;
        idPool++;
    }

    Account(String password, String name, String personId, String email) {
        this.id = idPool;
        this.password = password;
        this.name = name;
        this.personId = personId;
        this.email = email;
        idPool++;
    }

//	deposit: 存款方法,参数是double型的金额;
//  withdraw:取款方法,参数是double型的金额.
    public void deposit(double money) {
        this.balance += money;
        System.out.println("存款成功,您的当前余额为:" + this.balance);
    }

    public void withdraw(double money) {
        System.out.println("请输入您的帐户密码");
        Scanner input = new Scanner(System.in);
        String password = input.next();
        if (passwordVerify(password)) {
            System.out.println("密码验证成功");
            if (this.balance > money || this.balance == money) {
                this.balance -= money;
                System.out.println("存款成功,您的当前余额为:" + this.balance);
            } else {
                System.out.println("取款失败,您的余额不足");
            }
        } else {
            System.out.println("密码验证失败");
        }
    }

    private boolean passwordVerify(String password) {
        if (this.password.equals(password)) {
            return true;
        }
        return false;
    }
}
