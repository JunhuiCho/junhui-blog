package com.junhui00.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by BonE on 2017. 2. 5..
 */
@Controller
@EnableAutoConfiguration
public class SampleController {

    @Autowired
    private HelloDao helloDao;

    @Autowired
    private PostDao postDao;

    @RequestMapping("/add")
    public @ResponseBody Hello add(Hello hello) {

        Hello helloData = helloDao.save(hello);

        return helloData;
    }

    @RequestMapping("/list")
    public @ResponseBody List<Hello> list(Model model) {

        List<Hello> helloList = helloDao.findAll();

        return helloList;
    }

    @RequestMapping("/")
    public String index() {
        return "helloworld!";
    }
    @ResponseBody
    String home() {
        return "Hello Wffffffforld!";
    }

    @RequestMapping("/hello")
    public String index(Model model) {
        model.addAttribute("name", "123");
        return "hello";
    }

    @RequestMapping("/write")
    public String write(Model model) {
//        model.addAttribute("name", "123");
        return "write";
    }

    @RequestMapping("/writePost")
    public @ResponseBody Post writePost(Post post){

        Post postData = postDao.save(post);

        return postData;
    }

    @RequestMapping("/posts")
    public String posts(Model model){
        List<Post> postList = postDao.findAll();
        model.addAttribute("postList", postList);

        return "posts";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}
