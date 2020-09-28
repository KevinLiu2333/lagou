package com.lagou.pojo;

import org.springframework.data.redis.core.index.Indexed;

/**
 * Created with IntelliJ IDEA.
 * User: kevliu3
 * Date: 2020/9/28
 * Time: 7:25 AM
 *
 * @author kevliu3
 */
public class Address {

    @Indexed
    private String city;

    private String country;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
