package com.techbek.steibsfloral.config.page;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class ServicePageProperties implements IPageProperties {

    private final String navItemID= "menu-item-2389";

    private final String title = "Services";

    private final String navCrumbTop = "High End Solutions";

    private final String navCrumbDown = "Our Services";

    private final String backgroundImage = "/wp-content/uploads/sites/3/2019/09/hero_services.jpg";

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
