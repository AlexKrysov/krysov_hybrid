package com.krysov.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class CheckPage {

    private SelenideElement
            SCALABLE = $(".nav__link.platform__link");

    public void checkScalable() {
        step("Проверка заголовка 'SCALABLE'", () -> {
            SCALABLE.hover();
        });
    }
}
