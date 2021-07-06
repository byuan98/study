package test;

public class TestOne {
//  单例模式
    public static void main(String[] args) {
        Animal animal1 = Animal.getAnimal();
        Animal animal2 = Animal.getAnimal();
        System.out.println(animal1.equals(animal2));

        Plant plant = Plant.getPlant();

    }

}

class Animal {// 单例模式之饿汉式
    private String name;
    private String color;

    private Animal(String name, String color) {// 1、构造方法私有化
        this.name = name;
        this.color = color;
    }

    private static Animal animal = new Animal("Tiger", "orange");// 2、定义一个成员变量用以记录唯一的一个实例化对象

    public static Animal getAnimal() {// 3、提供一个公共的类来访问这个对象
        return animal;
    }

    public String toString() {
        return this.name + " color is " + this.color;
    }
}

class Plant {
    private String name;
    private String color;

    private Plant(String name, String color) {// 1、构造方法私有化
        this.name = name;
        this.color = color;
    }

    private static Plant plant;// 2、定义一个成员变量来记录唯一的一个实例对象

    public static Plant getPlant() {// 3、提供一个公共的类来返回这个对象
        if (plant == null) {
            plant = new Plant("Rose", "red");
            System.out.println("Plant实例化了一个对象");
            return plant;
        }
        System.out.println("已经存在了Plant的实例化对象,进行再次返回");
        return plant;
    }

    public String toString() {
        return this.name + " color is " + this.color;
    }
}