package job;

public class AnimalText {
//	����Ա�࣬�����࣬ʳ���ࡣʵ������Ա������ιʳ�
//    void Wei(Food  f,Animal  a){}
    public static void main(String[] args) {
        Animal a = new Animal("Tiger");
        Food f = new Food("meat");
        Breeder b = new Breeder("Godfery");
        b.Wei(f, a);

    }
}

class Animal {
    private String animalName;

    Animal(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalName() {
        return this.animalName;
    }
}

class Food {
    private String foodName;

    Food(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodName() {
        return this.foodName;
    }
}

class Breeder {
    private String breederName;

    Breeder(String breederName) {
        this.breederName = breederName;
    }

    void Wei(Food f, Animal a) {
        System.out.println(this.breederName + "�ڸ�" + a.getAnimalName() + "ι" + f.getFoodName());
    }
}