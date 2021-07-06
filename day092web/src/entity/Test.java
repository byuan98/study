package entity;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test implements Serializable{
    private List<String> strList;//测试单值数据列表
    private List<Teacher> teaList;//测试引用类型列表
    private Set<String> strSet;//测试单值集合
    private Map<String, Teacher> strTeaMap;//测试双列集合
    private Double[] doubleArray;//测试数组
    
    public Test() {

    }
    public Test(List<String> strList, List<Teacher> teaList, Set<String> strSet, Map<String, Teacher> strTeaMap, Double[] doubleArray) {
        this.strList = strList;
        this.teaList = teaList;
        this.strSet = strSet;
        this.strTeaMap = strTeaMap;
        this.doubleArray = doubleArray;
    }
    public List<String> getStrList() {
        return strList;
    }
    public void setStrList(List<String> strList) {
        this.strList = strList;
    }
    public List<Teacher> getTeaList() {
        return teaList;
    }
    public void setTeaList(List<Teacher> teaList) {
        this.teaList = teaList;
    }
    public Set<String> getStrSet() {
        return strSet;
    }
    public void setStrSet(Set<String> strSet) {
        this.strSet = strSet;
    }
    public Map<String, Teacher> getStrTeaMap() {
        return strTeaMap;
    }
    public void setStrTeaMap(Map<String, Teacher> strTeaMap) {
        this.strTeaMap = strTeaMap;
    }
    public Double[] getDoubleArray() {
        return doubleArray;
    }
    public void setDoubleArray(Double[] doubleArray) {
        this.doubleArray = doubleArray;
    }

    public String toString() {
        return "Test [strList=" + strList + ", teaList=" + teaList + ", strSet=" + strSet + ", strTeaMap=" + strTeaMap
                + ", doubleArray=" + Arrays.toString(doubleArray) + "]";
    }
}
