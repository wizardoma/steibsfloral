package com.techbek.steibsfloral.controllers;

import com.techbek.steibsfloral.config.page.HomePageProperties;
import com.techbek.steibsfloral.config.page.ModelPageAttributes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    HomePageProperties pageProperties;

    @GetMapping("/")
    public String getHomePage(Model model){
        ModelPageAttributes.addAttributes(model, pageProperties);
        return "index";
    }

}
