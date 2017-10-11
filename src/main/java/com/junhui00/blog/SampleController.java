package com.junhui00.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by BonE on 2017. 2. 5..
 */
@Controller
@EnableAutoConfiguration
public class SampleController {

    @Autowired
    private PostDao postDao;

    @RequestMapping("/")
    public String root(Model model) {
        return posts(model);
    }

    @RequestMapping("/index")
    public String posts(Model model){
        List<Post> postList = postDao.findAll();
        model.addAttribute("postList", postList);

        return "index";
    }

    @RequestMapping("/write")
    public String write(Model model) {
        return "redirect:/post/write";
    }

    @RequestMapping("/about")
    public String about(Model model){
        return "about";
    }

    @RequestMapping("/contact")
    public String contact(Model model){
        return "contact";
    }

    @RequestMapping("/ping")
    public String ping(){
        return "ping";
    }

}
