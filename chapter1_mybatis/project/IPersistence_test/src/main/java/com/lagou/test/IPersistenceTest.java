package com.lagou.test;

import com.lagou.dao.IUserDao;
import com.lagou.io.Resources;
import com.lagou.pojo.User;
import com.lagou.sqlSession.SqlSession;
import com.lagou.sqlSession.SqlSessionFactoryBuider;
import com.lagou.sqlSession.SqlSessoionFactory;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: kevliu3
 * Date: 2020/8/23
 * Time: 2:57 PM
 *
 * @author kevliu3
 */
public class IPersistenceTest {


    @Test
    public void test() throws Exception {
        InputStream resourcesAsStream = Resources.getResourcesAsStream("sqlMapConfig.xml");
        SqlSessoionFactory sqlSessoionFactory = new SqlSessionFactoryBuider().build(resourcesAsStream);
        SqlSession sqlSession = sqlSessoionFactory.openSession();
        //获取代理对象
        IUserDao userDao = sqlSession.getMapper(IUserDao.class);
        User user = new User();
        user.setId(3);
        user.setUsername("刘坤");
        //代理对象调用接口中的任意方法,都会执行invoke方法
//        userDao.findAll();
//        User user2 = userDao.findByCondition(user);
        List<User> all = userDao.findAll();
        for (User user1 : all) {
            System.out.println(user1);
        }
//        //调用
//        User user = new User();
//        user.setId(3);
//        user.setUsername("刘坤");
//        User user2 = sqlSession.selectOne("com.lagou.dao.IUserDao.selectOne", user);
//        System.out.println(user2);
//
//        List<User> users = sqlSession.selectList("user.selectList");
//        for (User user1 : users) {
//            System.out.println(user1);
//        }

    }


}
