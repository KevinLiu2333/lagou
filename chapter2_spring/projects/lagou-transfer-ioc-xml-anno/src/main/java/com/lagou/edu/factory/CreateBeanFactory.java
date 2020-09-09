package com.lagou.edu.factory;

import com.lagou.edu.utils.ConnectionUtils;

/**
 * Created with IntelliJ IDEA.
 * User: kevliu3
 * Date: 2020/9/6
 * Time: 5:39 PM
 *
 * @author kevliu3
 */
public class CreateBeanFactory {

    public static ConnectionUtils getInstanceStatic() {
        return new ConnectionUtils();
    }

    public ConnectionUtils getInstance() {
        return new ConnectionUtils();
    }
}
