package com.godfery.test;

public class TestTwo {
    private Integer testTwoId=2021001;
    private String testTwoName="Godfery";
    
    class TestTwoInner{ //成员内部类
        private Integer testTwoIdInner=testTwoId;
        private String testTwoName="Echo";
        
        public String toString() {
            return this.testTwoIdInner+"::"+this.testTwoName;
        }
    }

    public Integer getTestTwoId() {
        return testTwoId;
    }

    public TestTwo setTestTwoId(Integer testTwoId) {
        this.testTwoId = testTwoId;
        return this;
    }

    public String getTestTwoName() {
        return testTwoName;
    }

    public TestTwo setTestTwoName(String testTwoName) {
        this.testTwoName = testTwoName;
        return this;
    }
    
    
    @Override
    public String toString() {
        return "TestTwo [testTwoId=" + testTwoId + ", testTwoName=" + testTwoName + "]";
    }

    public static void main(String[] args) {
        TestTwoInner testTwoInner=new TestTwo().new TestTwoInner();
        System.out.println(testTwoInner);
        
        TestTwo testTwo=new TestTwo();
        System.out.println(testTwo);
        
    }
    
}
