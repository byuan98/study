package job;

public class Chap02_6 {

    public static void main(String[] args) {
        for (int roosterNumber = 0; roosterNumber <= 33; roosterNumber++) {
            for (int henNumber = 0; henNumber <= 50; henNumber++) {
                for (int chickenNumber = 0; chickenNumber <= 300; chickenNumber += 3) {
                    if (roosterNumber + henNumber + chickenNumber == 100
                            && roosterNumber * 3 + henNumber * 2 + chickenNumber / 3 == 100) {
                        System.out.println("100��Ǯ�� 100 ֻ�������й���" + roosterNumber + "ֻ��ĸ��" + henNumber + "ֻ��С��"
                                + chickenNumber + "ֻ");
                    }
                }
            }
        }

    }

}
