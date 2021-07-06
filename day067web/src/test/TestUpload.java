package test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.IOUtils;

@WebServlet("/test/upload")
public class TestUpload extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
//        创建一个多部件解析的工厂对象
        DiskFileItemFactory factory=new DiskFileItemFactory();
//        创建一个多部件解析器对象，并关联工厂对象
        ServletFileUpload upload=new ServletFileUpload(factory);
        File file=null;
        try {
//            每个组件对应一个FileItem
            List<FileItem> list=upload.parseRequest(req);
            for(FileItem part:list) {
                if(part.isFormField()) {//如果是普通组件
                    String partName=part.getFieldName();
                    String partValue=part.getString("utf-8");
                    System.out.println(partName+":"+partValue);
                }else {//反之为文件域
                    String partName=part.getFieldName();//获取组件名
                    String fileName=part.getName();//获取文件名
                    InputStream in=part.getInputStream();//获取源文件输入流
//                    获取files的真实路径（在Tomcat中的路径）files是保存上传文件的地方
//                    Tomcat的文件路径下的文件会在服务关闭的时候随之关闭
//                    String path=req.getServletContext().getRealPath("/files");
                    String path="D://files";
                    file=new File(path, System.currentTimeMillis()+fileName);
                    OutputStream out=new FileOutputStream(file);
                    IOUtils.copy(in, out);
                    resp.getWriter().print(file.getAbsolutePath()+"已上传");
                    in.close();
                    out.close();
                }
            }
        } catch (FileUploadException e) {
            throw new RuntimeException();
        }
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
