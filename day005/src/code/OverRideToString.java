package code;

public class OverRideToString {
//重写toString方法,使其输出的不是地址而是属性
    public static void main(String[] args) {
        Fish f1 = new Fish();
        f1.setName("海豚");

        System.out.println(f1);

    }
}

class Fish {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 重写toString方法,方法声明必须和父类相同
    public String toString() {
        return "这是一条" + this.name;
    }
}