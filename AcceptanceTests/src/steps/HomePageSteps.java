package steps;

import support.Site;
import org.junit.Assert;
import pageObjects.Home;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.Given;

public class HomePageSteps {
    @Given("^I am on the itv home page$")
    public void iAmOnTheItvHomePage() throws IllegalAccessException, InstantiationException {
        Site.page(Home.class).visit();
    }

    @Then("^the sites copyright information is shown$")
    public void theSitesCopyrightInformationIsShown() throws IllegalAccessException, InstantiationException {
        Assert.assertTrue("Copyright Information is Missing", Site.page(Home.class).isCopyrightInformationDisplayed());
    }
}