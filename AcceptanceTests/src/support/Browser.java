package support;

import cucumber.api.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

public class Browser {
    public static WebDriver Driver;

    public static void initialise(){Driver = new FirefoxDriver();}

    public static void takeErrorScreenshot(Scenario currentScenario) {
        File screenshotFile = ((TakesScreenshot) Browser.Driver).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(screenshotFile, new File(String.format("%s/errorScreenshots/%s.png",
                    System.getProperty("user.dir"), currentScenario.getName())));
        } 
        catch (IOException exception) {
            System.out.println(String.format("Problem Capturing Error Screenshot for Scenario:" +
                    " %s Exception: %s", currentScenario.getName(), exception.getMessage()));
        }
    }
}
