package com.techbek.steibsfloral.controllers;

import com.techbek.steibsfloral.config.page.ModelPageAttributes;
import com.techbek.steibsfloral.config.page.ServicePageProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("services")
public class ServiceController {

    @Autowired
    ServicePageProperties pageProperties;

    @GetMapping("")
    public String getServicePage(Model model){
       ModelPageAttributes.addAttributes(model, pageProperties);

        return "services/index";
    }
}
