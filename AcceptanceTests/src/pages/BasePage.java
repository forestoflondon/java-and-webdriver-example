package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import support.Browser;

class BasePage {
    WebDriver driver;

    BasePage() {
        driver = Browser.Driver;
        PageFactory.initElements(driver, this);
    }
}