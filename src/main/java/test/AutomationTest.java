package test;

import models.pages.MainPage;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;
import static org.testng.AssertJUnit.assertEquals;

public class AutomationTest extends TestParent{

    private MainPage mainPage = new MainPage(getDriver());

    @Test
    public void searchForAutomationArticle() throws InterruptedException {
        mainPage.goToMainPage();
        mainPage.searchField().click();
        mainPage.searchField().sendKeys("Test Automation");
        mainPage.searchButton().click();
        assertEquals(driver.getCurrentUrl(), "https://en.wikipedia.org/wiki/Test_automation");
        sleep(5000);
    }
}
