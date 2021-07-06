package code;

public class PolymorphismCaseOne {
//��̬��ʹ�ó���һ��
//���巽��ʱ,�����б���Ϊ��������,�����Ϳ��Դ��������������
    public static void main(String[] args) {
        Keeper keeper = new Keeper();

        Animal animalTiger = new Tiger();
        keeper.feeding(animalTiger);

        Monkey animalMonkey = new Monkey();
        Keeper.feeding(animalMonkey);// �ȼ���Animal animalMonkey=new Monkey();
        // ��Ϊfeeding�������β�������Animal,������һ���͵ȼ�������horse�������

        Horse horse = new Horse();
        Animal animalHorse = horse;
        keeper.feeding(animalHorse);

    }

}

class Keeper {
    private String name = "Godfery";

    static void feeding(Animal animal) {
        animal.eat();
    }

    static void stocking(Animal animal) {
        animal.movement();
    }
}

abstract class Animal {
    abstract void eat();

    abstract void movement();
}

class Tiger extends Animal {
    private String name = "tight";

    void eat() {
        System.out.println("The " + this.name + " is eating meat.");
    }

    void movement() {
        System.out.println("The " + this.name + " is taking a walk.");
    }
}

class Monkey extends Animal {
    private String name = "monkey";

    void eat() {
        System.out.println("The " + this.name + " is eating bananas.");
    }

    void movement() {
        System.out.println("The " + this.name + " is climbing a tree.");
    }
}

class Horse extends Animal {
    private String name = "horse";

    void eat() {
        System.out.println("The " + this.name + " is eating grass.");
    }

    void movement() {
        System.out.println("The " + this.name + " is running.");
    }
}