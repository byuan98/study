package test;

import java.io.*;
import java.util.*;

public class TestOne {
//    序列化与反序列化流练习
    public static void main(String[] args) throws FileNotFoundException, IOException {
        List<People> crowd=new ArrayList();
        crowd.add(new People("Godfery",18));//实例化一个学生对象，将其装入列表crowd中
        crowd.add(new People("Tom",19));
        crowd.add(new People("echo",17));
        
//        将对象写入文件(序列化)
//        创建一个序列化流与目的文件关联
        ObjectOutputStream objOut=new ObjectOutputStream(new FileOutputStream("D:\\Code\\FileTest\\people"));
        for(People people:crowd) {//逐个对象的将crowd中存放的数据写入文件
            objOut.writeObject(people);
            objOut.flush();
        }
        objOut.close();
        
//        将对象从文件重新读入内存(反序列化,把硬盘中对象的信息读到内存中并重构对象)
//        创建反序列化流与源文件关联;
        ObjectInputStream objIn=new ObjectInputStream(new FileInputStream("D:\\Code\\FileTest\\people"));
        Object obj=null;
        while(true) {
            try {
               obj=objIn.readObject();//选择逐个对象的读取
            } catch (EOFException e) {//到达文件末尾会抛出EOFException异常
                break;//此时break即可
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            System.out.println(obj);//输出从文件中读出的对象
        }
        objIn.close();
    }

}

class People implements Serializable{//注意事项：序列化与反序列化操作的对象的类必须继承序列化接口Serializable
    private String name;
    private Integer age;
    People(String name, Integer age){
        this.name=name;
        this.age=age;
    }
    
    public String toString() {
        return "name:"+this.name+",age:"+this.age;
    }
    
    
}