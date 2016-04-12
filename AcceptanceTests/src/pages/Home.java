package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import support.BasePage;

public class Home extends BasePage {
    @FindBy(id = "footer")
    private WebElement pageFooter;

    public Home visit() {
        driver.navigate().to("http://www.itv.com");

        return this;
    }

    public boolean isCopyrightInformationDisplayed() {
        return pageFooter.getText().contains("© Copyright ITV plc 2016");
    }
}