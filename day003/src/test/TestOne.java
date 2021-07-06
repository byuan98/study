package test;

public class TestOne {

    public static void main(String[] args) {
        Circle c = new Circle(10);
        System.out.println(c.area());
    }
}

abstract class Shape {// 抽象类存在的意义就是为子类定义规范
    abstract double perimeter();

    abstract double area();
}

class Rect extends Shape {
    double length;
    double wide;

    Rect(double length, double wide) {
        this.length = length;
        this.wide = wide;
    }

    double perimeter() {
        return (this.length + this.wide) * 2;
    }

    double area() {
        return this.length * this.wide;
    }
}

class Circle extends Shape {
    double radius;
    private final double PI = 3.14;

    Circle(double radius) {
        this.radius = radius;
    }

    double perimeter() {
        return this.PI * (2 * this.radius);
    }

    double area() {
        return this.radius * this.radius * this.PI;
    }
}
