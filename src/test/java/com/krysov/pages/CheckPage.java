package com.krysov.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class CheckPage {

    private SelenideElement
            SCALABLE = $(".nav__link.platform__link"),
            features = $(".block.video");

    public void checkScalable() {
        step("Проверка заголовка 'SCALABLE'", () -> {
            SCALABLE.shouldHave(text("Scalable"));
        });
    }
    public void checkFeatures() {
        step("Проверка заголовка 'Features'", () -> {
            SCALABLE.shouldHave(text("Other features"));
        });
    }
}
