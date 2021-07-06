package job;

public class CircleText {
//	����һ��ԲCircle�࣬Ϊ�����ṩ����������
//	����һ������Բ�������������������Բ���ܳ���
//	ͬʱΪ�����ṩһ������r��ʾ�뾶��
//	һ������PI��ʾԲ���ʡ�Ϊ�����ṩһ���޲εĹ��췽�������ڳ�ʼ��r��ֵΪ1��
//	���ṩһ���вεĹ��췽�����������ڳ�ʼ���뾶r��ֵ
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Բc1�����Ϊ" + c1.area());
        System.out.println("Բc1���ܳ�Ϊ" + c1.perimeter());

        Circle c2 = new Circle(1.23);
        System.out.println("Բc1�����Ϊ" + c2.area());
        System.out.println("Բc1���ܳ�Ϊ" + c2.perimeter());

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
