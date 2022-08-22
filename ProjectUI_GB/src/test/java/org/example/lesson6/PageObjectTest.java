package org.example.lesson6;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import io.qameta.allure.Feature;
import io.qameta.allure.TmsLink;
import org.example.lesson7.AdditionalLogger;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;


public class PageObjectTest {
    WebDriver driver;
    WebDriverWait webDriverWait;
    Actions actions;

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }


    @BeforeEach
    void initDriver() {
        driver = new EventFiringDecorator(new AdditionalLogger()).decorate(new ChromeDriver());
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        actions = new Actions(driver);
        driver.get("https://mrmag.ru/");
    }

    @Test
    @Feature("Кнопка Добавить в корзину")
    @DisplayName("Добавление товара в корзину через кнопку на карточке товара")
    @TmsLink("123")
    void addInBoxTest() {

        new MainPage(driver).clickKitchenAppliancesButton().clickIceLink().clickYogurtMaker().addToBox();

        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[1]//b[@data-calc = 'result']")));
        Assertions.assertTrue(driver.findElement(By.xpath("//div[1]//b[@data-calc = 'result']")).isDisplayed());

    }

    @AfterEach
    void killBrowser() {

      LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
      for (LogEntry log: logEntries) {
      Allure.addAttachment("Элемент лога браузера", log.getMessage());
     }
        driver.quit();
    }
}
