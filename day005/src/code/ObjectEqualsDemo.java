package code;

public class ObjectEqualsDemo {
//Object���÷���4��boolean equals(Object obj) �жϵ�ǰ���úͲ��������Ƿ�ָ��ͬһ����
    public static void main(String[] args) {
        Plant p1 = new Plant();
        p1.setName("ǣţ��");

        Plant p2 = new Plant();
        p2.setName("ӭ����");

        System.out.println(p1.equals(p2)); // false ������ָ���ַ��һ��false

        Plant p3 = p1;
        System.out.println(p1.equals(p3));// true ������ָ���ַһ��true

        // �������룺equals�жϵ���������ĵ�ַ�Ƿ�ָ��ͬ�Զ���,����ַ��������û���κ�����,���ǿ��е�ֻ������
        Plant p4 = new Plant();
        p4.setName(p1.getName());
        System.out.println(p1.equals(p4));
        // ����,p1��������p4һ��,����ǣţ��,�ӹ�������������ָ����ͬһ������,�����ȴΪfalse;
        // equals�жϵ�����ʵ�����Ķ���,�����ж�����������,������Ҫ��дequals����;
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
