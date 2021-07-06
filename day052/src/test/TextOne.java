package test;

import java.io.*;
import java.net.*;

public class TextOne {
//    TCP连接之服务器端
    public static void main(String[] args) throws IOException {
//        1、创建一个ServerSocket并指定一个端口；
        ServerSocket server=new ServerSocket(12321);
//        2、等待客户端的连接；
        System.out.println("服务器等待连接......");
        Socket socket=server.accept();
//        3、获取Socket的输入和输出流进行数据传输；
        InputStream in=socket.getInputStream();
        OutputStream out=socket.getOutputStream();
        out.write("服务器已连接".getBytes("utf-8"));
        byte[] array=new byte[1024];
        int n=in.read(array);
        System.out.println("客户端的回答是："+new String(array,0,n));
        out.write("服务器已断开连接".getBytes());
//        4、关闭服务；
        server.close();
    }
}
