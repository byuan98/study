package job;

public class Ticketing {

    public static void main(String[] args) {
        TicketWindow ticketWindow = new TicketWindow();

        Thread ticketing1 = new Thread(ticketWindow, "��Ʊ����1��");
        Thread ticketing2 = new Thread(ticketWindow, "��Ʊ����2��");
        Thread ticketing3 = new Thread(ticketWindow, "��Ʊ����3��");
        ticketing1.start();
        ticketing2.start();
        ticketing3.start();
    }
}

class TicketWindow implements Runnable {// ����һ����Ʊ�����࣬ʵ��Runnable�ӿ�
    private static Integer ticketId = 1;// ����һ�������ĳ�Ա�������ñ�����ŵ�ǰ�ĳ�Ʊ���

    public void run() {
        while (true) {
            synchronized (ticketId) {
                if (ticketId > 100) {
                    break;
                }
                System.out.println(Thread.currentThread().getName() + ticketId + "��Ʊ");
                ticketId++;
            }
//            try {
//                Thread.sleep(50);//��������ʱ�䣬ʹ����ܹ����ӵ�ֱ��
//            } catch (InterruptedException e) {
//                throw new RuntimeException();
//            }
        }
    }
}