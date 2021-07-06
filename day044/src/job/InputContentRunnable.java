package job;

public class InputContentRunnable {
//  通过继承Thread实现：
//      创建三个进程，分别打印数字，大写字母，小写字母各30个；
//      要求：打印数字的打印到5等待小写字母进程，打印小写字母的打印到a等待大写进程；
    public static void main(String[] args) {
        Runnable inputCapital = new InputCapital();// 使用多态创建Runnable的实现类
        Thread capital = new Thread(inputCapital, "正在打印大写字母：");// 创建线程对象，通过构造方法参数关联实现类对象

        Runnable inputLowercase = new InputLowercase(capital);// 由于小写字母要等待大写字母，我们将大写字母的线程对象传入
        Thread lowercase = new Thread(inputLowercase, "正在打印小写字母：：");

        Runnable inputNumber = new InputNumber(lowercase);// 数字要等待小写字母，我们将小写字母的线程对象传入
        Thread number = new Thread(inputNumber, "正在打印数字：：：");

        capital.start();// 调用线程对象的start方法
        lowercase.start();
        number.start();

    }
}

class InputNumber implements Runnable {// 打印数字的线程
    Thread inputLowercase;// 这里我们定义一个Thread类型的引用，用以确保调用的join方法是我们想要等待的线程对象

    public InputNumber() {

    }

    public InputNumber(Thread inputLowercase) {// 定义一个参数为Thread对象的参数列表，用于接收传入的Thread对象并给属性赋值
        this.inputLowercase = inputLowercase;// 这个属性传入的是谁，join就被谁调用，程序就会在特定的节点等待谁
    }

    public void run() {
        for (int count = 0; count < 30; count++) {// 随机生成30次
            Character number = (char) (Math.random() * 10 + '0');// 存放生成的随机字符，结果是一个数字字符
            System.out.println(Thread.currentThread().getName() + number);
            if (number == '5') {
                try {
                    inputLowercase.join();// 当number的值为字符5时，等待小写字母的输入
                } catch (Exception e) {
                    throw new RuntimeException();// 异常转换
                }
            }
            try {
                Thread.sleep(100);// 为确保能够看清结果，我们设定sleep的值为100毫秒，降低Console的输出速度
            } catch (Exception e) {
                throw new RuntimeException();
            }
        }
    }
}

class InputCapital implements Runnable {// 打印大写字母的线程
    public void run() {
        for (int count = 0; count < 30; count++) {
            System.out.println(Thread.currentThread().getName() + (char) (Math.random() * 10 + 'A'));// 打印随机生成的大写字母
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class InputLowercase implements Runnable {// 打印小写字母的线程
    Thread inputCapital;

    public InputLowercase() {

    }

    public InputLowercase(Thread inputCapital) {// 接收join调用的线程对象
        this.inputCapital = inputCapital;// 这个属性传入的是谁，join就被谁调用，程序就会在特定的节点等待谁
    }

    public void run() {
        for (int count = 0; count < 30; count++) {
            Character lowercase = (char) (Math.random() * 10 + 'a');// 存放随机生成的小写字母字符
            System.out.println(Thread.currentThread().getName() + lowercase);// 打印随机生成的小写字母
            if (lowercase == 'a') {
                try {
                    inputCapital.join();// 当随机出来的小写字母为a时，等待大写字母运行结束
                } catch (Exception e) {
                    throw new RuntimeException();// 异常转换
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