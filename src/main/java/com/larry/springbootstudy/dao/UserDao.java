package com.larry.springbootstudy.dao;

import com.larry.springbootstudy.entity.User;

import java.util.List;

/**
 * @author larry
 * @date 20/8/18 15:25
 * @description
 */
public interface UserDao {

    /**
     * 查找所有User方法
     * @return
     */
    List<User> findAll();
}
