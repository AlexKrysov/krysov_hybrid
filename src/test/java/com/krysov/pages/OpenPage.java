package com.krysov.pages;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class OpenPage {

    private final String CompanyUrl = "https://hybrid.ai/";

    public void openHybridPage() {
        step("Открыть страницу", () ->
                open(CompanyUrl));
    }
}
