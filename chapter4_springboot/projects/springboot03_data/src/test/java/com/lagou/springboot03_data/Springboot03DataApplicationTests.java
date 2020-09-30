package com.lagou.springboot03_data;

import com.lagou.mapper.ArticleMapper;
import com.lagou.mapper.CommentMapper;
import com.lagou.pojo.Address;
import com.lagou.pojo.Article;
import com.lagou.pojo.Comment;
import com.lagou.pojo.Person;
import com.lagou.repository.CommentRepository;
import com.lagou.repository.PersonRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot03DataApplicationTests {

    @Autowired
    private CommentMapper commentMapper;

    @Test
    public void test() {
        Comment byId = commentMapper.findById(1);
        System.out.println(byId);

    }

    @Autowired
    private ArticleMapper articleMapper;

    @Test
    public void testArticle() {
        Article article = articleMapper.selectArticle(1);
        System.out.println(article);

    }

    //测试整合jpa

    @Autowired
    private CommentRepository commentRepository;

    @Test
    public void selectComment() {
        Optional<Comment> byId = commentRepository.findById(1);
        byId.ifPresent(System.out::println);

    }

    //测试整合redis
    @Autowired
    private PersonRepository personRepository;

    @Test
    public void savePerson() {
        Person person = new Person();
        person.setFirstName("张");
        person.setLastName("三");
        Address address = new Address();
        address.setCity("北京");
        address.setCountry("中国");
        person.setAddress(address);
        //redis添加数据
        personRepository.save(person);
    }

    @Test
    public void selectPerson() {
        List<Person> list = personRepository.findByAddress_City("北京");
        for (Person person : list) {
            System.out.println(person);
        }
    }
}
