package com.techbek.steibsfloral.config.page;

public interface IPageProperties {
    default String getTitle(){
        return "Page";
    }
    String getNavCrumbTop();
    String getNavCrumbDown();
    String getBackgroundImage();
    String getNavItemId();
}
