# Проект по автоматизации сайта  [hybrid](https://hybrid.ai/)
&nbsp;
![hybrid](images/screens/company.png)
&nbsp;

## 🧰: Технологии и инструменты

<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/Idea.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="images/logo/GitHub.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="images/logo/Junit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>

</p>

## 🚀: Реализованные проверки

#### Примеры автоматизированных кейсов:

Тест 1

- ✓ _Переход на сайт hybrid_
- ✓ _Клик на 'Login'_
- ✓ _Вводим рандомную, невалидную почту_
- ✓ _Вводим рандомныйб невалидный пароль_
- ✓ _Клик на 'SignIn'_
- ✓ _Проверка информационного сообщения 'Incorrect e-mail or password'_

Тест 2

- ✓ _Переход на сайт hybrid_
- ✓ _Навести курсор на 'platform'_
- ✓ _Клик на 'partners'_
- ✓ _Проверка заголовка 'Features'_

## <img src="images/logo/Jenkins.svg" width="25" height="25"  alt="Jenkins"/></a> Jenkins <a target="_blank" href="https://jenkins.autotests.cloud/job/krysov_hybrid/"> job </a>
<p align="center">
<a href="https://jenkins.autotests.cloud/job/krysov_hybrid/"><img src="images/screens/jenkins.png" alt="Jenkins"/></a>
</p>


### 🧙: Параметры сборки в Jenkins:

:yum: Browser (браузер, по умолчанию chrome)

:zany_face: Version (версия браузера, по умолчанию 100.0)

:smirk: Browser_size (размер окна браузера, по умолчанию 1920x1080)

:relieved: URL (выбор url для теста)

:woozy_face: REMOTE_DRIVER_URL (адрес удалённого драйвера)


## 🏗️: Для запуска тестов из терминала необходимо заполнить junit-platform.properties или передать значение:

:one: URL - (выбор url)

:two: BROWSER - (выбор браузера)

:three: BROWSERSIZE - (выбор размера окна браузера)

:four: VERSION - (выбор версии браузера)

:five: REMOTE_DRIVER_URL - (выбор удалённого драйвера)

:seven: ALLURE_NOTIFICATIONS_VERSION - (выбор версии allure)

## <img src="images/logo/Allure.svg" width="25" height="25"  alt="Allure"/></a> Отчет в <a target="_blank" href="https://jenkins.autotests.cloud/job/krysov_hybrid/6/allure/#">Allure report</a>

## ⛅: Overview
<p align="center">
<img title="Allure Overview Dashboard" src="images/screens/over.png">
</p>

## 🧪: Suites
<p align="center">
<img title="Allure Overview Dashboard" src="images/screens/suites.png">
</p>

## 💹: Graphs
<p align="center">
<img title="Allure Overview Dashboard" src="images/screens/graphs.png">
</p>

## <img src="images/logo/Telegram.svg" width="25" height="25"  alt="Allure"/></a> Интеграция уведомлений с <a target="_blank" href="https://t.me/autotestsKrysov/67">Telegram</a>

<p align="center">
<img title="Allure Overview Dashboard" src="images/screens/tele.png" >
</p>

## <img src="images/logo/Allure_TO.svg" width="25" height="25"  alt="Allure"/></a> Интеграция с <a target="_blank" href="https://allure.autotests.cloud/project/2217/dashboards">Allure TestOps</a>
<img title="TestOps" src="images/screens/to.png" >


## <img src="images/logo/Jira.svg" width="25" height="25"  alt="Allure"/></a> Интеграция с <a target="_blank" href="https://jira.autotests.cloud/browse/HOMEWORK-687">Jira</a>
<img title="Jira" src="images/screens/jira.png" >






## <img src="images/logo/Selenoid.svg" width="25" height="25" alt="Allure"/></a> Запись видео из Selenoid при прохождении автотеста:
![Test](images/gif/gif.gif)