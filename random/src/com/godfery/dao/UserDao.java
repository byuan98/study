package com.godfery.dao;

import static com.godfery.util.RandomOption.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.godfery.entity.User;
import com.godfery.util.JdbcUtil;

public class UserDao {

    public static void addUserText(User user){
        Connection con=null;
        PreparedStatement pre=null;
        ResultSet set=null;
        
        String sql="INSERT INTO user(sleep_uuid,name,sex,age,work,sleep_time,reason,sleep_time_begin,sleep_time_long,is_sleep,is_big,is_reson,way) VALUES(MD5(RAND()*24),?,?,?,?,?,?,?,?,?,?,?,?);";
         
        
        try{
            con=JdbcUtil.getConnection();
            pre=con.prepareStatement(sql);
            pre.setString(1, user.getName());
            pre.setString(2, user.getSex());
            pre.setString(3, user.getAge());
            pre.setString(4, user.getWork());
            pre.setString(5, user.getSleep_time());
            pre.setString(6, user.getReason());
            pre.setString(7, user.getSleep_time_begin());
            pre.setString(8, user.getSleep_time_long());
            pre.setString(9, user.getIs_sleep());
            pre.setString(10, user.getIs_big());
            pre.setString(11, user.getIs_reson());
            pre.setString(12, user.getWay());
            int row=pre.executeUpdate();

        }catch (SQLException e) {
            throw new RuntimeException(e);
        }finally{
            JdbcUtil.close(con, pre, null);
        }
    }
    public static void main(String[] args) {
        for(int number=0;number<100;number++) {
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

            addUserText(user);
        }
    }

}
