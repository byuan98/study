package job;

public class Job11 {
//	дһ������:���������ַ����ıȽ�
//  �ȱȽϳ���:s1���ȴ���s2�ͷ���1,С�ھͷ���-1   
//  ���������ͬ:������ַ������뼯���Ƚ�,s1��ͷ���1,s1С����-1��ͬ����0
//  public static int  myCompareto(String s1,String s2)
    public static void main(String[] args) {
        System.out.println(myCompareto("123", "678"));

    }

    public static int myCompareto(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return 1;
        } else if (s1.length() < s2.length()) {
            return -1;
        } else {
            for (int index = 0; index < s1.length(); index++) {
                if ((int) s1.charAt(index) > (int) s2.charAt(index)) {
                    return 1;
                } else if ((int) s1.charAt(index) < (int) s2.charAt(index)) {
                    return -1;
                }
            }
        }
        return 0;
    }
}
