package job;

public class Job4 {
//	дһ������ static String changeStr(String s); ��дת��ΪСд Сдת��Ϊ��д ɾ������
    public static void main(String[] args) {
        System.out.println(changeStr("123dhfoi###fhJJJFDDDD"));
    }

    static String changeStr(String s) {
        String sCopy = "";
        char[] arrayString = s.toCharArray();
        for (char ch : arrayString) {
            if (ch <= 'Z' && ch >= 'A') {
                sCopy += (char) ((int) ch + 32);
            } else if (ch <= 'z' && (int) ch >= 'a') {
                sCopy += (char) ((int) ch - 32);
            } else if (ch < '0' || ch > '9') {
                sCopy += ch;
            }
        }
        return sCopy;
    }
}
