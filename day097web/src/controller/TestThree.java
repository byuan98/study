package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import entity.Student;

@Controller
@RequestMapping("/test3")
public class TestThree {
//    实现SpringMVC文件上传方式1:用servlet中的方式完全可以
//    实现SpringMVC文件上传方式2:使用@RequestParam("photo")MultipartFile file来接受文件域
    @RequestMapping(value="/upload.action",produces="application/json;charset=utf-8")
    @ResponseBody
    public String uploadMethod(@RequestParam("photo")MultipartFile file, Student stu, HttpServletRequest req) {
        System.out.println(stu);//通过stu的属性,接受普通组件
//        通过@RequestParam("photo")MultipartFile file来接受name=photo的文件域
        String fileName=file.getOriginalFilename();//获取文件名
        System.out.println("fileName="+fileName);
//        把文件保存到指定的目录下
//        获取web.xml初始化参数中指定的目录
        String uploadPath=req.getServletContext().getInitParameter("uploadPath");
        File muLu=new File(uploadPath);
        if(!muLu.exists()) {
            muLu.mkdirs();
        }
//        创建目的文件
        File muDiFile=new File(muLu, System.currentTimeMillis()+fileName);
        try {
            file.transferTo(muDiFile);
        } catch (IllegalStateException e) {
            throw new RuntimeException();
        } catch (IOException e) {
            throw new RuntimeException();
        }//将file关联的源文件中的所有信息写到参数目标文件中
        return "上传"+fileName+"成功！";
    }
    
//    文件下载
    @RequestMapping("/download.action")
    public ResponseEntity<byte[]> downloadMethod(String fileName, HttpServletRequest req)throws Exception{
        System.out.println(fileName);
//        通过文件名获取文件类型
        String type=req.getServletContext().getMimeType(fileName);
//        获取web.xml中配置的下载文件的位置
        String downloadPath=req.getServletContext().getInitParameter("downloadPath");
        downloadPath=req.getServletContext().getRealPath(downloadPath);
        File yuanFile=new File(downloadPath, fileName);
        
//        FileInputStream fin=new FileInputStream(yuanFile);
//        byte[] arr=new byte[fin.available()];//创建一个字节数组,字节长度与为文件字节长度一致
//        fin.read(arr);//把文件中的所有信息读取到arr中
//        fin.close();
        byte[] arr=FileUtils.readFileToByteArray(yuanFile);
        
//        创建HttpHeaders对象
        HttpHeaders headers=new HttpHeaders();
        headers.set("Content-Type", type);//设置响应头,指定下载文件的mate类型
        fileName=new String(fileName.getBytes("utf-8"),"iso-8859-1");//解决弹出框中文乱码问题
        headers.set("Content-Disposition", "attachment;filename="+fileName);//设置响应头,浏览器以符间形式下载
        ResponseEntity<byte[]> entity=new ResponseEntity<byte[]>(arr, headers, HttpStatus.OK);
        return entity;
    }
}
