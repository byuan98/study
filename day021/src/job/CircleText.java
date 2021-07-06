package job;

public class CircleText {
//	创建一个圆Circle类，为该类提供两个方法，
//	方法一用于求圆的面积，方法二用于求圆的周长，
//	同时为该类提供一个变量r表示半径，
//	一个常量PI表示圆周率。为该类提供一个无参的构造方法，用于初始化r的值为1；
//	且提供一个有参的构造方法，参数用于初始化半径r的值
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("圆c1的面积为" + c1.area());
        System.out.println("圆c1的周长为" + c1.perimeter());

        Circle c2 = new Circle(1.23);
        System.out.println("圆c1的面积为" + c2.area());
        System.out.println("圆c1的周长为" + c2.perimeter());

    }

}

class Circle {
    private double r;
    private final double PI = 3.14;

    Circle() {
        this.r = 1;
    }

    Circle(double r) {
        this.r = r;
    }

    public double area() {
        return this.r * this.r * this.PI;
    }

    public double perimeter() {
        return (this.r * 2) * this.PI;
    }
}
