package test;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class TestOne {
    static String fileName="xml/student.xml";
    public static void main(String[] args) throws Exception {
        Document doc=xmlDoc(fileName);//读取xml文件,获取一个document对象
        
//        4、添加
//        在class id="class_2"中添加一个student子标签
        NodeList classList=doc.getElementsByTagName("class");
        for(int index=0;index<classList.getLength();index++) {
            Element claEle=(Element)classList.item(index);
            if(claEle.getAttribute("id").equals("class_2")) {
//                添加一个student子标签
                Element stuNewEle=doc.createElement("student");
                stuNewEle.setAttribute("id", "s006");//设置属性id
                
//                创建子标签:sname,sage,sex
                Element snameNewEle=doc.createElement("sname");
                snameNewEle.setTextContent("Ali");
                Element sageNewEle=doc.createElement("sage");
                sageNewEle.setTextContent("18");
                Element sexNewEle=doc.createElement("sex");
                sexNewEle.setTextContent("女");
                
//                把子标签添加到父标签下
                stuNewEle.appendChild(snameNewEle);
                stuNewEle.appendChild(sageNewEle);
                stuNewEle.appendChild(sexNewEle);
                
                claEle.appendChild(stuNewEle);
                break;
            }
        }

        docXml(doc,fileName);//将document对象中的信息刷新到xml中(必须要有此步骤,更改只是更改对象,必须写入)
    }
    
    public static Document xmlDoc(String fileName) throws Exception {//读取xml文件为domcument对象     
        DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();//创建文档解析器工厂对象
   
        DocumentBuilder builder=factory.newDocumentBuilder();//由工厂对象创建文档解析器对象

        return builder.parse(new File(fileName));//解析器对象解析xml为document对象  
    }
    
    public static void docXml(Document doc, String fileName) throws Exception {//把更改后的document对象的信息写入xml文件中
        TransformerFactory factory=TransformerFactory.newInstance();//创建转换器工程对象
        
        Transformer tf=factory.newTransformer();//根据工厂对象创建转换器对象
        tf.transform(new DOMSource(doc), new StreamResult(new File(fileName)));
    }
}
