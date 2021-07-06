package code;

public class PolymorphismCaseOne {
//多态的使用场景一：
//定义方法时,参数列表定义为父类类型,这样就可以传递任意子类对象
    public static void main(String[] args) {
        Keeper keeper = new Keeper();

        Animal animalTiger = new Tiger();
        keeper.feeding(animalTiger);

        Monkey animalMonkey = new Monkey();
        Keeper.feeding(animalMonkey);// 等价于Animal animalMonkey=new Monkey();
        // 因为feeding方法的形参类型是Animal,所以这一语句就等价于下面horse这个例子

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