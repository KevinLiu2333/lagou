package com.lagou.dao;

import com.lagou.pojo.User;

import java.io.IOException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: kevliu3
 * Date: 2020/8/27
 * Time: 2:03 PM
 *
 * @author kevliu3
 */
public interface IUserDao {
    List<User> findAll() throws IOException;

    //多条件组合查询:演示if
    List<User> findByCondition(User user);

    List<User> findByIds(int[] ids);
}
