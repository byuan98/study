package test;

public class TestTwo {
//    ���ö���ʵ��ö��
    public static void main(String[] args) {
        

    }
}
//�����Ľ������:���췽��˽�л�,���ഴ������ָ���Ķ���,��©��������ȥʹ��
class Size{
    public String name;
    private Size(String name) {
        this.name=name;
    }
    public static final Size BIG=new Size("��");
    public static final Size MEDIUM=new Size("��");
    public static final Size SMALL=new Size("С");
}
