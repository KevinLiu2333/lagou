package com.lagou.edu.service;

import com.lagou.edu.pojo.Resume;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: liuku
 * Date: 2020/9/22
 * Time: 22:02
 *
 * @author liuku
 */
public interface ResumeService {

     List<Resume> findAll();

     Resume findById(Long id);

     void save(Resume resume);

     void delete(Long id);
}
