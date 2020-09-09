package com.lagou.edu.pojo;

/**
 * Created with IntelliJ IDEA.
 * User: kevliu3
 * Date: 2020/9/8
 * Time: 9:19 PM
 *
 * @author kevliu3
 */
public class Company {

    private String name;
    private String address;
    private int scale;

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", scale=" + scale +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getScale() {
        return scale;
    }

    public void setScale(int scale) {
        this.scale = scale;
    }
}
