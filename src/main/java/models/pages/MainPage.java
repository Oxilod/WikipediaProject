package models.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    private final static By SEARCH_FIELD_LOCATOR = By.id("searchInput");
    private final static By SEARCH_BUTTON_LOCATOR = By.cssSelector("#search-form > fieldset > button");
    private String wikiBaseUrl = "https://www.wikipedia.org";
    private WebDriver driver;

    public MainPage(WebDriver driver){
        super();
        this.driver = driver;
    }

    public MainPage goToMainPage(){
        driver.get(wikiBaseUrl);
        return this;
    }

    public WebElement searchField(){
        return driver.findElement(SEARCH_FIELD_LOCATOR);
    }

    public WebElement searchButton(){
        return driver.findElement(SEARCH_BUTTON_LOCATOR);
    }
}
