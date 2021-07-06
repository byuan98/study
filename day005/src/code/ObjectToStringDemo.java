package code;

public class ObjectToStringDemo {
//Object常用方法3：String toString()//获取当前对象的字符串表示形式
    public static void main(String[] args) {
        Animal a = new Animal();
        a.setName("Tiger");

        System.out.println(a.toString());// code.Animal@2f92e0f4
                                         // 打印对象、对象的字符串拼接，
                                         // 默认调用的是对象的toString方法

        String s = a.toString();
        System.out.println(s);

    }
}

class Animal {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}