package com.techbek.steibsfloral.config.page;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Setter
@Component
public class AboutPageProperties implements IPageProperties {

    private String navItemID= "menu-item-43";

    @Value("${nav.about.title}")
    private String title;

    @Value("${nav.about.navCrumbTop}")
    private String navCrumbTop;

    @Value("${nav.about.navCrumbDown}")
    private String navCrumbDown;

    @Value("${nav.about.backgroundImage}")
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
