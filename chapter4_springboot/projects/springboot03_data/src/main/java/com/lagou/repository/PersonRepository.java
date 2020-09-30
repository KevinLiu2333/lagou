package com.lagou.repository;

import com.lagou.pojo.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * <实体类,id>泛型继承
 * <p>
 * Created with IntelliJ IDEA.
 * User: kevliu3
 * Date: 2020/9/28
 * Time: 7:30 AM
 *
 * @author kevliu3
 */
public interface PersonRepository extends CrudRepository<Person, String> {
    /**
     * 根据城市查询对应信息和人
     *
     * @param name 人名
     * @return person
     */
    List<Person> findByAddress_City(String name);
}
