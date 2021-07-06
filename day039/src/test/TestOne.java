package test;

public class TestOne {
//  ����ģʽ
    public static void main(String[] args) {
        Animal animal1 = Animal.getAnimal();
        Animal animal2 = Animal.getAnimal();
        System.out.println(animal1.equals(animal2));

        Plant plant = Plant.getPlant();

    }

}

class Animal {// ����ģʽ֮����ʽ
    private String name;
    private String color;

    private Animal(String name, String color) {// 1�����췽��˽�л�
        this.name = name;
        this.color = color;
    }

    private static Animal animal = new Animal("Tiger", "orange");// 2������һ����Ա�������Լ�¼Ψһ��һ��ʵ��������

    public static Animal getAnimal() {// 3���ṩһ�����������������������
        return animal;
    }

    public String toString() {
        return this.name + " color is " + this.color;
    }
}

class Plant {
    private String name;
    private String color;

    private Plant(String name, String color) {// 1�����췽��˽�л�
        this.name = name;
        this.color = color;
    }

    private static Plant plant;// 2������һ����Ա��������¼Ψһ��һ��ʵ������

    public static Plant getPlant() {// 3���ṩһ�����������������������
        if (plant == null) {
            plant = new Plant("Rose", "red");
            System.out.println("Plantʵ������һ������");
            return plant;
        }
        System.out.println("�Ѿ�������Plant��ʵ��������,�����ٴη���");
        return plant;
    }

    public String toString() {
        return this.name + " color is " + this.color;
    }
}