package test;

public class TestTwo {

    public static void main(String[] args) {
        Son s = new Son("Andrew", 18, "I am what i am", "Keep efforts");

    }
}

class Father {
    String name;
    int age = 0;
    static String apothegm;

    Father() {
    }

    Father(String name, int age, String apothegm) {
        this.name = name;
        this.age = age;
        this.apothegm = apothegm;
    }

    static void speak(String content) {
        System.out.println(content);
    }
}

class Son extends Father {
    String name = "Alger";
    static String experience;

    Son(String name, int age, String apothegm, String experience) {
        super(name, age, apothegm);
        this.experience = experience;
    }

    void handstand() {
        System.out.println("I'm standing upside down");
    }
}
