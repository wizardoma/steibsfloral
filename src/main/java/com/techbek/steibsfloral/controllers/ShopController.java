package com.techbek.steibsfloral.controllers;

import com.techbek.steibsfloral.config.page.ModelPageAttributes;
import com.techbek.steibsfloral.config.page.ShopPageProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("shop")
public class ShopController {

    @Autowired
    ShopPageProperties pageProperties;

    @GetMapping("")
    public String getShopPage(Model model){
        ModelPageAttributes.addAttributes(model, pageProperties);

        return "shop/index";
    }
}
