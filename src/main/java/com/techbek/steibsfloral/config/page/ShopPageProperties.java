package com.techbek.steibsfloral.config.page;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ShopPageProperties implements IPageProperties {


    private final String navItemID= "menu-item-41";

    @Value("${nav.shop.title}")
    private String title;

    @Value("${nav.shop.navCrumbTop}")
    private String navCrumbTop;

    @Value("${nav.shop.navCrumbDown}")
    private String navCrumbDown;

    @Value("${nav.shop.backgroundImage}")
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
