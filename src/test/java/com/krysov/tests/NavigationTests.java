package com.krysov.tests;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class NavigationTests extends TestBase{

    @DisplayName("Проверка наличия заголовка 'SCALABLE' в разделе 'partners'")
    @Owner("Krysov")
    @Tag("PositiveNavigationTest")
    @Test
    void checkScalableTest() {
        openPage.openHybridPage();
        navigationPage.hoverPlatform();
        navigationPage.clickPartners();
        checkPage.checkScalable();
    }
    @DisplayName("Проверка наличия заголовка 'SCALABLE' в разделе 'partners'")
    @Owner("Krysov")
    @Tag("PositiveNavigationTest")
    @Test
    void checkFeaturesTest() {
        openPage.openHybridPage();
        navigationPage.hoverPlatform();
        navigationPage.clickPartners();
        checkPage.checkFeatures();
    }
}
