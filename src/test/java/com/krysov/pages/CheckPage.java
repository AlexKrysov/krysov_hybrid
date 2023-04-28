package com.krysov.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class CheckPage {

    private SelenideElement
            SCALABLE = $(".blk"),
            password = $("#password-warning"),
            features = $(".block.video");

    public void checkScalable() {
        step("Проверка заголовка 'SCALABLE'", () -> {
            SCALABLE.shouldHave(text("Scalable"));
        });
    }

    public void checkFeatures() {
        step("Проверка заголовка 'Features'", () -> {
            features.shouldHave(text("Other features"));
        });
    }

    public void checkIncorrectEmailOrPassword() {
        step("Проверка информационного сообщения 'Incorrect e-mail or password'", () -> {
            password.shouldHave(text("Incorrect e-mail or password"));
        });
    }
}
