<h1 >Проект по автоматизации API тестирования сервиса <a href="https://reqres.in/ ">Reqres.in</a></h1>

<p align="center">  
<img src="images/logo/ReqresIn.png" alt="MainLogo" width="950"/></a>  
</p>

# 📝 Содержание:

- [Технологии и инструменты](#технологии-и-инструменты)
- [Реализованные проверки](#Реализованные-проверки)
- [Запуск тестов (Сборка в Jenkins и параметры)](#запуск-тестов-сборка-в-jenkins)
- [Запуск тестов (Из терминала)](#запуск-тестов-из-терминала)
- [Интеграция с Allure Report](#allure-report)
- [Интеграция с Allure TestOps](#интеграция-с-allure-testops)
- [Уведомление в Telegram о результатах выполнения автоматизированных тестов](#уведомление-в-telegram-о-результатах-выполнения-автоматизированных-тестов)

<a id="технологии-и-инструменты"></a>

## ☕ Стек:

| Java                                                                                                     | IntelliJ  <br>  Idea                                                                                               | GitHub                                                                                                     | JUnit 5                                                                                                           | Gradle                                                                                                     | RestAssured                                                                                                               | Allure <br> Report                                                                                                         | Jenkins                                                                                                          | Telegram                                                                                                            |                                                                                                 AllureTestOps |
|:---------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------:|
| <a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a> | <a href="https://www.jetbrains.com/idea/"><img src="images/logo/Idea.svg" width="50" height="50"  alt="IDEA"/></a> | <a href="https://github.com/"><img src="images/logo/GitHub.svg" width="50" height="50"  alt="Github"/></a> | <a href="https://junit.org/junit5/"><img src="images/logo/Junit5.svg" width="50" height="50"  alt="JUnit 5"/></a> | <a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a> | <a href="https://rest-assured.io/"><img src="images/logo/RestAssured.png" width="50" height="50"  alt="RestAssured"/></a> | <a href="https://github.com/allure-framework"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a> | <a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a> | <a href="https://web.telegram.org/"><img src="images/logo/Telegram.svg" width="50" height="50" alt="Telegram"/></a> | <a href="https://qameta.io/"><img src="images/logo/AllureTO.png" width="50" height="50" alt="Allure_TO"/></a> |

В данном проекте автотесты написаны на **Java**. Для сборки проекта в
среде IntelliJ IDEA используется **Gradle**. **JUnit 5** задействован в качестве фреймворка модульного тестирования, а
**RestAssured** используется для тестирования API.
Запуск тестов выполняется из **Jenkins**, и вся работа по управлению проектом и отслеживанию задач выполняется с
использованием **Jira**. **Allure Report**, **AllureTestOps** и **Telegram Bot** используются для визуализации
результатов тестирования.

<a id="Реализованные-проверки"></a>

##  📠 Реализованные проверки:

### На авторизацию 

### На регистрацию

### Создание сотрудника

### Обновление сотрудника:

### Удаление сотрудника

### Список ресурсов

### Список пользователей

<a id="запуск-тестов-сборка-в-jenkins"></a>

## <img alt="Jenkins" height="25" src="images/logo/Jenkins.svg" width="25"/> Сборка в [Jenkins](https://jenkins.autotests.cloud/job/021.api_diplom/)

<p align="center">  
<img src="images/screen/JenkinsMain.png" alt="Jenkins" width="950"/></a>  
</p>

## 🔧 Параметры сборки в Jenkins:

- _TASK (Задачи, по умолчанию Smoke_test)_

<a id="запуск-тестов-из-терминала"></a>

## ⚡  Команда для запуска автотестов из терминала

```bash  
gradle clean test 
```

<a id="allure-report"></a>

## <img alt="Allure" height="25" src="images/logo/Allure.svg" width="25"/> </a>Интеграция с <a target="_blank" href="https://jenkins.autotests.cloud/job/021.api_diplom/1/allure/">Allure Report</a>

## 📊 Основная страница отчёта

<p align="center">  
<img title="Allure Overview Dashboard" src="images/screen/AllureDashboard.png" width="850">  
</p>  

## 🏈 Тест-кейсы

<p align="center">  
<img title="Allure Tests" src="images/screen/AllureCases.png" width="850">   
</p>

##  📈 Графики

<p align="center">   
<img title="Allure Graphics1" src="images/screen/AllureGraph1.png" width="850">  
<img title="Allure Graphics2" src="images/screen/AllureGraph2.png" width="850">  
</p>

<a id="интеграция-с-allure-testops"></a>

## <img alt="Allure_TO" height="25" src="images/logo/AllureTO.png" width="25"/> </a>Интеграция с <a target="_blank" href="https://allure.autotests.cloud/project/3809/dashboards">Allure TestOps</a>

## 📊 Основная страница отчёта

<p align="center">  
<img title="Allure TestOps Dashboard" src="images/screen/AllureTODash.png" width="850">  
</p>  

## 📭 Автоматизированные тест-кейсы

<p align="center">  
<img title="Allure Tests" src="images/screen/AllureTO.png" width="850">  
</p>
![img.png](img.png)![img_1.png](img_1.png)
____

<a id="уведомление-в-telegram-о-результатах-выполнения-автоматизированных-тестов"></a>

## <img alt="Allure" height="25" src="images/logo/Telegram.svg" width="25"/></a> Уведомление в Telegram при помощи бота

____
<p align="center">  
<img title="TG Overview" src="images/screen/TelegramApi.png" width="550">  
</p>

____
