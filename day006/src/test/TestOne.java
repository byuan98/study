package test;

public class TestOne {

    public static void main(String[] args) {

    }
}

class People {
    String name;
    char sex;

    People() {

    }

    People(String name, char sex) {
        this.name = name;
        this.sex = sex;
    }

    static void said() {
        System.out.println("Hello, world!!!");
    }
}

class Chinese extends People {
    String nationality = "�й�";

    static void said() {
        System.out.println("��ã��й�");
    }
}
