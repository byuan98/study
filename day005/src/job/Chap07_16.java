package job;

public class Chap07_16 {

    public static void main(String[] args) {
        MyClass m1 = new MyClass();
        MyClass m2 = new MyClass();
        MyClass m3 = new MyClass();
        MyClass m4 = new MyClass();
        MyClass m5 = new MyClass();
        System.out.println("共创建了" + MyClass.myClassNumber() + "对象");

    }

}

class MyClass {
    String name;
    static int count;

    MyClass() {
        count++;
    }

    static int myClassNumber() {
        return count;
    }
}