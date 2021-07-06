package code;

public class GoldbachConjecture {
//	��°ͺղ��룺����һ�����ڵ���6��ż�����ܲ��Ϊ2������
//    ��֤6��1000�ڵ�����ż��������
    public static void main(String[] args) {
        boolean flag = false; // ���,һ�����Ƿ���Էֽ�Ϊ��������֮��
        for (int number = 6; number < 1000; number += 2) { // 2-1000ż��
            flag = false;
            for (int frequency = 2; frequency <= number / 2; frequency++) {
                if (primeNumberJudge(frequency)) { // �Ե�ǰ��������Ϊȡֵ��Χ,�ҳ���һ������
                    if (primeNumberJudge(number - frequency)) { // һ�����ֽܷ�Ϊ������֮��,��ζ���������ȥһ����������Ҳ��һ������
                        System.out.println(number + "���Է�Ϊ" + frequency + "+" + (number - frequency));
                        flag = true; // һ�������ֽܷ�Ϊ��������֮������Ϊtrue
                        break; // �ҳ���ǰ����������������ֱ��������ǰ���ֵ�ѭ��
                    }
                }
            }
            if (flag == false) { // ���趨��flagΪfalse��˵�������ѭ����δ�ҵ����������ĺ�,�������������ҵ�,��������ѭ��
                System.out.println(number + "���ֽܷ�Ϊ���������ĺ�");
                break;
            }

        }
    }

    private static boolean primeNumberJudge(int number) { // �����ж�
        for (int frequency = 2; frequency <= number / 2; frequency++) {
            if (number % frequency == 0) {
                return false;
            }
        }
        return true;
    }
}
