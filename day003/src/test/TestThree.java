package test;

public class TestThree {

    public static void main(String[] args) {
        Breeders breeder = new Breeders();
        Animal animalTigers = new Tigers();
        Animal animalCattles = new Cattles();
        breeder.Feed(animalTigers);
        breeder.Feed(animalCattles);

    }

}

class Breeders {
    String name = "Godfery";

    void Feed(Animal animal) {
        animal.eat();
    }
}

abstract class Animal {
    abstract void eat();

    abstract void movement();
}

class Tigers extends Animal {
    String name = "Tight";

    void eat() {
        System.out.println(this.name + "�ڳ���");
    }

    void movement() {
        System.out.println(this.name + "�ڴ��");
    }
}

class Cattles extends Animal {
    String name = "Cattle";

    void eat() {
        System.out.println(this.name + "�ڳԲ�");
    }

    void movement() {
        System.out.println(this.name + "��ĥ��");
    }
}