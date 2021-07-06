package code;

public class CharacterCode {
//包装类之Character
    public static void main(String[] args) {
        // Character常用方法
        // static boolean isDigit(char ch);//是不是数字字符
        // static boolean isLetter(char ch);//是不是单词字符(字母、汉字、日文、俄文等)
        // static boolean isLetterOrDigit(char ch);//是不是数字或者单词字符
        // static boolean isLowerCase(char ch);//是不是小写字符
        // static boolean isUpperCase(char ch);//是不是大写字符
        // static boolean isWhitespace(char ch);//是不是空白字符(\r、\n、\t等)

        // static char toLowerCase(char ch);//大写转小写
        // static char toUpperCase(char ch);//小写转大写

        char a = Character.toLowerCase('A');
        char b = Character.toLowerCase('b');
        System.out.println(a);
        System.out.println(b);
    }

}
