package test;

import java.io.*;
import java.net.*;

public class TextOne {
//    TCP����֮��������
    public static void main(String[] args) throws IOException {
//        1������һ��ServerSocket��ָ��һ���˿ڣ�
        ServerSocket server=new ServerSocket(12321);
//        2���ȴ��ͻ��˵����ӣ�
        System.out.println("�������ȴ�����......");
        Socket socket=server.accept();
//        3����ȡSocket�������������������ݴ��䣻
        InputStream in=socket.getInputStream();
        OutputStream out=socket.getOutputStream();
        out.write("������������".getBytes("utf-8"));
        byte[] array=new byte[1024];
        int n=in.read(array);
        System.out.println("�ͻ��˵Ļش��ǣ�"+new String(array,0,n));
        out.write("�������ѶϿ�����".getBytes());
//        4���رշ���
        server.close();
    }
}
