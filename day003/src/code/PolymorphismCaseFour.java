package code;

public class PolymorphismCaseFour {
//多态的使用场景三：
//定义数组元素类型时,定义为父类类型,这样就可以装任意子类类型的对象;
    public static void main(String[] args) {
        Balloon[] balloons = new Balloon[4];
        balloons[0] = new RadBalloon();
        balloons[1] = new GreenBalloon();
        balloons[2] = new BlueBalloon();
        balloons[3] = new PurpleBalloon();
        for (int index = 0; index < balloons.length; index++) {
//			Balloon balloon=balloons[index];
//			balloon.flewUp();
            balloons[index].flewUp();
        }
    }
}

abstract class Balloon {
    abstract void flewUp();
}

class RadBalloon extends Balloon {
    private String color = "red";

    void flewUp() {
        System.out.println("The " + this.color + " balloon flew up");
    }
}

class GreenBalloon extends Balloon {
    private String color = "green";

    void flewUp() {
        System.out.println("The " + this.color + " balloon flew up");
    }
}

class BlueBalloon extends Balloon {
    private String color = "blue";

    void flewUp() {
        System.out.println("The " + this.color + " balloon flew up");
    }
}

class PurpleBalloon extends Balloon {
    private String color = "purple";

    void flewUp() {
        System.out.println("The " + this.color + " balloon flew up");
    }
}
