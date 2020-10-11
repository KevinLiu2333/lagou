package designpattern.proxy.staticproxy;

public class RentingHouseProxy implements IRentingHouse {

    private IRentingHouse rentingHouse;

    //传入实现类->被代理对象
    public RentingHouseProxy(IRentingHouse rentingHouse) {
        this.rentingHouse = rentingHouse;
    }

    @Override
    public void rentHouse() {
        //对原有业务增强功能
        System.out.println("中介（代理）收取服务费3000元");
        rentingHouse.rentHouse();
        System.out.println("客户信息卖了3毛钱");
    }
}