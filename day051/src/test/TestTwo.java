package test;

import java.io.IOException;
import java.net.*;


public class TestTwo {
//    UDP连接测试之接收方

    public static void main(String[] args) throws IOException{
//        1、创建一个UDP的socket，并指定要开启的窗口
        DatagramSocket socket=new DatagramSocket(12322);
//        2、创建一个空的DatagaramPacket来接收消息
        byte[] array=new byte[1024];
        DatagramPacket receivePacket=new DatagramPacket(array, array.length);
//        3、接收消息
        socket.receive(receivePacket);
        int length=receivePacket.getLength();
        System.out.println(new String(array,0,length));
        
//        4、关闭socket
        socket.close();

    }

}
