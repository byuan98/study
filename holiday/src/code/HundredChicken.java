package code;

public class HundredChicken {
//	����Ǯ��ټ��� ���ҹ��Ŵ���������ѧ�⡣
//	   ��Ŀ����������
//	   3 ��Ǯ������1ֻ������
//	   2 ��Ǯ������һֻĸ����
//	   1 ��Ǯ������3 ֻС����
//	   ��100 ��Ǯ��100 ֻ������ô���й�����ĸ����С������ֻ
    public static void main(String[] args) { // ����ʹ����ٷ�
        for (int roosterNumber = 1; roosterNumber <= 33; roosterNumber++) { // ���100��ȫ���򹫼���������33ֻ
            for (int henNumber = 1; henNumber <= 50; henNumber++) { // ���100��ȫ����ĸ����������50ֻ
                for (int chickenNumber = 3; chickenNumber <= 100; chickenNumber += 3) { // һ������������300ֻС��,����������,�����������Ϊ100,��ȡֵ100,������ֻС��һ��Ǯ,�ʽ�3ֻС����Ϊһ����λ,С����������3��ʼ,+=3
                    if ((roosterNumber + henNumber + chickenNumber == 100)
                            && (roosterNumber * 3 + henNumber * 2 + chickenNumber / 3) == 100) { // ������ּ�ͬʱ����:����������������100,���ļ�Ǯ��������100,�����Ҫ�����
                        System.out.println(
                                "100��Ǯ��100ֻ��,���й���" + roosterNumber + "ֻ,ĸ��" + henNumber + "ֻ,С��" + chickenNumber + "ֻ");
                    }
                }
            }
        }

    }

}
