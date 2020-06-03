package com.techbek.steibsfloral.config.page;

import org.springframework.ui.Model;

public class ModelPageAttributes {
    private static  final String navCrumbDown = "navCrumbDown";
    private static  final String navCrumbTop = "navCrumbTop";
    private static  final String pageTitle = "pageTitle";
    private static  final String pageImage = "pageImage";
    private static  final String navItemId = "navItemId";

    public static void  addAttributes(Model model, IPageProperties pageProperties){
        model.addAttribute(navCrumbDown, pageProperties.getNavCrumbDown());
        model.addAttribute(navCrumbTop, pageProperties.getNavCrumbTop());
        model.addAttribute(pageTitle, pageProperties.getTitle());
        model.addAttribute(pageImage, pageProperties.getBackgroundImage());
        model.addAttribute(navItemId, pageProperties.getNavItemId());


    }
}
