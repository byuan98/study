package job;

public class InputContentRunnable2 {
//  ͨ���̳�Threadʵ�֣�
//      �����������̣��ֱ��ӡ���֣���д��ĸ��Сд��ĸ��30����
//      Ҫ�󣺴�ӡ���ֵĴ�ӡ��5�ȴ�Сд��ĸ���̣���ӡСд��ĸ�Ĵ�ӡ��a�ȴ���д���̣�
    public static void main(String[] args) {
//        Input������������ʽ(��Ҫ�ȴ��Ľ��̣�ȡֵ��Χ����ʼֵ)
        Runnable inputCapital = new Input(null, 26, 'A');// ʹ�ö�̬����Runnable��ʵ����
        Thread capital = new Thread(inputCapital, "���ڴ�ӡ��д��ĸ��");// �����̶߳���ͨ�����췽����������ʵ�������

        Runnable inputLowercase = new Input(capital, 26, 'a');// ����Сд��ĸҪ�ȴ���д��ĸ�����ǽ���д��ĸ���̶߳�����
        Thread lowercase = new Thread(inputLowercase, "���ڴ�ӡСд��ĸ����");

        Runnable inputNumber = new Input(lowercase, 10, '0');// ����Ҫ�ȴ�Сд��ĸ�����ǽ�Сд��ĸ���̶߳�����
        Thread number = new Thread(inputNumber, "���ڴ�ӡ���֣�����");

        capital.start();// �����̶߳����start����
        lowercase.start();
        number.start();

    }
}

class Input implements Runnable {// ����ʵ��Runnable�ӿڵ���
    private Integer range;// �������ķ�Χ������˽�л����ù��������и�ֵ
    private Character initial;// �������ַ������
    private Thread wait;// ��Ž��еȴ����߳���

    Input(Thread wait, Integer range, Character initial) {
        this.wait = wait;// ������Ҫ�ȴ�ִ�е��߳���
        this.range = range;// ����ķ�Χ
        this.initial = initial;// ����ĳ�ʼ�ַ����������ַ�0����д��ĸ���ַ�A��Сд��ĸ���ַ�a
    }

    public void run() {
        for (int count = 0; count < 30; count++) {// �������30��
            Character content = (char) (Math.random() * range + initial);// ������ɵ�����ַ��������һ�������ַ�
            System.out.println(Thread.currentThread().getName() + content);
            if (content == '5' || content == 'a') {// ��content����5���ߵ���a������ͣ��ǰ���̵ȴ�wait��ִ��
                try {// Сд��ĸ����������������5����������Ľ����������a�������������������жϣ���ɴ���ĸ���
                    wait.join();
                } catch (Exception e) {
                    throw new RuntimeException();// �쳣ת��
                }
            }
            try {
                Thread.sleep(100);// Ϊȷ���ܹ��������������趨sleep��ֵΪ100���룬����Console������ٶ�
            } catch (Exception e) {
                throw new RuntimeException();
            }
        }
    }
}