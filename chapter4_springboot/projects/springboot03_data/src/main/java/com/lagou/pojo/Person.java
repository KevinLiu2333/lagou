package com.lagou.pojo;

import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import javax.persistence.Id;

/**
 * Created with IntelliJ IDEA.
 * User: kevliu3
 * Date: 2020/9/28
 * Time: 7:24 AM
 *
 * @author kevliu3
 */

@RedisHash(value = "persons")//指定实体类对象在redis中的存储空间
public class Person {
    @Id //标识实体类主键 字符串形式的hashkey标识唯一的实体类对象id
    private String id;
    @Indexed //标识对应属性在redis中生成二级索引
    private String firstName;
    @Indexed
    private String lastName;
    private Address address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                '}';
    }
}
