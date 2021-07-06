package test;

import java.io.*;
import java.net.*;
import java.util.*;

public class TestOne {
//    UDP网络传输之发送方
    public static void main(String[] args) throws IOException {
//        1、创建UDP的socket，指定开启的端口
        DatagramSocket socket=new DatagramSocket(12321);
//        2、创建一个DatagramPackage封装要发送的信息
        while(true) {
            String str="MyPc:"+new Scanner(System.in).next();
            byte[] array=str.getBytes("utf-8");
            DatagramPacket sendPacket=new DatagramPacket(array,0,array.length,InetAddress.getByName("192.168.137.17"),12322);
//        3、通过socket把数据报包发出去
            socket.send(sendPacket);
        }
//        4、关闭socket
//        socket.close();
    }
}
