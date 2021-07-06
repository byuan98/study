package test;

import java.io.*;
import java.util.*;

public class TestOne {
//    ���л��뷴���л�����ϰ
    public static void main(String[] args) throws FileNotFoundException, IOException {
        List<People> crowd=new ArrayList();
        crowd.add(new People("Godfery",18));//ʵ����һ��ѧ�����󣬽���װ���б�crowd��
        crowd.add(new People("Tom",19));
        crowd.add(new People("echo",17));
        
//        ������д���ļ�(���л�)
//        ����һ�����л�����Ŀ���ļ�����
        ObjectOutputStream objOut=new ObjectOutputStream(new FileOutputStream("D:\\Code\\FileTest\\people"));
        for(People people:crowd) {//�������Ľ�crowd�д�ŵ�����д���ļ�
            objOut.writeObject(people);
            objOut.flush();
        }
        objOut.close();
        
//        ��������ļ����¶����ڴ�(�����л�,��Ӳ���ж������Ϣ�����ڴ��в��ع�����)
//        ���������л�����Դ�ļ�����;
        ObjectInputStream objIn=new ObjectInputStream(new FileInputStream("D:\\Code\\FileTest\\people"));
        Object obj=null;
        while(true) {
            try {
               obj=objIn.readObject();//ѡ���������Ķ�ȡ
            } catch (EOFException e) {//�����ļ�ĩβ���׳�EOFException�쳣
                break;//��ʱbreak����
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            System.out.println(obj);//������ļ��ж����Ķ���
        }
        objIn.close();
    }

}

class People implements Serializable{//ע��������л��뷴���л������Ķ���������̳����л��ӿ�Serializable
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