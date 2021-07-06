package code;

public class PolymorphismCaseTwo {
//多态的使用场景2：
//定义类的成员变量时,定义为父类类型,这样就可以赋值任意子类类型的对象;
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        lamp.bulb = new RadBulb();
        lamp.on();

        BlueBulb blueBulb = new BlueBulb();
        lamp.bulb = blueBulb;
        lamp.on();

        Bulb bulb = new RadBulb();
        lamp.bulb = bulb;
        lamp.on();

    }
}

class Lamp {
    Bulb bulb;

    void on() {
        if (bulb != null) {
            bulb.shine();
        }
    }
}

abstract class Bulb {
    abstract void shine();
}

class RadBulb extends Bulb {
    private String color = "rad";

    void shine() {
        System.out.println(this.color + "..." + this.color + "..." + this.color);
    }
}

class BlueBulb extends Bulb {
    private String color = "blue";

    void shine() {
        System.out.println(this.color + "...." + this.color + "...." + this.color);
    }
}