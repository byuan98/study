package job;

public class Ticketing {

    public static void main(String[] args) {
        TicketWindow ticketWindow = new TicketWindow();

        Thread ticketing1 = new Thread(ticketWindow, "售票窗口1：");
        Thread ticketing2 = new Thread(ticketWindow, "售票窗口2：");
        Thread ticketing3 = new Thread(ticketWindow, "售票窗口3：");
        ticketing1.start();
        ticketing2.start();
        ticketing3.start();
    }
}

class TicketWindow implements Runnable {// 定义一个售票窗口类，实现Runnable接口
    private static Integer ticketId = 1;// 定义一个公共的成员变量，该变量存放当前的车票编号

    public void run() {
        while (true) {
            synchronized (ticketId) {
                if (ticketId > 100) {
                    break;
                }
                System.out.println(Thread.currentThread().getName() + ticketId + "号票");
                ticketId++;
            }
//            try {
//                Thread.sleep(50);//设置休眠时间，使结果能够更加的直观
//            } catch (InterruptedException e) {
//                throw new RuntimeException();
//            }
        }
    }
}