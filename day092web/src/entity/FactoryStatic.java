package entity;

import java.io.Serializable;

public class FactoryStatic implements Serializable{//静态工厂模式,通过工厂类的静态方法来创建对象
    public static Teacher getInstance() {
        return new Teacher(10003,"Abi");
    }
}
