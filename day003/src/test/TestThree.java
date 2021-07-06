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
        System.out.println(this.name + "在吃肉");
    }

    void movement() {
        System.out.println(this.name + "在打架");
    }
}

class Cattles extends Animal {
    String name = "Cattle";

    void eat() {
        System.out.println(this.name + "在吃草");
    }

    void movement() {
        System.out.println(this.name + "在磨角");
    }
}