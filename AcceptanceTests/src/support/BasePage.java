package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;

    public BasePage() {
        driver = Browser.Driver;
        PageFactory.initElements(driver, this);
    }
}