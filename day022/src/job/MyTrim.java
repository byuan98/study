package job;

public class MyTrim {
//	3��дһ������ static String myTrim(String s);ģ���ַ�����trim����
//  ȥ�����߿ո�
    public static void main(String[] args) {
        System.out.println(myTrim("                  "));

    }

    static String myTrim(String s) {
        int indexLow = 0;
        int indexHigh = s.length() - 1;
        for (; indexLow < s.length();) {
            if (s.charAt(indexLow) != ' ') {
                break;
            } else {
                indexLow++;
            }
        }
        for (; indexHigh >= 0;) {
            if (s.charAt(indexHigh) != ' ') {
                break;
            } else {
                indexHigh--;
            }
        }
        if (indexLow > indexHigh) {
            return "";
        }
        return s.substring(indexLow, indexHigh + 1);
    }

}
