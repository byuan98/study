package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test/download")
public class TestDownload extends HttpServlet{

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String fileName=req.getParameter("fileName");
        String fileNameNew=new String(fileName.getBytes("iso-8859-1"),"utf-8");
        
        String path=req.getServletContext().getRealPath("/imgs/"+fileNameNew);
        
        String type=req.getServletContext().getMimeType(fileName);
        //设置响应头 Content-Type  指定文件的类型
        resp.setHeader("Content-Type", type);
        //设置响应头Content-Disposition指定文件以附件形式保存
        resp.setHeader("Content-Disposition", "attachment;fileName="+fileNameNew);
       //创建流与目的文件关联
        InputStream fin =new FileInputStream(path);
       //通过resposne的输出流写给客户端
        byte [] arr=new byte[1024];
        int length;
        //获取输出流
        OutputStream out= resp.getOutputStream();
        while((length=fin.read(arr))!=-1){
            out.write(arr,0,length);
        }
          //关闭流
        fin.close(); 
    }
    
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
