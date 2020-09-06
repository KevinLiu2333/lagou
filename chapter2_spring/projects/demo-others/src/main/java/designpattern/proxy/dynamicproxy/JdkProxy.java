package designpattern.proxy.dynamicproxy;

/**
 * 动态代理在底层生成代理类
 * JDK自带的代理类
 *
 * @author 应癫
 */
public class JdkProxy {


    public static void main(String[] args) {
        //委托对象,委托方
        IRentingHouse rentingHouse = new RentingHouseImpl();
        //从工厂获取代理对象
        IRentingHouse jdkProxy = (IRentingHouse) ProxyFactory.getInstance().getJdkProxy(rentingHouse);
        jdkProxy.rentHosue();
    }


}
