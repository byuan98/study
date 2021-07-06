package code;

import java.io.*;

public class FileTest {
//  �ļ�����
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

    private static void createNewFileTest() {// createNewFile()��������
//		boolean createNewFile();//���ҽ��������ڸ��ļ�ʱ�������ļ�,���������ڴ����ļ���
        File fileTest1 = new File("D://Code//FileTest//fileTest1");
//		File fileTest2=new File("");
        try {
            System.out.println(fileTest1.createNewFile());// �����ɹ��򷵻�true
//			System.out.println(fileTest2.createNewFile());//�����ɹ��򷵻�true
        } catch (IOException e) {// �÷�����Ҫ�����쳣����,���ܻ��׳�IOException
            e.printStackTrace();
        }
//		����ʧ�ܵĿ����ԣ�
//			1����Ҫ�������ļ��Ѵ��ڣ�
//			2��ϵͳ�Ҳ��������ļ���ָ����·��
//			�磺File fileTest2=new File("");
    }

    private static void deleteTest() {// delete()��������
//		boolean delete();//ɾ���ļ�/�ļ���;ɾ���ļ���ʱ�ļ��б���Ϊ��
        File fileTest1 = new File("D://Code//FileTest//fileTest1");
        System.out.println(fileTest1.delete());
    }

    private static void existsTest() {// existsTest()��������
//		boolean exists();//�ж��ļ�/�ļ����Ƿ����
        File fileTest1 = new File("D://Code//FileTest//fileTest1");
        System.out.println(fileTest1.exists());
    }

    private static void getAbsolutePathTest() {// getAbsolutePath()��������
//		String getAbsolutePathTest();//����˳���·�����Ѿ��Ǿ���·�������򷵻ظ�·�����ַ��������� getPath() ����һ��������˳���·�����ǿճ���·�������򷵻ص�ǰ�û�Ŀ¼��·�����ַ���
        File fileTest1 = new File("D://Code//FileTest//fileTest1");
        File fileTest2 = new File("");
        File fileTest3 = new File("ThrowableRecurrent.java");
        System.out.println(fileTest1.getAbsolutePath());// D:\Code\FileTest\fileTest1
        System.out.println(fileTest2.getAbsolutePath());// D:\Code\Java\study\day40
        System.out.println(fileTest3.getAbsolutePath());// D:\Code\Java\study\day40\ThrowableRecurrent.java

    }

    private static void getNameTest() {// getName()��������
//		String getName();//�˳���·������ʾ���ļ���Ŀ¼�����ƣ����·��������������Ϊ�գ��򷵻ؿ��ַ���
        File fileTest1 = new File("D://Code//FileTest//fileTest1");
        File fileTest2 = new File("");
        File fileTest3 = new File("D://Code//FileTest//");
        System.out.println(fileTest1.getName());// fileTest1
        System.out.println(fileTest2.getName());//
        System.out.println(fileTest3.getName());// FileTest
    }

    private static void getPathTest() {// getPath()��������
//		String getPath();//��ȡ����File����ʱ���췽���Ĳ����б�,����ת��Ϊһ���ַ������з���
        File fileTest1 = new File("D://Code//FileTest//fileTest1");
        File fileTest2 = new File("ThrowableRecurrent.java");
        File fileTest3 = new File("");
        System.out.println(fileTest1.getPath());// D:\Code\FileTest\fileTest1
        System.out.println(fileTest2.getPath());// ThrowableRecurrent.java
        System.out.println(fileTest3.getPath());//

    }

    private static void isDirectoryTest() {// isDirectory()��������
//		boolean isDirectory();//�жϸ�·��ָ����Ƿ�ΪĿ¼
        File fileTest1 = new File("D://Code//FileTest");
        File fileTest2 = new File("Z://Code//FileTest1234");// һ�������ڵ��ļ�Ŀ¼
        File fileTest3 = new File("ThrowableRecurrent.java");
        File fileTest4 = new File("ThrowableRecurrent123.java");// һ�������ڵ��ļ�
        File fileTest5 = new File("");
        System.out.println(fileTest1.isDirectory());// true
        System.out.println(fileTest2.isDirectory());// false//�����ڵ��ļ�Ŀ¼������false
        System.out.println(fileTest3.isDirectory());// false
        System.out.println(fileTest4.isDirectory());// false//�����ڵ��ļ�������false
        System.out.println(fileTest5.isDirectory());// false

//		isDirectory���ж����ļ��Ƿ����û�й�ϵ

    }

