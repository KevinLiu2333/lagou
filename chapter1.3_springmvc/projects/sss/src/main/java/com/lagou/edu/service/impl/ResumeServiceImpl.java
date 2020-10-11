package com.lagou.edu.service.impl;

import com.lagou.edu.dao.ResumeDao;
import com.lagou.edu.pojo.Resume;
import com.lagou.edu.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created with IntelliJ IDEA.
 * User: liuku
 * Date: 2020/9/22
 * Time: 23:08
 *
 * @author liuku
 */
@Service
public class ResumeServiceImpl implements ResumeService {

    @Autowired
    private ResumeDao resumeDao;

    @Override
    public List<Resume> findAll() {
        return resumeDao.findAll();
    }

    @Override
    public Resume findById(Long id) {
        Optional<Resume> resume = resumeDao.findById(id);
        return resume.orElse(null);
    }

    @Override
    public void save(Resume resume) {
        resumeDao.save(resume);
    }

    @Override
    public void delete(Long id) {
        resumeDao.deleteById(id);

    }
}
