package com.godfery.text;

public class Test {
    private Integer id;
    private String name;
    private Integer age;
    
    public Test() {

    }
    public Test(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public Test setId(Integer id) {
        this.id = id;
        return this;
    }
    public Test setName(String name) {
        this.name = name;
        return this;
    }
    public Test setSex(Integer age) {
        this.age = age;
        return this;
    }
    

    @Override
    public String toString() {
        return "Test [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
    public static void main(String[] args) {
        Test test=new Test()
                .setId(2021001)
                .setName("Godfery")
                .setSex(18);
        
        System.out.println(test);
    }
}
