package job;

public class InputContentRunnable2 {
//  通过继承Thread实现：
//      创建三个进程，分别打印数字，大写字母，小写字母各30个；
//      要求：打印数字的打印到5等待小写字母进程，打印小写字母的打印到a等待大写进程；
    public static void main(String[] args) {
//        Input构造器参数格式(需要等待的进程，取值范围，初始值)
        Runnable inputCapital = new Input(null, 26, 'A');// 使用多态创建Runnable的实现类
        Thread capital = new Thread(inputCapital, "正在打印大写字母：");// 创建线程对象，通过构造方法参数关联实现类对象

        Runnable inputLowercase = new Input(capital, 26, 'a');// 由于小写字母要等待大写字母，我们将大写字母的线程对象传入
        Thread lowercase = new Thread(inputLowercase, "正在打印小写字母：：");

        Runnable inputNumber = new Input(lowercase, 10, '0');// 数字要等待小写字母，我们将小写字母的线程对象传入
        Thread number = new Thread(inputNumber, "正在打印数字：：：");

        capital.start();// 调用线程对象的start方法
        lowercase.start();
        number.start();

    }
}

class Input implements Runnable {// 声明实现Runnable接口的类
    private Integer range;// 存放随机的范围，属性私有化利用构造器进行赋值
    private Character initial;// 存放随机字符的起点
    private Thread wait;// 存放进行等待的线程类

    Input(Thread wait, Integer range, Character initial) {
        this.wait = wait;// 传入需要等待执行的线程类
        this.range = range;// 随机的范围
        this.initial = initial;// 随机的初始字符，数字是字符0，大写字母是字符A，小写字母是字符a
    }

    public void run() {
        for (int count = 0; count < 30; count++) {// 随机生成30次
            Character content = (char) (Math.random() * range + initial);// 存放生成的随机字符，结果是一个数字字符
            System.out.println(Thread.currentThread().getName() + content);
            if (content == '5' || content == 'a') {// 当content等于5或者等于a，就暂停当前进程等待wait的执行
                try {// 小写字母的随机结果不可能是5，数字随机的结果不可能是a，所以这里设置条件判断，完成代码的复用
                    wait.join();
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