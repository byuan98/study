package entity;

import java.io.Serializable;

public class FactoryInstance implements Serializable{
    public Teacher getInstancel() {
        return new Teacher(10004,"Acker");
    }

}
