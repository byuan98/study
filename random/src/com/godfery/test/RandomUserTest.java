package com.godfery.test;

import static com.godfery.util.RandomOption.*;

import com.godfery.entity.User;

public class RandomUserTest {
    public static void main(String[] args) {
        String[] ageAndWork=randomAgeAndWork();
        User user=new User().setName(randomName())
                            .setSex(randomSex())
                            .setAge(ageAndWork[0])
                            .setWork(ageAndWork[1])
                            .setSleep_time(randomSleepTime())
                            .setReason(randomReason())
                            .setSleep_time_begin(randomSleepTimeBegin())
                            .setSleep_time_long(randomSleepTimeLong())
                            .setIs_sleep(randomIsSleep())
                            .setIs_big(randomIsBig())
                            .setIs_reson(randomIsReson())
                            .setWay(randomWay());
        System.out.println(user);
    }
}
