package com.krysov.randomData;

import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class RandomData {

    public static Faker faker = new Faker();

    private SelenideElement
            email = $("#email"),
            password = $("#password");


    private String randomEmail = faker.internet().emailAddress();
    private String randomPassword = faker.internet().password();

    public void inputRandomPassword() {
        step("Вводим рандомный пароль", () -> {
            password.setValue(randomPassword);
        });
    }

    public void inputRandomEmail() {
        step("Вводим рандомный адрес электронной почты", () -> {
            email.setValue(randomEmail);
        });
    }
}
