package job;

public class ProducerAndConsumer {

    public static void main(String[] args) {

    }
}

class Product {// 产品类
    private Integer productId = 1;// 产品编号，用以计数、区分
    private Boolean exist = false;// 产品是否存在，初始状态为不存在

    public Integer getProductId() {// 所有属性私有化，提供对应的get/set方法
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Boolean getExist() {
        return exist;
    }

    public void setExist(Boolean exist) {
        this.exist = exist;
    }
}

class Producer implements Runnable {// 创建一个生产者类实现Runnable接口
    private Product product;// 线程的共享数据，产品类

    Producer(Product product) {
        this.product = product;
    }

    public void run() {// 实现Runnable接口的run方法
        while (true) {
            synchronized (product) {
                if (product.getExist() == false) {// 如果产品不存在，则开始生产产品
                    System.out.println(Thread.currentThread().getName() + "正在生产产品" + product.getProductId());
                    System.out.println("产品" + product.getProductId() + "生产完毕");
                    product.setProductId(product.getProductId() + 1);
                }
            }
        }
    }
}