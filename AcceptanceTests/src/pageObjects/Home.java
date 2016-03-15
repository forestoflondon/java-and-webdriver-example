package pageObjects;

import support.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {
    @FindBy(id = "footer")
    private WebElement pageFooter;

    public Home visit() {
        Browser.Driver.navigate().to("http://www.itv.com");

        return this;
    }

    public boolean isCopyrightInformationDisplayed(){
        return pageFooter.getText().contains("© Copyright ITV plc 2016");
    }
}