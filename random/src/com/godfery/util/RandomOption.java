package com.godfery.util;

public class RandomOption{
    public static void main(String[] args) {
        for(int number=0;number<10000;number++) {
            System.out.println(randomName());
            System.out.println(randomSex());
            
            String[] result=randomAgeAndWork();
            System.out.println(result[0]);
            System.out.println(result[1]);
            
            System.out.println(randomSleepTime());
            System.out.println(randomReason());
            System.out.println(randomSleepTimeBegin());
            System.out.println(randomSleepTimeLong());
            System.out.println(randomIsSleep());
            System.out.println(randomIsBig());
            System.out.println(randomIsReson());
            System.out.println(randomWay());
        }
    }
    public static String randomName() {
        String[] surname= {"赵","钱","孙","李"};//姓氏
        String[] name={"一","二","三","四"};//名字
        String randomName=surname[(int)(Math.random()*surname.length)];
        int count=(int)(Math.random()*2+1);
        for(int number=0;number<count;number++) {
            randomName+=name[(int)(Math.random()*name.length)];
        }
        return randomName;
    }

    public static String randomSex() {
        return (int)(Math.random()*2)==1?"男":"女";
    }

    public static String[] randomAgeAndWork() {           
        String[] age= {"10-20","20-30","30-40","40-50","50以上"};
        String[] work= null;
        String[] result=new String[2];
        result[0]=age[(int)(Math.random()*age.length)];
        if(result[0].equals("10-20")) {
            work=new String[] {"学生","其他"};
            result[1]=work[(int)(Math.random()*work.length)];
        }else if(result[0].equals("20-30")) {
            work=new String[] {"学生","教育者","管理岗位","普通职员","自由工作者","其他"};
            result[1]=work[(int)(Math.random()*work.length)];
        }else {
            work=new String[] {"教育者","管理岗位","普通职员","自由工作者","其他"};
            result[1]=work[(int)(Math.random()*work.length)];
        }
        return result;
    }

    public static String randomSleepTime() {
        String[] sleepTime= {"小于5小时","6小时","7小时","8小时","大于8小时"};
        return sleepTime[(int)(Math.random()*sleepTime.length)];
    }

    public static String randomReason() {       
        String[] reason= {"作息异常，熬夜","情绪不稳定","工作、学习压力大","疾病折磨","环境原因","饮食","心理健康因素"};
        return reason[(int)(Math.random()*reason.length)];
    }

    public static String randomSleepTimeBegin() {
        String[] sleepTimeBegin= {"九点","十一点前","凌晨","两点以后"};
        return sleepTimeBegin[(int)(Math.random()*sleepTimeBegin.length)];
    }

    public static String randomSleepTimeLong() {
        String[] sleepTimeLong= {"0-10分钟","10-30分钟","30-60分钟","1小时以上"};
        return sleepTimeLong[(int)(Math.random()*sleepTimeLong.length)];
    }

    public static String randomIsSleep() {
        String[] isSleep= {"容易","较容易","很难","不会再入睡"};
        return isSleep[(int)(Math.random()*isSleep.length)];
    }

    public static String randomIsBig() {
        String[] isBig= {"非常有压力","有压力","比较有压力","无压力"};
        return isBig[(int)(Math.random()*isBig.length)];
    }

    public static String randomIsReson() {
        String[] isReson= {"注意力不集中","容易疲劳","学习、工作效率低下","身体抵抗力下降","无影响"};
        return isReson[(int)(Math.random()*isReson.length)];
    }

    public static String randomWay() {
        String[] way= {"听歌","适量运动","药物治疗","泡脚","改善睡眠环境","其他"};
        return way[(int)(Math.random()*way.length)];
    }

}
