package code;

public class ObjectEqualsDemo {
//Object常用方法4：boolean equals(Object obj) 判断当前引用和参数引用是否指向同一对象
    public static void main(String[] args) {
        Plant p1 = new Plant();
        p1.setName("牵牛花");

        Plant p2 = new Plant();
        p2.setName("迎春花");

        System.out.println(p1.equals(p2)); // false 两引用指向地址不一样false

        Plant p3 = p1;
        System.out.println(p1.equals(p3));// true 两引用指向地址一样true

        // 问题引入：equals判断的是两对象的地址是否指向同以对象,但地址对于我们没有任何意义,我们看中的只是属性
        Plant p4 = new Plant();
        p4.setName(p1.getName());
        System.out.println(p1.equals(p4));
        // 如上,p1的名字与p4一致,都是牵牛花,从广义上来讲它们指的是同一类事物,但结果却为false;
        // equals判断的是两实例化的对象,若想判断两对象属性,我们需要重写equals方法;
    }
}

class Plant {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
