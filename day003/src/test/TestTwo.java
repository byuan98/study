package test;

public class TestTwo {

    public static void main(String[] args) {
        Breeder b = new Breeder();
        Cattle cattle = new Cattle();
        b.feed(cattle);
    }
}

class Breeder {
    String name;

    void feed(Tiger tight) {
        tight.eat();
    }

    void feed(Cattle cattle) {
        cattle.eat();
    }

    void put(Tiger tight) {
        tight.movement();
    }

    void put(Cattle cattle) {
        cattle.movement();
    }
}

class Tiger {
    String name;

    void eat() {
        System.out.println("tight�ڳ���");

    }

    void movement() {
        System.out.println("tight�ڴ��");
    }
}

class Cattle {
    String name;

    void eat() {
        System.out.println("Cattle�ڳԲ�");

    }

    void movement() {
        System.out.println("Cattle��ĥ��");
    }
}
