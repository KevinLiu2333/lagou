package com.lagou.edu.factory;

import com.lagou.edu.utils.TransactionManager;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Proxy;

/**
 * 横切逻辑增强
 *
 * @author 应癫
 * <p>
 * <p>
 * 代理对象工厂：生成代理对象的
 */
@Component("proxyFactory")
public class ProxyFactory {

    @Autowired
    private TransactionManager transactionManager;

    /**
     * JDK动态代理
     *
     * @param obj 委托对象
     * @return 代理对象
     */
    public Object getJdkProxy(Object obj) {
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), (proxy1, method, args1) -> {
            Object result = null;
            try {
                //开启事务(关闭事务的自动提交)
                transactionManager.beginTransaction();
                result = method.invoke(obj, args1);
                //提交事务
                transactionManager.commit();
            } catch (Exception e) {
                e.printStackTrace();
                //回滚事务
                transactionManager.rollback();
                //抛出异常,便于上层servlet捕获
                throw e;
            }
            return result;
        });


    }

    /**
     * cglib生成代理对象
     *
     * @param obj 委托对象
     * @return 代理对象
     */
    public Object getCglibProxy(Object obj) {
        return Enhancer.create(obj.getClass(), (MethodInterceptor) (o, method, objects, methodProxy) -> {
            Object result = null;
            try {
                //开启事务(关闭事务的自动提交)
                transactionManager.beginTransaction();
                result = method.invoke(obj, objects);
                //提交事务
                transactionManager.commit();
            } catch (Exception e) {
                e.printStackTrace();
                //回滚事务
                transactionManager.rollback();
                //抛出异常,便于上层servlet捕获
                throw e;
            }
            return result;
        });


    }

}
