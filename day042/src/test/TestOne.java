package test;

public class TestOne {
//    ��װ�ิϰ����
    public static void main(String[] args) {
//        JavaΪ��ʹ������ȫ�������Ϊ���ֻ������������ṩ�˶�Ӧ�İ�װ�ࣻ
//        ֻ��ѧϰInteger��Character��Integer�����������ַ���һ�£�Character����һЩ�ر�ķ�����
//        ��װ��ǣ���������������͵�ת�������Կ�Χ������������ת������ѧϰ��
//        ���������������װ����໥ת������װ�����ַ������໥ת�������������������ַ������໥ת��

//        IntegerTest();
        CharacterTest();

    }

    private static void IntegerTest() {// Integer�����
//        1��������������ת��װ��
        {
            int i = 10;
            Integer in1 = new Integer(i);// ʹ�ù��췽������ת��
            Integer in2 = Integer.valueOf(i);// ʹ�þ�̬����valueOf()����ת��
            Integer in3 = i;// �Զ�װ�䣬�������Զ�ʵ��:i3=new Integer(30)
//            �Զ�װ��ʱ����ȡֵΪ[-128,127]֮��ʱʹ�õ�����ͬ����
//            �������Χ֮��ÿװ��һ�ξ���һ���µĶ���
        }
//        2����װ��ת������������
        {
            Integer in1 = 20;
            int i1 = in1.intValue();// ʹ����ͨ����intValue()����ת��
            int i2 = in1;// �Զ�����
        }
//        3���ַ���ת��װ��
        {
            String s1 = "30";
            String s2 = "30a";
            Integer in1 = new Integer(s1);// ʹ�ù��췽������ת��
//            Integer in2=new Integer(s2);//��������ַ������з������ַ���������쳣��NumberFormatException
            Integer in3 = Integer.valueOf(s1);// ʹ�þ�̬��������ת��
//            Integer in4=Integer.valueOf(s2);//��������ַ����з������ַ���������쳣NumberFormatException
        }
//        4����װ��ת�ַ���
        {
            Integer in1 = 40;
            String s1 = in1.toString();// ��ͨ����toString()
            String s2 = "" + in1;// ʹ��˫��������
        }

//        5��������������ת�ַ���
        {
            int i1 = 50;
            String s1 = Integer.toBinaryString(i1);// ��ȡi1�Ķ�����
            String s2 = Integer.toOctalString(i1);// ��ȡi1�İ˽���
            String s3 = Integer.toHexString(i1);// ��ȡi1��ʮ������
            String s4 = Integer.toString(i1, 2);// ��ȡi1��radix���ƣ�Ĭ��Ϊ10
            String s5 = "" + i1;// ʹ��˫��������
        }
//        6���ַ���ת������������
        {
            String s = "60";
            int i1 = Integer.valueOf(s);// ʹ�þ�̬����valueOf()����ת��
            int i2 = Integer.parseInt(s);// ʹ�þ�̬����parseInt()����ת��
        }
    }

    private static void CharacterTest() {// Character�����
////        static boolean isDigit(char ch)//�ǲ��������ַ�
//        {
//            Character ch1=new Character('a');
//            Character ch2=new Character((char)97);
//            Character ch3=new Character('9');
//            System.out.println(Character.isDigit(ch1));//false
//            System.out.println(ch1.isDigit(ch2));//false
//            System.out.println(ch3.isDigit(ch3));//true
//        }
//        
////        static boolean isLetter(char ch)//�ǲ��ǵ����ַ� (��ĸ/����/����/����)
//        {
//            Character ch1=new Character('��');
//            Character ch2=new Character((char)97);//'a'
//            Character ch3=new Character('9');
//            System.out.println(Character.isLetter(ch1));//true
//            System.out.println(ch1.isLetter(ch2));//true
//            System.out.println(ch3.isLetter(ch3));//false
//        }
//      
////        static boolean isLetterOrDigit(char ch)//�ǲ������ֻ��ߵ����ַ�
//        {
//            char c1='1';
//            char c2='a';
//            char c3='��';
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
////        static boolean isLowerCase(char ch)//�ǲ���Сд�ַ�
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
////        static boolean isUpperCase(char ch)//�ǲ��Ǵ�д�ַ�
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
//        static boolean isWhitespace(char ch)//�ǲ��ǿհ��ַ� (\r\n\t )
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
//        static char toLowerCase(char ch)//��дתСд
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
//        static char toUpperCase(char ch)//Сдת��д
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