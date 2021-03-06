package job;

public class InputCountThread {

    public static void main(String[] args) {
//        InputContent构造器传入格式(线程名，需要等待的进程，取值范围，初始字符)
        Thread inputCapital = new InputContent("打印大写字母：", null, 26, 'A');// 多态
        Thread inputLowercase = new InputContent("打印小写字母：：", inputCapital, 26, 'a');
        Thread inputNumber = new InputContent("打印数字：：", inputLowercase, 10, '0');
        inputCapital.start();// 调用inputCapital线程的start方法
        inputLowercase.start();
        inputNumber.start();
    }

}

class InputContent extends Thread {
    private Integer range;// 存放随机的范围，属性私有化利用构造器进行赋值
    private Character initial;// 存放随机字符的起点
    private Thread wait;// 存放进行等待的线程类

    InputContent(String name, Thread wait, Integer range, Character initial) {
        super(name);// 利用父类的构造方法传入线程名称
        this.wait = wait;// 传入需要等待执行的线程类
        this.range = range;// 随机的范围
        this.initial = initial;// 随机的初始字符，数字是字符0，大写字母是字符A，小写字母是字符a
    }

    public void run() {
        for (int count = 0; count < 30; count++) {
            Character content = (char) (Math.random() * range + initial);// 存放随机的结果
            System.out.println(Thread.currentThread().getName() + content);
            if (content == '5' || content == 'a') {// 大写字母无需等待，优先级最高 ，所以不用设置条件判断
                try {// 小写字母的随机结果不可能是5，数字随机的结果不可能是a，所以这里设置条件判断，完成代码的复用
//                    System.out.println(content+"等待：："+wait.getName());//测试代码content是条件，5或者a；wait.getName()是获取需要等待的线程名
                    wait.join();// 终止当前进程，等待wait进程的执行
                } catch (Exception e) {
                    throw new RuntimeException();// 异常转换
                }
            }
            try {
                Thread.sleep(100);// 为了方便观察结果，设定sleep为100毫秒
            } catch (Exception e) {
                throw new RuntimeException();// 异常转换
            }
        }
    }
}
