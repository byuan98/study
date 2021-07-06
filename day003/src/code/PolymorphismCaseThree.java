package code;

public class PolymorphismCaseThree {
//多态的使用场景三：
//定义方法返回值类型时,定义为父类类型,这样就可以返回任意子类类型的对象

//三种类型Circle、Square、Rectangle都有自己的属性和求周长与面积的方法;
//写一个方法,参数是int index;
//当参数大于0时,返回一个正方形对象、
//当参数小于0时,返回一个长方形对象、
//当参数等于0时,返回一个圆型对象;
    public static void main(String[] args) {
        Shape shape = getShape(0);
    }

    public static Shape getShape(int index) {
        if (index == 0) {
            return new Circle(10.0);
        } else if (index > 0) {
            return new Square(20);
        }
        return new Rectangle(10, 20);
    }
}

abstract class Shape {
    abstract double area();

    abstract double perimeter();
}

class Circle extends Shape {
    private final double PI = 3.14;
    double ridius;

    Circle(double ridius) {
        this.ridius = ridius;
    }

    double area() {
        return PI * ridius * ridius;
    }

    double perimeter() {
        return PI * (ridius * 2);
    }
}

class Square extends Shape {
    double edgeLength;

    Square(double edgeLength) {
        this.edgeLength = edgeLength;
    }

    double area() {
        return edgeLength * edgeLength;
    }

    double perimeter() {
        return edgeLength * 4;
    }
}

class Rectangle extends Shape {
    double length;
    double wide;

    Rectangle(double length, double wide) {
        this.length = length;
        this.wide = wide;
    }

    double area() {
        return length * wide;
    }

    double perimeter() {
        return (length + wide) * 2;
    }
}