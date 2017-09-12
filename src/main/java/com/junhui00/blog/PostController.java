package com.junhui00.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.Date;

@Controller
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostDao postDao;

    @RequestMapping("/write")
    public String write(Model model) {
        return "write";
    }

    @RequestMapping("/writePost")
    public @ResponseBody Post writePost(@Valid Post post){
        post.setReg_date(new Date());
        Post postData = postDao.save(post);
        return postData;
    }

    @RequestMapping("/{id}")
    public String view(Model model, @PathVariable int id){
        Post post = postDao.findOne(id);
        model.addAttribute("post",post);
        return "post";
    }

}

