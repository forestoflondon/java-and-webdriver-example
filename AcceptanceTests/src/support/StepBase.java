package support;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class StepBase {
    private Scenario scenario;

    @Before
    public void beforeAll(Scenario currentScenario) {
        this.scenario = currentScenario;

        if (Browser.Driver == null)
            Browser.initialise();
    }

    @After
    public void afterAll() {
        if (scenario.isFailed())
            Browser.takeErrorScreenshot(scenario);

        Browser.Driver.quit();
    }
}