package designpattern.proxy.staticproxy;

public class RentingHouseImpl implements IRentingHouse {
    @Override
    public void rentHouse() {
        System.out.println("我要租用一室一厅的房子");
    }
}