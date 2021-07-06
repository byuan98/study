package code;

public class OverRideEqualsDemo {
//重写Equals方法,使其比较的不是地址而是属性
    public static void main(String[] args) {
        Bird b1 = new Bird();
        b1.setName("喜鹊");

        Bird b2 = new Bird();
        b2.setName(b1.getName());

        System.out.println(b1.equals(b2));
    }
}

class Bird {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 重写Object类的equals方法,方法声明必须和父类相同
    public boolean equals(Object obj) {
        if (obj instanceof Bird) {
            // 向下转型
            Bird b = (Bird) obj;
            // 判断两字符串是否相同,调用字符串的equals方法;
            return this.name.equals(b.name);
        }
        return false;
    }
}