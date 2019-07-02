package com.hkd.test;

import com.hkd.mapper.UsersMapper;
import com.hkd.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Author: 张世罡
 * @Date： 2019/7/1
 * @Description: com.hkd.test
 * @version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ManagerTest {

    @Autowired
    private UsersMapper usersMapper;

    @Test
    public void insertUserTest(){
        Users users=new Users();
        users.setUserage(20);
        users.setUsername("admin");
        this.usersMapper.insertUsers(users);
    }

    @Test
    public void selectUserTest(){
        List<Users> users = this.usersMapper.selectUsers();
        for(Users u:users){
            System.out.println("usernaem:"+u.getUsername());
        }

    }
}
