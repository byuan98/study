package test;

public class Factory {
//  简单工厂模式
    public static void main(String[] args) {
        Fruit banana = FruitFactory.take("Banana");
        banana.fragrance();

    }

}

abstract class Fruit {
    abstract void fragrance();
}

class Apple extends Fruit {
    private String name = "Apple";
    private String color = "rad";
    private String taste = "sweet";

    void fragrance() {
        System.out.println(this.name + " give off a scent");
    }
}

class Banana extends Fruit {
    private String name = "Banana";
    private String color = "yellow";
    private String taste = "fragrant";

    void fragrance() {
        System.out.println(this.name + " give off a scent");
    }
}

class FruitFactory {
    static Fruit take(String name) {
        switch (name) {
        case "Apple":
            return new Apple();
        case "Banana":
            return new Banana();
        }
        return null;
    }
}