package cn.godfery.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import cn.godfery.entity.Student;

public class PoiUtil {
//    private Integer stuId; //学号
//    private String stuName; //姓名
//    private String stuSex; //性别
//    private String stuAge; //年龄
//    private String stuScore; //分数
    
//    写一个excel(xlsx)
    public static void createExcel(String fileName)throws Exception {
        XSSFWorkbook book=new XSSFWorkbook(); //创建一个HSSFWorkbook对象
        
        XSSFSheet sheet=book.createSheet("学生成绩"); //创建一个sheet
        
        String[] names={"stuId","stuName","stuSex","stuAge","stuScore"};
        
        XSSFRow row0=sheet.createRow(0);
        
        for(Integer index=0; index<names.length; index++) {
            row0.createCell(index).setCellValue(names[index]);
        }
        
        List<Student> studentList=new ArrayList<Student>();
        
        for(Integer count=0; count<10; count++) {
            Student student=new Student()
                    .setStuId(10001+count)
                    .setStuName("Godfery"+count)
                    .setStuSex(Math.random()>0.5?"男":"女")
                    .setStuAge((int)(Math.random()*5+20))
                    .setStuScore(((int)(Math.random()*1000))/10.0);
            studentList.add(student);
        }
        
//        创建数据行
        for(Integer rowCount=0; rowCount<studentList.size(); rowCount++) {
            XSSFRow rowi=sheet.createRow(rowCount+1);
            for(Integer cellCount=0; cellCount<names.length; cellCount++) {
                XSSFCell cellj=rowi.createCell(cellCount);
                if(cellCount==0) {
                    cellj.setCellValue(studentList.get(rowCount).getStuId());
                }else if(cellCount==1) {
                    cellj.setCellValue(studentList.get(rowCount).getStuName());
                }else if(cellCount==2) {
                    cellj.setCellValue(studentList.get(rowCount).getStuSex());
                }else if(cellCount==3) {
                    cellj.setCellValue(studentList.get(rowCount).getStuAge());
                }else if(cellCount==4) {
                    cellj.setCellValue(studentList.get(rowCount).getStuScore());
                }
            }
        }
        OutputStream outPutStream=new FileOutputStream(fileName);
        book.write(outPutStream);
        System.out.println("写入成功");
        book.close();

       
    }
    public static void main(String[] args) throws Exception {
        createExcel("D:\\Other\\text.xlsx");
    }
}
