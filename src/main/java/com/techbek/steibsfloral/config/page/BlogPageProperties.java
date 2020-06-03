package com.techbek.steibsfloral.config.page;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BlogPageProperties implements IPageProperties {
    private final String navItemID= "menu-item-40";

    @Value("${nav.blog.title}")
    private String title;

    @Value("${nav.blog.navCrumbTop}")
    private String navCrumbTop;

    @Value("${nav.blog.navCrumbDown}")
    private String navCrumbDown;

    @Value("${nav.blog.backgroundImage}")
    private String backgroundImage;

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getNavCrumbTop() {
        return this.navCrumbTop;
    }

    @Override
    public String getNavCrumbDown() {
        return this.navCrumbDown;
    }

    @Override
    public String getBackgroundImage() {
        return this.backgroundImage;
    }

    @Override
    public String getNavItemId() {
        return this.navItemID;
    }
}
