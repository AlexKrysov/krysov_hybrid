package com.krysov.tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

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
    @DisplayName("Проверка наличия заголовка 'Features' в разделе 'partners'")
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
