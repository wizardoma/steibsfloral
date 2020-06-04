package com.techbek.steibsfloral.controllers;

import com.techbek.steibsfloral.config.page.BlogPageProperties;
import com.techbek.steibsfloral.config.page.ModelPageAttributes;
import com.techbek.steibsfloral.domain.blog.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("blog")
@RequiredArgsConstructor
public class BlogController {
    final BlogPageProperties pageProperties;
    final BlogRepository blogRepository;


    @GetMapping("")
    public String getBlogPage(Model model){
        ModelPageAttributes.addAttributes(model, pageProperties);

        return "blog/index";
    }

    @GetMapping("{blogId}")
    public String getSingleBlogPage(Model model, @PathVariable("blogId") String blogId){

        return "blog/single";
    }

    @PostMapping("")
    public void postBlog(){

    }

}
