package test;

import models.pages.MainPage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class AutomationTest extends TestParent{

    public MainPage mainPage = new MainPage(getDriver());

    @Test
    public void searchForAutomationArticle()  {
        mainPage.goToMainPage();
        mainPage.searchField().click();
        mainPage.searchField().sendKeys("Test Automation");
        mainPage.searchButton().click();
        assertEquals(driver.getCurrentUrl(), "https://en.wikipedia.org/wiki/Test_automation");
    }
}
