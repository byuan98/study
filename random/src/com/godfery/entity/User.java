package com.godfery.entity;

import java.io.Serializable;

public class User implements Serializable{
    private String name;//姓名
    private String sex;//性别
    private String age;//年龄
    private String work;//工作
    private String sleep_time;//睡眠时间
    private String reason;//睡眠影响因素
    private String sleep_time_begin;//几点开始睡觉
    private String sleep_time_long;//多久入睡
    private String is_sleep;//醒了以后能否再睡
    private String is_big;//压力是否感觉大
    private String is_reson;//睡眠不好对你造成的影响
    private String way;//睡不着采取的措施
    
    public User() {
        
    }

    public User(String name, String sex, String age, String work, String sleep_time, String reason, String sleep_time_begin, String sleep_time_long, String is_sleep, String is_big, String is_reson, String way) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.work = work;
        this.sleep_time = sleep_time;
        this.reason = reason;
        this.sleep_time_begin = sleep_time_begin;
        this.sleep_time_long = sleep_time_long;
        this.is_sleep = is_sleep;
        this.is_big = is_big;
        this.is_reson = is_reson;
        this.way = way;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getSex() {
        return sex;
    }

    public User setSex(String sex) {
        this.sex = sex;
        return this;
    }

    public String getAge() {
        return age;
    }

    public User setAge(String age) {
        this.age = age;
        return this;
    }

    public String getWork() {
        return work;
    }

    public User setWork(String work) {
        this.work = work;
        return this;
    }

    public String getSleep_time() {
        return sleep_time;
    }

    public User setSleep_time(String sleep_time) {
        this.sleep_time = sleep_time;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public User setReason(String reason) {
        this.reason = reason;
        return this;
    }

    public String getSleep_time_begin() {
        return sleep_time_begin;
    }

    public User setSleep_time_begin(String sleep_time_begin) {
        this.sleep_time_begin = sleep_time_begin;
        return this;
    }

    public String getSleep_time_long() {
        return sleep_time_long;
    }

    public User setSleep_time_long(String sleep_time_long) {
        this.sleep_time_long = sleep_time_long;
        return this;
    }

    public String getIs_sleep() {
        return is_sleep;
    }

    public User setIs_sleep(String is_sleep) {
        this.is_sleep = is_sleep;
        return this;
    }

    public String getIs_big() {
        return is_big;
    }

    public User setIs_big(String is_big) {
        this.is_big = is_big;
        return this;
    }

    public String getIs_reson() {
        return is_reson;
    }

    public User setIs_reson(String is_reson) {
        this.is_reson = is_reson;
        return this;
    }

    public String getWay() {
        return way;
    }

    public User setWay(String way) {
        this.way = way;
        return this;
    }

    public String toString() {
        return "User [name=" + name + ", sex=" + sex + ", age=" + age + ", work=" + work + ", sleep_time=" + sleep_time
                + ", reason=" + reason + ", sleep_time_begin=" + sleep_time_begin + ", sleep_time_long="
                + sleep_time_long + ", is_sleep=" + is_sleep + ", is_big=" + is_big + ", is_reson=" + is_reson
                + ", way=" + way + "]";
    }  
}
