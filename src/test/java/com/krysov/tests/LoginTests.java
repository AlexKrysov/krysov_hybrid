package com.krysov.tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class LoginTests extends TestBase {

    @DisplayName("Проверка информационного сообщения 'Incorrect e-mail or password' при вводе невалидной почты и пароля")
    @Owner("Krysov")
    @Tag("NegativeLoginTest")
    @Test
    void NegativeLoginTest1() {
        openPage.openHybridPage();
        navigationPage.clickIconLogin();
        randomData.inputRandomEmail();
        randomData.inputRandomPassword();
        navigationPage.clickSignIn();
        checkPage.checkIncorrectEmailOrPassword();
    }

    @DisplayName("Проверка информационного сообщения 'Incorrect e-mail or password' при вводе невалидной почты и оставлении поля 'password' пустым")
    @Owner("Krysov")
    @Tag("NegativeLoginTest")
    @Test
    void NegativeLoginTest2() {
        openPage.openHybridPage();
        navigationPage.clickIconLogin();
        randomData.inputRandomEmail();
        navigationPage.clickSignIn();
        checkPage.checkIncorrectEmailOrPassword();
    }

    @DisplayName("Проверка информационного сообщения 'Incorrect e-mail or password' при вводе невалидного пароля и оставлении поля 'email' пустым")
    @Owner("Krysov")
    @Tag("NegativeLoginTest")
    @Test
    void NegativeLoginTest3() {
        openPage.openHybridPage();
        navigationPage.clickIconLogin();
        randomData.inputRandomPassword();
        navigationPage.clickSignIn();
        checkPage.checkIncorrectEmailOrPassword();
    }
}
