import core.Init;
import org.junit.After;
import org.junit.Test;
import pages.SberPersonMainPage;
import pages.TravelAndShopping;

public class PageObjTest {

    @Test
    public void openRgs() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");


        Init.startBrowser("https://sberbank.ru/ru/person");

        SberPersonMainPage sberPersonMainPage = new SberPersonMainPage();

        sberPersonMainPage.openInsur();
        sberPersonMainPage.openDms();

        TravelAndShopping dmsMainPage = new TravelAndShopping();
        dmsMainPage.clickMin();
        dmsMainPage.clickNext();
        dmsMainPage.fillSurnameInsur();
        dmsMainPage.fillNameInsur();
        dmsMainPage.fillBirthDateInsur();
        dmsMainPage.fillSurname();
        dmsMainPage.fillName();
        dmsMainPage.fillMiddleName();
        dmsMainPage.fillBirthDate();
     //   dmsMainPage.clickMale();
        dmsMainPage.fillPassport_series();
        dmsMainPage.fillPassport_number();
        dmsMainPage.fillIssueDate();
        dmsMainPage.fillTextArea();
        dmsMainPage.fillNextNext();
        dmsMainPage.checkToFill();
    }

    //  @After
    public void close() {
        Init.getDriver().quit();
    }
}
