package job;

public class InputCountThread {

    public static void main(String[] args) {
//        InputContent�����������ʽ(�߳�������Ҫ�ȴ��Ľ��̣�ȡֵ��Χ����ʼ�ַ�)
        Thread inputCapital = new InputContent("��ӡ��д��ĸ��", null, 26, 'A');// ��̬
        Thread inputLowercase = new InputContent("��ӡСд��ĸ����", inputCapital, 26, 'a');
        Thread inputNumber = new InputContent("��ӡ���֣���", inputLowercase, 10, '0');
        inputCapital.start();// ����inputCapital�̵߳�start����
        inputLowercase.start();
        inputNumber.start();
    }

}

class InputContent extends Thread {
    private Integer range;// �������ķ�Χ������˽�л����ù��������и�ֵ
    private Character initial;// �������ַ������
    private Thread wait;// ��Ž��еȴ����߳���

    InputContent(String name, Thread wait, Integer range, Character initial) {
        super(name);// ���ø���Ĺ��췽�������߳�����
        this.wait = wait;// ������Ҫ�ȴ�ִ�е��߳���
        this.range = range;// ����ķ�Χ
        this.initial = initial;// ����ĳ�ʼ�ַ����������ַ�0����д��ĸ���ַ�A��Сд��ĸ���ַ�a
    }

    public void run() {
        for (int count = 0; count < 30; count++) {
            Character content = (char) (Math.random() * range + initial);// �������Ľ��
            System.out.println(Thread.currentThread().getName() + content);
            if (content == '5' || content == 'a') {// ��д��ĸ����ȴ������ȼ���� �����Բ������������ж�
                try {// Сд��ĸ����������������5����������Ľ����������a�������������������жϣ���ɴ���ĸ���
//                    System.out.println(content+"�ȴ�����"+wait.getName());//���Դ���content��������5����a��wait.getName()�ǻ�ȡ��Ҫ�ȴ����߳���
                    wait.join();// ��ֹ��ǰ���̣��ȴ�wait���̵�ִ��
                } catch (Exception e) {
                    throw new RuntimeException();// �쳣ת��
                }
            }
            try {
                Thread.sleep(100);// Ϊ�˷���۲������趨sleepΪ100����
            } catch (Exception e) {
                throw new RuntimeException();// �쳣ת��
            }
        }
    }
}