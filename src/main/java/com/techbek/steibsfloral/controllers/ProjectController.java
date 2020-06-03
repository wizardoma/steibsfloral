package com.techbek.steibsfloral.controllers;

import com.techbek.steibsfloral.config.page.ModelPageAttributes;
import com.techbek.steibsfloral.config.page.ProjectPageProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("projects")
public class ProjectController {

    @Autowired
    ProjectPageProperties pageProperties;

    @GetMapping("")
    public String getProjectPage(Model model){
        ModelPageAttributes.addAttributes(model, pageProperties);
        return "projects/index";
    }

    @GetMapping("{projectName}")
    public String getSingleProjectPage(Model model, @PathVariable("projectName") String projectName){

        return "projects/single";
    }
}
