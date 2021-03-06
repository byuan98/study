package test;

public class TestOne {
//    包装类复习测试
    public static void main(String[] args) {
//        Java为了使程序完全面向对象，为八种基本数据类型提供了对应的包装类；
//        只需学习Integer与Character，Integer类与其他六种方法一致，Character中有一些特别的方法；
//        包装类牵扯到三种数据类型的转换，所以可围绕这三种数据转换进行学习；
//        基本数据类型与包装类的相互转换、包装类与字符串的相互转换、基本数据类型与字符串的相互转换

//        IntegerTest();
        CharacterTest();

    }

    private static void IntegerTest() {// Integer类测试
//        1、基本数据类型转包装类
        {
            int i = 10;
            Integer in1 = new Integer(i);// 使用构造方法进行转换
            Integer in2 = Integer.valueOf(i);// 使用静态方法valueOf()进行转换
            Integer in3 = i;// 自动装箱，编译器自动实现:i3=new Integer(30)
//            自动装箱时，当取值为[-128,127]之间时使用的是相同对象；
//            在这个范围之外每装箱一次就是一个新的对象；
        }
//        2、包装类转基本数据类型
        {
            Integer in1 = 20;
            int i1 = in1.intValue();// 使用普通方法intValue()进行转换
            int i2 = in1;// 自动拆箱
        }
//        3、字符串转包装类
        {
            String s1 = "30";
            String s2 = "30a";
            Integer in1 = new Integer(s1);// 使用构造方法进行转换
//            Integer in2=new Integer(s2);//如果传入字符串中有非数字字符，则出现异常：NumberFormatException
            Integer in3 = Integer.valueOf(s1);// 使用静态方法进行转换
//            Integer in4=Integer.valueOf(s2);//如果传入字符串有非数字字符，则出现异常NumberFormatException
        }
//        4、包装类转字符串
        {
            Integer in1 = 40;
            String s1 = in1.toString();// 普通方法toString()
            String s2 = "" + in1;// 使用双引号连接
        }

//        5、基本数据类型转字符串
        {
            int i1 = 50;
            String s1 = Integer.toBinaryString(i1);// 获取i1的二进制
            String s2 = Integer.toOctalString(i1);// 获取i1的八进制
            String s3 = Integer.toHexString(i1);// 获取i1的十六进制
            String s4 = Integer.toString(i1, 2);// 获取i1的radix进制，默认为10
            String s5 = "" + i1;// 使用双引号连接
        }
//        6、字符串转基本数据类型
        {
            String s = "60";
            int i1 = Integer.valueOf(s);// 使用静态方法valueOf()进行转换
            int i2 = Integer.parseInt(s);// 使用静态方法parseInt()进行转换
        }
    }

    private static void CharacterTest() {// Character类测试
////        static boolean isDigit(char ch)//是不是数字字符
//        {
//            Character ch1=new Character('a');
//            Character ch2=new Character((char)97);
//            Character ch3=new Character('9');
//            System.out.println(Character.isDigit(ch1));//false
//            System.out.println(ch1.isDigit(ch2));//false
//            System.out.println(ch3.isDigit(ch3));//true
//        }
//        
////        static boolean isLetter(char ch)//是不是单词字符 (字母/汉字/日文/俄文)
//        {
//            Character ch1=new Character('中');
//            Character ch2=new Character((char)97);//'a'
//            Character ch3=new Character('9');
//            System.out.println(Character.isLetter(ch1));//true
//            System.out.println(ch1.isLetter(ch2));//true
//            System.out.println(ch3.isLetter(ch3));//false
//        }
//      
////        static boolean isLetterOrDigit(char ch)//是不是数字或者单词字符
//        {
//            char c1='1';
//            char c2='a';
//            char c3='中';
//            char c4='\n';
//            Character ch1=new Character(c1);
//            Character ch2=new Character(c2);
//            Character ch3=new Character(c3);
//            Character ch4=new Character(c4);
//            System.out.println(Character.isLetterOrDigit(c1));//true
//            System.out.println(Character.isLetterOrDigit(c2));//true
//            System.out.println(Character.isLetterOrDigit(c3));//true
//            System.out.println(Character.isLetterOrDigit(c4));//false
//        }
//       
////        static boolean isLowerCase(char ch)//是不是小写字符
//        {
//            Character ch1='a';
//            Character ch2=97;//'a'
//            Character ch3='1';
//            Character ch4='A';
//            
//            System.out.println(Character.isLowerCase(ch1));//true
//            System.out.println(Character.isLowerCase(ch2));//true
//            System.out.println(Character.isLowerCase(ch3));//false
//            System.out.println(Character.isLowerCase(ch4));//false
//        }
//       
////        static boolean isUpperCase(char ch)//是不是大写字符
//        {
//          Character ch1='a';
//          Character ch2=97;//'a'
//          Character ch3='1';
//          Character ch4='A';
//          
//          System.out.println(Character.isUpperCase(ch1));//false
//          System.out.println(Character.isUpperCase(ch2));//false
//          System.out.println(Character.isUpperCase(ch3));//false
//          System.out.println(Character.isUpperCase(ch4));//true
//        }
//       
//        static boolean isWhitespace(char ch)//是不是空白字符 (\r\n\t )
//        {
//            Character ch1='\n';
//            Character ch2='\r';
//            Character ch3='\t';
//            Character ch4='a';
//            Character ch5='A';
//            Character ch6='\b';
//
//            System.out.println(Character.isWhitespace(ch1));//true
//            System.out.println(Character.isWhitespace(ch2));//true
//            System.out.println(Character.isWhitespace(ch3));//true
//            System.out.println(Character.isWhitespace(ch4));//false
//            System.out.println(Character.isWhitespace(ch5));//false
//            System.out.println(Character.isWhitespace(ch6));//false
//        }
//
//        static char toLowerCase(char ch)//大写转小写
//        {
//            Character ch1='a';
//            Character ch2='A';
//            Character ch3=97;//'a'
//            Character ch4=' ';
//            Character ch5='1';
//            System.out.println(Character.toLowerCase(ch1));//a
//            System.out.println(Character.toLowerCase(ch2));//a
//            System.out.println(Character.toLowerCase(ch3));//a
//            System.out.println(Character.toLowerCase(ch4));//' '
//            System.out.println(Character.toLowerCase(ch5));//1
//        }
//        
//        static char toUpperCase(char ch)//小写转大写
//        {
//          Character ch1='a';
//          Character ch2='A';
//          Character ch3=97;//'a'
//          Character ch4=' ';
//          Character ch5='1';
//          System.out.println(Character.toUpperCase(ch1));//A
//          System.out.println(Character.toUpperCase(ch2));//A
//          System.out.println(Character.toUpperCase(ch3));//A
//          System.out.println(Character.toUpperCase(ch4));//' '
//          System.out.println(Character.toUpperCase(ch5));//1
//        }
    }
}
