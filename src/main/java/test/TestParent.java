package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestParent {

    protected WebDriver driver;
    private WebDriverWait wait;

    public TestParent(){
        System.setProperty("webdriver.chrome.driver", "C:\\_dev\\chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(this.driver, 25, 100);
    }

    @AfterSuite
    public void afterSuite(){
        driver.quit();
    }

    public WebDriver getDriver() {
        return this.driver;
    }
}
