package job;

public class ProducerAndConsumer {

    public static void main(String[] args) {

    }
}

class Product {// ��Ʒ��
    private Integer productId = 1;// ��Ʒ��ţ����Լ���������
    private Boolean exist = false;// ��Ʒ�Ƿ���ڣ���ʼ״̬Ϊ������

    public Integer getProductId() {// ��������˽�л����ṩ��Ӧ��get/set����
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

class Producer implements Runnable {// ����һ����������ʵ��Runnable�ӿ�
    private Product product;// �̵߳Ĺ������ݣ���Ʒ��

    Producer(Product product) {
        this.product = product;
    }

    public void run() {// ʵ��Runnable�ӿڵ�run����
        while (true) {
            synchronized (product) {
                if (product.getExist() == false) {// �����Ʒ�����ڣ���ʼ������Ʒ
                    System.out.println(Thread.currentThread().getName() + "����������Ʒ" + product.getProductId());
                    System.out.println("��Ʒ" + product.getProductId() + "�������");
                    product.setProductId(product.getProductId() + 1);
                }
            }
        }
    }
}