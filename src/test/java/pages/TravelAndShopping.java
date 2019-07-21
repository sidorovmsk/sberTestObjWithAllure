package pages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class TravelAndShopping extends BasePage {

    @FindBy(xpath = "//div[contains(text(),'Минимальная')]")
    public WebElement clickMin;
    @FindBy(xpath = "//span[contains(text(),'Оформить')]")
    public WebElement clickNext;
    @FindBy(xpath = "//*[@name='male']")
    public WebElement clickMale;
    @FindBy(xpath = "//input[@name='insured0_surname']")
    public WebElement fillSurnameInsur;
    @FindBy(xpath = "//input[@name='insured0_name']")
    public WebElement fillNameInsur;
    @FindBy(xpath = "//input[@name='surname']")
    public WebElement fillSurname;
    @FindBy(xpath = "//input[@name='name']")
    public WebElement fillName;
    @FindBy(xpath = "//input[@name='middlename']")
    public WebElement fillMiddlename;
    @FindBy(xpath = "//input[@name='birthDate']")
    public WebElement fillBirthDate;
    @FindBy(xpath = "//input[@name='insured0_birthDate']")
    public WebElement fillBirthDateInsur;
    @FindBy(xpath = "//input[@name='passport_series']")
    public WebElement fillPassport_series;
    @FindBy(xpath = "//input[@name='passport_number']")
    public WebElement fillPassport_number;
    @FindBy(xpath = "//input[@name='issueDate']")
    public WebElement fillPassport_issueDate;
    @FindBy(xpath = "//textarea")
    public WebElement fillTextarea;
    @FindBy(xpath = "//span[contains(text(),'Продолжить')]")
    public WebElement fillNextNext;
    @FindBy(xpath = "//*[text()='Заполнены не все обязательные поля']")
    public WebElement checkToFill;

    @Step("Send request")
    public void clickMin() {
        waitForReady(clickMin).click();
    }

    @Step("Send request")
    public void clickNext() {
        waitForReady(clickNext).click();
    }

    @Step("fill field")
    public void fillSurnameInsur() {
        waitForReady(fillSurnameInsur).sendKeys("Ivanov");
    }

    @Step("fill field")
    public void fillNameInsur() {
        waitForReady(fillNameInsur).sendKeys("Ivan");
    }

    @Step("fill field")
    public void fillBirthDateInsur() {
        waitForReady(fillBirthDateInsur).sendKeys("12121912");
    }

    @Step("fill field")
    public void fillSurname() {
        waitForReady(fillSurname).sendKeys("Иванов");
    }

    @Step("fill field")
    public void fillName() {
        waitForReady(fillName).sendKeys("Иван");
    }

    @Step("fill field")
    public void fillMiddleName() {
        waitForReady(fillMiddlename).sendKeys("Иванович");
    }

    @Step("fill field")
    public void fillBirthDate() {
        waitForReady(fillBirthDate).sendKeys("12121912");
    }

    @Step("Send request")
    public void clickMale() {
        waitForReady(clickMale).click();
    }


    @Step("fill field")
    public void fillPassport_series() {
        waitForReady(fillPassport_series).sendKeys("1234");
    }

    @Step("fill field")
    public void fillPassport_number() {
        waitForReady(fillPassport_number).sendKeys("556677");
    }

    @Step("fill field")
    public void fillIssueDate() {
        waitForReady(fillPassport_issueDate).sendKeys("10102010");
    }

    @Step("fill field")
    public void fillTextArea() {
        waitForReady(fillTextarea).sendKeys("А кем выдан заполнять?)");
    }

    @Step("fill field")
    public void fillNextNext() {
        waitForReady(fillNextNext).click();
    }

    @Step("fill field")
    public void checkToFill() {
        Assert.assertTrue(checkToFill.isDisplayed());
    }

}
