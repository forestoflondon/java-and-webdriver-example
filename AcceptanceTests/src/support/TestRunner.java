package support;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"AcceptanceTests/src/features"},
        glue = {"steps"},
        format = {"pretty", "html:target/cucumber"},
        tags = {"~@ignore"},
        monochrome = true
)

public class TestRunner {
}