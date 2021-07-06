package test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TestOne {
//    使用tcp模拟tomcat来查看请求协议的格式
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(12345);
        while(true) {
            Socket socket=serverSocket.accept();//等待连接
            InputStream in=socket.getInputStream();
            byte[] array=new byte[1024];
            int length=in.read(array);
            String message=new String(array, 0, length);
            System.out.println(message);
            OutputStream out=socket.getOutputStream();
            out.write("<h1>success</h1>".getBytes());
        }
    }
}
