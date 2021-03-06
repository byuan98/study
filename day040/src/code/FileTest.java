package code;

import java.io.*;

public class FileTest {
//  文件测试
    public static void main(String[] args) {
//		createNewFileTest();
//		deleteTest();
//		existsTest();
//		getAbsolutePathTest();
//		getNameTest();
//		getPathTest();
//		isDirectoryTest();
//		isFileTest();
//		lengthTest();
//		listFilesTest();
//		mkdirTest();
//		mkdirsTest();
        renameToTest();
    }

    private static void createNewFileTest() {// createNewFile()方法测试
//		boolean createNewFile();//当且仅当不存在该文件时创建新文件,但不能用于创建文件夹
        File fileTest1 = new File("D://Code//FileTest//fileTest1");
//		File fileTest2=new File("");
        try {
            System.out.println(fileTest1.createNewFile());// 创建成功则返回true
//			System.out.println(fileTest2.createNewFile());//创建成功则返回true
        } catch (IOException e) {// 该方法需要进行异常处理,可能会抛出IOException
            e.printStackTrace();
        }
//		创建失败的可能性：
//			1、需要创建的文件已存在；
//			2、系统找不到创建文件的指定的路径
//			如：File fileTest2=new File("");
    }

    private static void deleteTest() {// delete()方法测试
//		boolean delete();//删除文件/文件夹;删除文件夹时文件夹必须为空
        File fileTest1 = new File("D://Code//FileTest//fileTest1");
        System.out.println(fileTest1.delete());
    }

    private static void existsTest() {// existsTest()方法测试
//		boolean exists();//判断文件/文件夹是否存在
        File fileTest1 = new File("D://Code//FileTest//fileTest1");
        System.out.println(fileTest1.exists());
    }

    private static void getAbsolutePathTest() {// getAbsolutePath()方法测试
//		String getAbsolutePathTest();//如果此抽象路径名已经是绝对路径名，则返回该路径名字符串，这与 getPath() 方法一样。如果此抽象路径名是空抽象路径名，则返回当前用户目录的路径名字符串
        File fileTest1 = new File("D://Code//FileTest//fileTest1");
        File fileTest2 = new File("");
        File fileTest3 = new File("ThrowableRecurrent.java");
        System.out.println(fileTest1.getAbsolutePath());// D:\Code\FileTest\fileTest1
        System.out.println(fileTest2.getAbsolutePath());// D:\Code\Java\study\day40
        System.out.println(fileTest3.getAbsolutePath());// D:\Code\Java\study\day40\ThrowableRecurrent.java

    }

    private static void getNameTest() {// getName()方法测试
//		String getName();//此抽象路径名表示的文件或目录的名称；如果路径名的名称序列为空，则返回空字符串
        File fileTest1 = new File("D://Code//FileTest//fileTest1");
        File fileTest2 = new File("");
        File fileTest3 = new File("D://Code//FileTest//");
        System.out.println(fileTest1.getName());// fileTest1
        System.out.println(fileTest2.getName());//
        System.out.println(fileTest3.getName());// FileTest
    }

    private static void getPathTest() {// getPath()方法测试
//		String getPath();//获取创建File对象时构造方法的参数列表,将其转化为一个字符串进行返回
        File fileTest1 = new File("D://Code//FileTest//fileTest1");
        File fileTest2 = new File("ThrowableRecurrent.java");
        File fileTest3 = new File("");
        System.out.println(fileTest1.getPath());// D:\Code\FileTest\fileTest1
        System.out.println(fileTest2.getPath());// ThrowableRecurrent.java
        System.out.println(fileTest3.getPath());//

    }

    private static void isDirectoryTest() {// isDirectory()方法测试
//		boolean isDirectory();//判断该路径指向的是否为目录
        File fileTest1 = new File("D://Code//FileTest");
        File fileTest2 = new File("Z://Code//FileTest1234");// 一个不存在的文件目录
        File fileTest3 = new File("ThrowableRecurrent.java");
        File fileTest4 = new File("ThrowableRecurrent123.java");// 一个不存在的文件
        File fileTest5 = new File("");
        System.out.println(fileTest1.isDirectory());// true
        System.out.println(fileTest2.isDirectory());// false//不存在的文件目录返回了false
        System.out.println(fileTest3.isDirectory());// false
        System.out.println(fileTest4.isDirectory());// false//不存在的文件返回了false
        System.out.println(fileTest5.isDirectory());// false

//		isDirectory的判断与文件是否存在没有关系

    }

