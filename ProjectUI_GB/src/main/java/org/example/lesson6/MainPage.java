package org.example.lesson6;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;


public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@href ='/shop/tekhnika_dlya_kukhni']//img[@alt = 'Техника для кухни']")
    private WebElement kitchenAppliancesButton;
    @FindBy(xpath = "//div[@class = 'category-name']//a[text() = 'Йогуртницы, мороженицы']")
    private WebElement iceLink;


    @Step ("Клик на кнопку Техника для кухни")
    public MainPage clickKitchenAppliancesButton() {
        kitchenAppliancesButton.click();
        return this;
    }

    @Step("Клик на ссылку Йогуртницы, мороженницы")
    public IceCreamPage clickIceLink() {
        iceLink.click();
        return new IceCreamPage(driver);
    }

}
