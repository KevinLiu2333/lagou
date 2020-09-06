package designpattern.proxy.dynamicproxy;

/**
 * @author 应癫
 */
public class CglibProxy {

    public static void main(String[] args) {
        IRentingHouse rentingHouse = new RentingHouseImpl();
        //获取rentingHouse对象的动态代理对象
        //Enhancer类似于JDK动态代理中的Proxy
        //通过实现接口MethodInterceptor能够对各个方法进行拦截增强,类似于JDK动态代理的Invocation Handler
        IRentingHouse rentingHouseProxy = (IRentingHouse) ProxyFactory.getInstance().getCglibProxy(rentingHouse);

        rentingHouseProxy.rentHosue();
    }

}
