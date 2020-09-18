package com.lagou.edu.mvcframework.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: kevliu3
 * Date: 2020/9/18
 * Time: 11:44 AM
 *
 * @author kevliu3
 */
public class LagouDispatcherServlet extends HttpServlet {

    private static final long serialVersionUID = 8615285319613458729L;

    @Override
    public void init(ServletConfig config) throws ServletException {
        //1.加载配置文件 springmvc.properties
        doLoadConfig(config.getInitParameter("contextConfigLocation"));

        //2.扫描相关的类,扫描注解
        doScan("");

        //3.初始化bean对象(实现IOC容器,基于注解)
        doInstance();

        //4.实现依赖注入
        doAutoWired();

        //5.构造一个HandlerMapping(处理器映射器),将配置好的url和method建立映射关系
        initHandlerMapping();
        System.out.println("lagou mvc 初始化完成....");
        //等待请求进入,处理请求    }
    }

    private void initHandlerMapping() {

    }

    private void doAutoWired() {

    }

    private void doInstance() {

    }

    /**
     * 扫描类
     *
     * @param scanPackage package
     */
    private void doScan(String scanPackage) {

    }

    /**
     * 加载配置文件
     */
    private void doLoadConfig(String contextConfigLocation) {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
