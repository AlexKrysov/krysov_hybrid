package com.krysov.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class NavigationTests extends TestBase{

    @Test
    void test1() {
        openPage.openHybridPage();
        navigationPage.hoverPlatform();
        navigationPage.clickPartners();
        checkPage.checkScalable();
    }
}
