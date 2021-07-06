package job;

public class InputContentRunnable {
//  ͨ���̳�Threadʵ�֣�
//      �����������̣��ֱ��ӡ���֣���д��ĸ��Сд��ĸ��30����
//      Ҫ�󣺴�ӡ���ֵĴ�ӡ��5�ȴ�Сд��ĸ���̣���ӡСд��ĸ�Ĵ�ӡ��a�ȴ���д���̣�
    public static void main(String[] args) {
        Runnable inputCapital = new InputCapital();// ʹ�ö�̬����Runnable��ʵ����
        Thread capital = new Thread(inputCapital, "���ڴ�ӡ��д��ĸ��");// �����̶߳���ͨ�����췽����������ʵ�������

        Runnable inputLowercase = new InputLowercase(capital);// ����Сд��ĸҪ�ȴ���д��ĸ�����ǽ���д��ĸ���̶߳�����
        Thread lowercase = new Thread(inputLowercase, "���ڴ�ӡСд��ĸ����");

        Runnable inputNumber = new InputNumber(lowercase);// ����Ҫ�ȴ�Сд��ĸ�����ǽ�Сд��ĸ���̶߳�����
        Thread number = new Thread(inputNumber, "���ڴ�ӡ���֣�����");

        capital.start();// �����̶߳����start����
        lowercase.start();
        number.start();

    }
}

class InputNumber implements Runnable {// ��ӡ���ֵ��߳�
    Thread inputLowercase;// �������Ƕ���һ��Thread���͵����ã�����ȷ�����õ�join������������Ҫ�ȴ����̶߳���

    public InputNumber() {

    }

    public InputNumber(Thread inputLowercase) {// ����һ������ΪThread����Ĳ����б����ڽ��մ����Thread���󲢸����Ը�ֵ
        this.inputLowercase = inputLowercase;// ������Դ������˭��join�ͱ�˭���ã�����ͻ����ض��Ľڵ�ȴ�˭
    }

    public void run() {
        for (int count = 0; count < 30; count++) {// �������30��
            Character number = (char) (Math.random() * 10 + '0');// ������ɵ�����ַ��������һ�������ַ�
            System.out.println(Thread.currentThread().getName() + number);
            if (number == '5') {
                try {
                    inputLowercase.join();// ��number��ֵΪ�ַ�5ʱ���ȴ�Сд��ĸ������
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

class InputCapital implements Runnable {// ��ӡ��д��ĸ���߳�
    public void run() {
        for (int count = 0; count < 30; count++) {
            System.out.println(Thread.currentThread().getName() + (char) (Math.random() * 10 + 'A'));// ��ӡ������ɵĴ�д��ĸ
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class InputLowercase implements Runnable {// ��ӡСд��ĸ���߳�
    Thread inputCapital;

    public InputLowercase() {

    }

    public InputLowercase(Thread inputCapital) {// ����join���õ��̶߳���
        this.inputCapital = inputCapital;// ������Դ������˭��join�ͱ�˭���ã�����ͻ����ض��Ľڵ�ȴ�˭
    }

    public void run() {
        for (int count = 0; count < 30; count++) {
            Character lowercase = (char) (Math.random() * 10 + 'a');// ���������ɵ�Сд��ĸ�ַ�
            System.out.println(Thread.currentThread().getName() + lowercase);// ��ӡ������ɵ�Сд��ĸ
            if (lowercase == 'a') {
                try {
                    inputCapital.join();// �����������Сд��ĸΪaʱ���ȴ���д��ĸ���н���
                } catch (Exception e) {
                    throw new RuntimeException();// �쳣ת��
                }
            }
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                throw new RuntimeException();
            }
        }
    }
}