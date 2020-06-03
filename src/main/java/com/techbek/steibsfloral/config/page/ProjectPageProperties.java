package com.techbek.steibsfloral.config.page;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProjectPageProperties implements IPageProperties {

    private final String navItemID= "menu-item-59";

    @Value("${nav.projects.title}")
    private String title;

    @Value("${nav.projects.navCrumbTop}")
    private String navCrumbTop;

    @Value("${nav.projects.navCrumbDown}")
    private String navCrumbDown;

    @Value("${nav.projects.backgroundImage}")
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
