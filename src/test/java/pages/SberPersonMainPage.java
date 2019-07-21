package pages;

import core.Init;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.*;

public class SberPersonMainPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(), 'Страхование')]")
    public WebElement openInsurButton;

    @FindBy(xpath = "//a[contains(text(), 'Путешествия и покупки')]")
    public WebElement clickDMS;
    @FindBy(xpath = "//a[contains(text(), 'Оформить онлайн')]")
    public WebElement clickBuyOnline;

    @Step("Open dropdown")
    public void openInsur() {
        waitForReady(openInsurButton).click();
    }

    @Step("Open insurance")
    public void openDms() {
        waitForReady(clickDMS).click();
        waitForReady(clickBuyOnline).click();
        ArrayList<String> tab = new ArrayList<>(Init.getDriver().getWindowHandles());
        Init.getDriver().switchTo().window(tab.get(1));
    }

    @Override
    public void waitForPageLoad() {
        waitForReady(By.xpath(""));
    }


}
