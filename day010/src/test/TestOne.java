package test;

public class TestOne {
//  �ڲ���
    public static void main(String[] args) {
        Circle c = new Circle(2.2);
        Circle.Move d = c.new Move();
        Circle.Move d2 = c.establish(1, 2, 3, 4);
        System.out.println(d2);
    }
}

class Circle {
    final double PI = 3.14;
    double radius;

    Circle() {

    }

    Circle(double radius) {
        this.radius = radius;
    }

    class Move {
        double up;
        double down;
        double left;
        double right;

        Move() {

        }

        Move(double up, double down, double left, double right) {
            this.up = up;
            this.down = down;
            this.left = left;
            this.right = right;
        }

        public String toString() {
            return "�����ƶ�:" + up + "�����ƶ�:" + down + "�����ƶ�:" + left + "�����ƶ�:" + right;
        }
    }

    Move establish() {
        return new Move();
    }

    Move establish(double up, double down, double left, double right) {
        return new Move(up, down, left, right);
    }
}
