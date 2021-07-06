package code;

public class MultiplicationTable {
//	��ӡ4�������99�˷���
    public static void main(String[] args) {
        tableDownLeft();
        tableTopLeft();
        tableTopRight();
        tableDownRight();

    }

//  �žų˷���Ĵ�ӡ��Ҫʹ��˫��ѭ���ṹ�����,
//	ѭ����ʼֵ��ȡֵ�������ж�(��ʱ����ո�)�����˾žų˷���ķ���
//	���۷������,�žų˷�����ֱ�Ǳ��յ�ʼ��Ϊ1*1��9*9,������һ�������ǿ���ȷ�����ѭ�����ڲ�ѭ���ĳ�ʼֵ
//	λ�ÿ���ĳ˷��������ж���ʱ����ո�,���ұߵĳ˷�������Ҫ������֧�ṹ���ж���ʱ���ӿո�
    private static void tableDownLeft() { // �žų˷�������
        for (int factorA = 1; factorA <= 9; factorA++) {
            for (int factorB = 1; factorB <= factorA; factorB++) {
                System.out.print(factorB + "*" + factorA + "=" + factorA * factorB + "\t");
            }
            System.out.println();
        }
    }

    private static void tableTopLeft() { // �žų˷�������
        for (int factorA = 9; factorA >= 1; factorA--) {
            for (int factorB = 1; factorB <= factorA; factorB++) {
                System.out.print(factorB + "*" + factorA + "=" + factorA * factorB + "\t");
            }
            System.out.println();
        }
    }

    private static void tableTopRight() { // �žų˷�������
        for (int factorA = 9; factorA >= 1; factorA--) {
            for (int factorB = 9; factorB >= 1; factorB--) {
                if (factorA >= factorB) { // �����һ���������ڻ���ڵڶ�������,�������ʽ
                    System.out.print(factorB + "*" + factorA + "=" + factorA * factorB + "\t");
                } else { // ��֮����Ʊ����λ,�Դﵽ���忿�ҵĽ��
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    private static void tableDownRight() { // �žų˷�������
        for (int factorA = 1; factorA <= 9; factorA++) {
            for (int factorB = 9; factorB >= 1; factorB--) {
                if (factorA >= factorB) {
                    System.out.print(factorB + "*" + factorA + "=" + factorA * factorB + "\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
