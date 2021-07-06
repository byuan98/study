package test;

public class TestOne {

    public static void main(String[] args) {
        Zi zi = new Zi(7, 8, 9, 10);
        System.out.println(zi.a);// 2
        System.out.println(zi.e);// 10
        /*
         * 这里的a会输出为a的默认值：2，按理说应该是7，但并不是这样， 因为子类的构造方法之中事先定义了super(a,b,c)(父类的三个参数的构造方法)
         * 所以，传入的四个参数有3个都用于了父类的构造方法，子类的四参数 构造方法中，只有e通过形参表真真正正的被赋予给了子类中的e
         * 可以这样理解，形参表的前三个参数，被父类的super截取了；
         */

    }
}

class Fu {
    int a;
    int b = 1;
    static int c = 1;

    void hai() {
    }

    void haha() {
    }

    static void hello() {
    }

    Fu() {
    }

    Fu(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}

class Zi extends Fu {
    int a = 2;
    int e = 3;
    static int f = 1;

    void hai() {
    }

    void nihao() {
    }

    Zi(int a, int b, int c, int e) {
        super(a, b, c);
        this.e = e;

    }
}