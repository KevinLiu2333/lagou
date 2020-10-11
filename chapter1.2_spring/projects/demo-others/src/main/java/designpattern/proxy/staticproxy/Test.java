package designpattern.proxy.staticproxy;


public class Test {

    public static void main(String[] args) {
        IRentingHouse rentingHouse = new RentingHouseImpl();
        // 自己要租用一个一室一厅的房子
        // rentingHouse.rentHosue();


        //静态代理--对应实际存在的java类
        RentingHouseProxy rentingHouseProxy = new RentingHouseProxy(rentingHouse);
        rentingHouseProxy.rentHouse();
    }
}
