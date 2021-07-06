package test;

public class TestTwo {
//    利用多例实现枚举
    public static void main(String[] args) {
        

    }
}
//多例的解决方案:构造方法私有化,本类创建几个指定的对象,暴漏给调用者去使用
class Size{
    public String name;
    private Size(String name) {
        this.name=name;
    }
    public static final Size BIG=new Size("大");
    public static final Size MEDIUM=new Size("中");
    public static final Size SMALL=new Size("小");
}