    private static void isFileTest() {// isFile()��������
//		boolean isFile();//�ж��Ƿ�Ϊ�ļ�,�������������·�����ܽ����ж�
        File fileTest1 = new File("D://Code//FileTest//fileTest1");
        File fileTest2 = new File("Z://Code//FileTest1234");// һ�������ڵ��ļ�Ŀ¼
        File fileTest3 = new File("ThrowableRecurrent.java");
        File fileTest4 = new File("ThrowableRecurrent123.java");// һ�������ڵ��ļ�
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

    private static void lengthTest() {// length()��������
//		long length();//��ȡ�ļ����ֽ����ҽ���÷���ֻ��ȡ�ļ����ֽ���,�����·������ʾһ��Ŀ¼���򷵻�ֵ�ǲ�ȷ��
        File fileTest1 = new File("D://Code//FileTest//fileTest1");
        File fileTest2 = new File("D://Code//FileTest");// һ��Ŀ¼
        File fileTest3 = new File("");
        File fileTest4 = new File("D://Code\\Java\\study\\day40\\src\\code\\FileTest.java");
        File fileTest5 = new File("C://");
        System.out.println(fileTest1.length());// 0
        System.out.println(fileTest2.length());// 0
        System.out.println(fileTest3.length());// 0
        System.out.println(fileTest4.length());// 5334
        System.out.println(fileTest5.length());// 24576

//		�÷������Ի�ȡ�ļ��е��ֽ���,���䷵��ֵ��ȷ��	

    }

    private static void listFilesTest() {// listFiles()��������
//		File[] listFiles();//��ȡ��ǰ�ļ����µ�����ֱ�����ļ�/�ļ���
        File[] files;// ����һ�����ý��ո��ļ����µ�����ֱ�����ļ�/�ļ���
        File fileTest1 = new File("D://Code//");
//		File fileTest1=new File("D://Code//fileTest1");//�����һ���ļ�,��᷵��null
        files = fileTest1.listFiles();
        System.out.println(files);
        for (File file : files) {// foreachѭ�����б���
            System.out.println(file);// �������Ϊȫ·��,�����һ���ļ�,��᷵��null
        }

    }

    private static void mkdirTest() {// mkdir()��������
//		boolean mkdir();//����һ���ļ���
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
        System.out.println(fileTest5.mkdir());// false,�޷������Ѵ��ڵ��ļ���
        System.out.println(fileTest6.mkdir());// false,�޷���������ļ���
        System.out.println(fileTest7.mkdir());// false,�޲������޷�����
        System.out.println(fileTest8.mkdir());// true,��ʹ�������ļ���Ϊ.txt���ļ���׺,�����ǻᴴ��һ���ļ�

    }

    private static void mkdirsTest() {// mkdirs()��������
//		boolean mkdirs();//��������ļ���
        File fileTest1 = new File("D:\\Code\\FileTest\\FolderA\\FolderAA\\FolderAAA");
        File fileTest2 = new File("");
        File fileTest3 = new File("Z:\\FileTest");
        System.out.println(fileTest1.mkdirs());// true
        System.out.println(fileTest2.mkdirs());// false
        System.out.println(fileTest3.mkdirs());// false ���ܴ��������ڵ�Ŀ¼
    }

    private static void renameToTest() {// renameTo()��������
//		boolean renameTo(File dest)//������
        File fileTest1 = new File("D:\\Code\\FileTest\\FolderA\\FolderAA\\FolderAAA");
        File fileTest2 = new File("");
        File fileTest3 = new File("D:\\\\Code\\\\FileTest\\\\FolderA\\\\FolderAA\\\\FolderAAA");
        System.out.println(fileTest1.renameTo(new File("FolderAAAAA")));// true
        System.out.println(fileTest2.renameTo(new File("FolderAAAAA")));// false
        System.out.println(fileTest3.renameTo(new File("FolderAAAAA")));// false

    }

}