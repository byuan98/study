package cn.godfery.patterns.creational;
/**
 * 设计模式之创建型模式之工厂模式
 * 
 * 在工厂模式中通过使用一个共同的接口来指向新创建的对象
 * */

//步骤一:创建一个接口
interface Shape {
    void draw();
}

//步骤二:创建实现接口的实现类
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}

//步骤三:创建一个工厂,生产基于给定信息的实体类对象
class ShapeFactory {
//    使用getShape方法获取形状类型的对象
    public Shape getShape(String shapeType) {
        if(shapeType == null) {
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        if(shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        if(shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    } 
}
//    步骤四:使用该工厂,通过传递类型信息来获取实体对象
public class FactoryPattern{
    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory();
        
        Shape shapeCircle=shapeFactory.getShape("circle");
        
        Shape shapeRectangle=shapeFactory.getShape("rectangle");
        
        Shape shapeSquare=shapeFactory.getShape("square");
        
        Shape shapeTriangle=shapeFactory.getShape("triangle");
        
        try {
            shapeCircle.draw();
            shapeRectangle.draw();
            shapeSquare.draw();
            shapeTriangle.draw();  
        } catch (NullPointerException e) {
            
        }
        
    }
}