    private static void isFileTest() {// isFile()方法测试
//		boolean isFile();//判断是否为文件,必须得是完整的路径才能进行判断
        File fileTest1 = new File("D://Code//FileTest//fileTest1");
        File fileTest2 = new File("Z://Code//FileTest1234");// 一个不存在的文件目录
        File fileTest3 = new File("ThrowableRecurrent.java");
        File fileTest4 = new File("ThrowableRecurrent123.java");// 一个不存在的文件
        File fileTest5 = new File("");
        File fileTest6 = new File("D:\\Code\\Java\\study\\day40\\src\\code\\test");
        File fileTest7 = new File("test");
        System.out.println(fileTest1.isFile());// true
        System.out.println(fileTest2.isFile());// false
        System.out.println(fileTest3.isFile());// false
        System.out.println(fileTest4.isFile());// false
        System.out.println(fileTest5.isFile());// false
        System.out.println(fileTest6.isFile());// true
        System.out.println(fileTest7.isFile());// false

    }

    private static void lengthTest() {// length()方法测试
//		long length();//获取文件的字节数且建议该方法只获取文件的字节数,如果此路径名表示一个目录，则返回值是不确定
        File fileTest1 = new File("D://Code//FileTest//fileTest1");
        File fileTest2 = new File("D://Code//FileTest");// 一个目录
        File fileTest3 = new File("");
        File fileTest4 = new File("D://Code\\Java\\study\\day40\\src\\code\\FileTest.java");
        File fileTest5 = new File("C://");
        System.out.println(fileTest1.length());// 0
        System.out.println(fileTest2.length());// 0
        System.out.println(fileTest3.length());// 0
        System.out.println(fileTest4.length());// 5334
        System.out.println(fileTest5.length());// 24576

//		该方法可以获取文件夹的字节数,但其返回值不确定	

    }

    private static void listFilesTest() {// listFiles()方法测试
//		File[] listFiles();//获取当前文件夹下的所有直接子文件/文件夹
        File[] files;// 定义一个引用接收该文件夹下的所有直接子文件/文件夹
        File fileTest1 = new File("D://Code//");
//		File fileTest1=new File("D://Code//fileTest1");//如果是一个文件,则会返回null
        files = fileTest1.listFiles();
        System.out.println(files);
        for (File file : files) {// foreach循环进行遍历
            System.out.println(file);// 遍历结果为全路径,如果是一个文件,则会返回null
        }

    }

    private static void mkdirTest() {// mkdir()方法测试
//		boolean mkdir();//创建一层文件夹
        File fileTest1 = new File("D://Code//FileTest//file");
        File fileTest2 = new File("D://Code//FileTest//FolderA");
        File fileTest3 = new File("D://Code//FileTest//FolderB");
        File fileTest4 = new File("D://Code//FileTest//FolderC");
        File fileTest5 = new File("D://Code//FileTest//FolderC");
        File fileTest6 = new File("D://Code//FileTest//FolderC//FolderCA//FolderCAA");
        File fileTest7 = new File("");
        File fileTest8 = new File("D://Code//FileTest//FolderC//flie.txt");

        System.out.println(fileTest1.mkdir());// true
        System.out.println(fileTest2.mkdir());// true
        System.out.println(fileTest3.mkdir());// true
        System.out.println(fileTest4.mkdir());// true
        System.out.println(fileTest5.mkdir());// false,无法创建已存在的文件夹
        System.out.println(fileTest6.mkdir());// false,无法创建多层文件夹
        System.out.println(fileTest7.mkdir());// false,无参数则无法创建
        System.out.println(fileTest8.mkdir());// true,即使创建的文件名为.txt等文件后缀,但还是会创建一个文件

    }

    private static void mkdirsTest() {// mkdirs()方法测试
//		boolean mkdirs();//创建多层文件夹
        File fileTest1 = new File("D:\\Code\\FileTest\\FolderA\\FolderAA\\FolderAAA");
        File fileTest2 = new File("");
        File fileTest3 = new File("Z:\\FileTest");
        System.out.println(fileTest1.mkdirs());// true
        System.out.println(fileTest2.mkdirs());// false
        System.out.println(fileTest3.mkdirs());// false 不能创建不存在的目录
    }

    private static void renameToTest() {// renameTo()方法测试
//		boolean renameTo(File dest)//重命名
        File fileTest1 = new File("D:\\Code\\FileTest\\FolderA\\FolderAA\\FolderAAA");
        File fileTest2 = new File("");
        File fileTest3 = new File("D:\\\\Code\\\\FileTest\\\\FolderA\\\\FolderAA\\\\FolderAAA");
        System.out.println(fileTest1.renameTo(new File("FolderAAAAA")));// true
        System.out.println(fileTest2.renameTo(new File("FolderAAAAA")));// false
        System.out.println(fileTest3.renameTo(new File("FolderAAAAA")));// false

    }

}
