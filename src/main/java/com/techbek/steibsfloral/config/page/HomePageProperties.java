package com.techbek.steibsfloral.config.page;

import org.springframework.stereotype.Component;

@Component
public class HomePageProperties implements IPageProperties{

    private final String navItemId= "menu-item-2350";
    private final String title = "Home";

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getNavCrumbTop() {
        return null;
    }

    @Override
    public String getNavCrumbDown() {
        return null;
    }

    @Override
    public String getBackgroundImage() {
        return null;
    }

    @Override
    public String getNavItemId() {
        return this.navItemId;
    }
}
