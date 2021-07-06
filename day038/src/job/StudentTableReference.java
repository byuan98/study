package job;

import java.util.*;
import java.util.Map.Entry;

public class StudentTableReference {

    public static void main(String[] args) {
        Map<Integer, Students> school = new HashMap<Integer, Students>();
        for (int count = 0; count < 10; count++) {// ����10λѧ����Ϣ
            Students stu = new Students("Godfery" + count, Math.random() > 0.5 ? "man" : "woman",
                    ((int) (Math.random() * 1001)) / 10.0);
            school.put(stu.getsId(), stu);
        }

        // ���������¼Ů���ĸ����ͷ���
        Integer count = 0;
        Double sum = 0.0;

        // ����Map��ʽ2,��ȡ���н�ֵ��entry�����Ӧ��set,ͨ��getKey��getValue������ȡ��ֵ
        Set<Map.Entry<Integer, Students>> entrys = school.entrySet();
        for (Entry<Integer, Students> entry : entrys) {
            if (entry.getValue().getsSex() == "woman") {
                count++;
                sum += entry.getValue().getsScore();
            }
        }
        System.out.println((int) (sum / count * 100) / 100.0);// ����ƽ���ֲ�������λС��

        // ɾ��map�����гɼ�С��30��ѧ��
        // ����һ�����ϼ�¼Ҫɾ���ļ�
        Set<Integer> deleteKeys = new HashSet<Integer>();
        // ����Map��ʽ1,��ȡ���м���Ӧ��set,ͨ��get�����ɼ���ȡֵ
        Set<Integer> keys = school.keySet();
        for (Integer key : keys) {
            if (school.get(key).getsScore() < 30) {
                deleteKeys.add(key);// ������С��30��ѧ�����������뼯��deleteKeys��
            }
        }

        // ��Map school�����е�deleteKeysɾ��
        for (Integer key : deleteKeys) {
            school.remove(key);
        }
        System.out.println(school.size());
    }
}

class Students {
    private static Integer sIdPool = 2021001;
    private final Integer sId;
    private String sName;
    private String sSex;
    private Double sScore;

    Students(String sName, String sSex, Double sScore) {
        sId = sIdPool;
        sIdPool++;
        this.sName = sName;
        this.sSex = sSex;
        this.sScore = sScore;
    }

    public Integer getsId() {
        return this.sId;
    }

    public String getsName() {
        return sName;
    }

    public String getsSex() {
        return sSex;
    }

    public Double getsScore() {
        return sScore;
    }

    public String toString() {
        return "sName:" + this.sName + ";sSex:" + this.sSex + ";sScore:" + this.sScore;
    }
}
