package pages;

import core.Init;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;

    public void waitForPageLoad() {
        waitForReady(By.xpath("//body"));
    }


    public BasePage() {
        this.driver = Init.getDriver();
        this.wait = new WebDriverWait(driver, 5, 200);
        PageFactory.initElements(driver, this);
        //  waitForPageLoad();
    }

    @Step("Wait for ready {element}")
    public WebElement waitForReady(WebElement element) {
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    } //wait.until(ExpectedConditions.elementToBeClickable(element));

    public WebElement waitForReady(By by) {
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    @Attachment(value = "скрин", type = "image/png")
    public byte[] takeScreen() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

}
