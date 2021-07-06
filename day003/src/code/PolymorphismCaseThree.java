package code;

public class PolymorphismCaseThree {
//��̬��ʹ�ó�������
//���巽������ֵ����ʱ,����Ϊ��������,�����Ϳ��Է��������������͵Ķ���

//��������Circle��Square��Rectangle�����Լ������Ժ����ܳ�������ķ���;
//дһ������,������int index;
//����������0ʱ,����һ�������ζ���
//������С��0ʱ,����һ�������ζ���
//����������0ʱ,����һ��Բ�Ͷ���;
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