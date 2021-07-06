package job;

import java.util.*;
import java.util.Map.Entry;

public class StudentTableReference {

    public static void main(String[] args) {
        Map<Integer, Students> school = new HashMap<Integer, Students>();
        for (int count = 0; count < 10; count++) {// 生成10位学生信息
            Students stu = new Students("Godfery" + count, Math.random() > 0.5 ? "man" : "woman",
                    ((int) (Math.random() * 1001)) / 10.0);
            school.put(stu.getsId(), stu);
        }

        // 定义变量记录女生的个数和分数
        Integer count = 0;
        Double sum = 0.0;

        // 遍历Map方式2,获取所有健值对entry对象对应的set,通过getKey和getValue方法获取键值
        Set<Map.Entry<Integer, Students>> entrys = school.entrySet();
        for (Entry<Integer, Students> entry : entrys) {
            if (entry.getValue().getsSex() == "woman") {
                count++;
                sum += entry.getValue().getsScore();
            }
        }
        System.out.println((int) (sum / count * 100) / 100.0);// 计算平均分并保留两位小数

        // 删除map中所有成绩小于30的学生
        // 定义一个集合记录要删除的键
        Set<Integer> deleteKeys = new HashSet<Integer>();
        // 遍历Map方式1,获取所有键对应的set,通过get方法由键获取值
        Set<Integer> keys = school.keySet();
        for (Integer key : keys) {
            if (school.get(key).getsScore() < 30) {
                deleteKeys.add(key);// 将分数小于30的学生的主键放入集合deleteKeys中
            }
        }

        // 把Map school中所有的deleteKeys删除
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
