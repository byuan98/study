package job;

public class StringCompare {
//	дһ���������������ַ����ıȽ�
//  �ȱȽϳ��� s1���ȴ���s2�ͷ���1 С�ھͷ���-1   
//  ���������ͬ��������ַ������뼯���Ƚ�s1��ͷ���1 s1С����-1��ͬ����0
//  public static int  myCompareto(String s1,String s2)
    public static void main(String[] args) {
        System.out.println(myCompareto("a123450", "b612345"));

    }

    public static int myCompareto(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return s1.length() > s2.length() ? 1 : -1;
        }

        for (int index = 0; index < s1.length(); index++) {
            if (s1.charAt(index) > s2.charAt(index)) {
                return 1;
            } else if (s1.charAt(index) < s2.charAt(index)) {
                return -1;
            }
        }
        return 0;
    }
}
