package com.lagou.edu.controller;

import com.lagou.edu.pojo.Resume;
import com.lagou.edu.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: liuku
 * Date: 2020/9/22
 * Time: 22:01
 *
 * @author liuku
 */
@Controller
public class ResumeController {

    @Autowired
    private ResumeService resumeService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Map<String, Object> map) {
        List<Resume> list = resumeService.findAll();
        map.put("list", list);
        return "list";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable Long id) {
        resumeService.delete(id);
        return "success";
    }


    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String toEdit() {
        return "edit";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String toEdit(@PathVariable Long id, Map<String, Object> map) {
        if (id != null) {
            Resume resume = resumeService.findById(id);
            map.put("resume", resume);
        }
        return "edit";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    @ResponseBody
    public String doEdit(Resume resume) {
        resumeService.save(resume);
        return "success";
    }
}
