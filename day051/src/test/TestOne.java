package test;

import java.io.*;
import java.net.*;
import java.util.*;

public class TestOne {
//    UDP���紫��֮���ͷ�
    public static void main(String[] args) throws IOException {
//        1������UDP��socket��ָ�������Ķ˿�
        DatagramSocket socket=new DatagramSocket(12321);
//        2������һ��DatagramPackage��װҪ���͵���Ϣ
        while(true) {
            String str="MyPc:"+new Scanner(System.in).next();
            byte[] array=str.getBytes("utf-8");
            DatagramPacket sendPacket=new DatagramPacket(array,0,array.length,InetAddress.getByName("192.168.137.17"),12322);
//        3��ͨ��socket�����ݱ�������ȥ
            socket.send(sendPacket);
        }
//        4���ر�socket
//        socket.close();
    }
}