package code;

import java.util.*;

public class AccountText {
//	����һ���˻�Account�࣬������id:�˻�����(������),password:�˻�����,
//	name:��ʵ����,personId:���֤���� �ַ�������,email:�ͻ��ĵ�������,
//	balance:�˻����.����:
//	deposit: ����,������double�͵Ľ��;
//  withdraw:ȡ���,������double�͵Ľ��.
//  ���췽��:�вκ��޲�,�вι��췽���������ñ�Ҫ������
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

//	deposit: ����,������double�͵Ľ��;
//  withdraw:ȡ���,������double�͵Ľ��.
    public void deposit(double money) {
        this.balance += money;
        System.out.println("���ɹ�,���ĵ�ǰ���Ϊ:" + this.balance);
    }

    public void withdraw(double money) {
        System.out.println("�����������ʻ�����");
        Scanner input = new Scanner(System.in);
        String password = input.next();
        if (passwordVerify(password)) {
            System.out.println("������֤�ɹ�");
            if (this.balance > money || this.balance == money) {
                this.balance -= money;
                System.out.println("���ɹ�,���ĵ�ǰ���Ϊ:" + this.balance);
            } else {
                System.out.println("ȡ��ʧ��,��������");
            }
        } else {
            System.out.println("������֤ʧ��");
        }
    }

    private boolean passwordVerify(String password) {
        if (this.password.equals(password)) {
            return true;
        }
        return false;
    }
}
