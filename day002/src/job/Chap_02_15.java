package job;

public class Chap_02_15 {

    public static void main(String[] args) {
        /*
         * PI=4/1-4/3+4/5-4/7+4/9-4/11+4/13-4/15+4/17...... �����ʽ�Ľ�������޽ӽ���Բ���ʵ�ֵ,
         * �ҹ��Ŵ���ѧ�����֮�����,Բ������3.1415926 ��3.1415927 ֮��, ���̼���,Ҫ��õ������Ľ��,��Ҫ�������ٴμӼ�������?
         */
        System.out.println(
                "#" + (4 / 1.0 - 4 / 3.0 + 4 / 5.0 - 4 / 7.0 + 4 / 9.0 - 4 / 11.0 + 4 / 13.0 - 4 / 15.0 + 4 / 17.0));
        double pi = 4.0;
        int number = 1;
        for (double denominator = 3.0;; denominator += 2) {
            if (number % 2 != 0) {
                pi -= 4.0 / denominator;
            } else {
                pi += 4.0 / denominator;
            }
            number++;
            if (number == 17) {
                System.out.println(pi);
                break;
            }
            if (pi > 3.1415926 && pi < 3.1415927) {
                System.out.println(pi + ":::" + number);
                break;
            }
        }
    }
}
