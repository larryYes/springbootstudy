package com.larry.springbootstudy;

import com.larry.springbootstudy.dao.UserDao;
import com.larry.springbootstudy.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author larry
 * @date 20/8/18 15:35
 * @description
 */

@SpringBootTest(classes = {SpringbootstudyApplication.class})
public class UserDaoTests {
    @Autowired
    private UserDao userDao;

    /**
     * 测试查询方法
     */
    @Test
    public void testFindAll(){
        List<User> all = userDao.findAll();

        for(User user: all){
            System.out.println(user);
        }


    }

}
