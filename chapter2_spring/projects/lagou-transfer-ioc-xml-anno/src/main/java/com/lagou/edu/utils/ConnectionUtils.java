package com.lagou.edu.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * 需要保持该类为单例,才能保证threadLocal的有效性
 * Created with IntelliJ IDEA.
 * User: kevliu3
 * Date: 2020/9/6
 * Time: 9:34 AM
 *
 * @author kevliu3
 */
@Component("connectionUtils")
public class ConnectionUtils {

    @Autowired
    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * ThreadLocal 线程数据副本,维护当前线程下的数据,存储当前线程的链接
     */
    private ThreadLocal<Connection> threadLocal = new ThreadLocal<>();

    /**
     * 从当前线程获取连接
     */
    public Connection getCurrentThreadConn() throws SQLException {
        //判断当前线程中是否已经绑定连接,如果没有绑定,需要从连接池获取连接,绑定到当前线程
        Connection connection = threadLocal.get();
        if (connection == null) {
            //从链接池拿链接并绑定到线程
            connection = dataSource.getConnection();
            //绑定到当前线程
            threadLocal.set(connection);
        }
        return connection;
    }
}
