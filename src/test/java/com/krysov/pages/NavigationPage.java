package com.krysov.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class NavigationPage {

    private SelenideElement
            platform = $(".nav__link.platform__link"),
            partners = $(".subitem__subtitle.platform__content-name",3);


    public void hoverPlatform() {
        step("Навести курсор на 'platform'", () -> {
            platform.hover();
        });
    }
    public void clickPartners() {
        step("клик на 'partners'", () -> {
            partners.click();
        });
    }

}
