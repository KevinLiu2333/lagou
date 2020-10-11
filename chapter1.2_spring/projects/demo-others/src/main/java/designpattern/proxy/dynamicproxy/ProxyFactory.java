package designpattern.proxy.dynamicproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

import java.lang.reflect.Proxy;

/**
 * 横切逻辑增强
 *
 * @author 应癫
 * <p>
 * <p>
 * 代理对象工厂：生成代理对象的
 */

public class ProxyFactory {

    private ProxyFactory() {

    }

    private static ProxyFactory proxyFactory = new ProxyFactory();

    public static ProxyFactory getInstance() {
        return proxyFactory;
    }

    ;

    /**
     * JDK动态代理
     *
     * @param obj 委托对象
     * @return 代理对象
     */
    public Object getJdkProxy(Object obj) {
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), (proxy1, method, args1) -> {
            Object result = null;
            //写增强逻辑
            System.out.println("中介（代理）收取服务费3000元");
            //调用原有业务逻辑
            result = method.invoke(obj, args1);
            System.out.println("客户信息卖了3毛钱");
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
            System.out.println("中介（代理）收取服务费3000元");
            //调用原有业务逻辑
            result = method.invoke(obj, objects);
            System.out.println("客户信息卖了3毛钱");
            return result;
        });


    }

}
