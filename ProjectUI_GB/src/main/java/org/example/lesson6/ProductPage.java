package org.example.lesson6;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class = 'product-buy']//a[1]")
    private WebElement addToBoxButton;

    @Step("Клик на кнопку Добавить в корзину")

    public ProductPage addToBox() {
        addToBoxButton.click();
        return this;
    }
}
