package job;

import java.util.*;

public class StatisticsChar {

    public static void main(String[] args) {
        statisticsChar();

    }

    private static void statisticsChar() {
        System.out.println("������һ�����ⳤ�ȵ��ַ���:");
        Scanner input = new Scanner(System.in);
        String str = input.next();
//		String str=new Scanner(System.in).next();//���д������������еȼ�,���д���ʹ������������

        HashMap<Character, Integer> countChar = new HashMap();// ����һ��HashMap����װ�ַ���ÿ���ַ��ĸ���
        for (int index = 0; index < str.length(); index++) {
            countChar.put(str.charAt(index), 0);// ��������ַ���,��ÿ���ַ���Ϊ��������HashMap��,��ʼֵ��Ϊ0
        }
        System.out.println(countChar);

        for (int index = 0; index < str.length(); index++) {// ͬ����ʼ������ַ������б���,�ó�ÿһ���ַ�
            Set<Character> keys = countChar.keySet();// ��ȡ���HashMap�е���������
            for (Character key : keys) {// ��ʼ��������
                if (key == str.charAt(index)) {
                    Integer number = countChar.get(key) + 1;// ���˵����������ڱ������ַ������ַ�,�Ͷ����������Ӧ��ֵ����+1����
                    countChar.put(str.charAt(index), number);// ���µ�ֵ(������+1������ֵ)����Ŀǰ��������(���Ǿ�ֵ)
                    // countChar.put(key, number);//����һ�����ȼ�
                }
            }
        }
        System.out.println(countChar);
    }

}
