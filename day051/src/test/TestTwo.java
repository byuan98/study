package test;

import java.io.IOException;
import java.net.*;


public class TestTwo {
//    UDP���Ӳ���֮���շ�

    public static void main(String[] args) throws IOException{
//        1������һ��UDP��socket����ָ��Ҫ�����Ĵ���
        DatagramSocket socket=new DatagramSocket(12322);
//        2������һ���յ�DatagaramPacket��������Ϣ
        byte[] array=new byte[1024];
        DatagramPacket receivePacket=new DatagramPacket(array, array.length);
//        3��������Ϣ
        socket.receive(receivePacket);
        int length=receivePacket.getLength();
        System.out.println(new String(array,0,length));
        
//        4���ر�socket
        socket.close();

    }

}
