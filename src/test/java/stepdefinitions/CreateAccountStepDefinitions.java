package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import steps.CreateAccountSteps;
import utilities.Utilities;

public class CreateAccountStepDefinitions {

    @Steps
    CreateAccountSteps createAccountSteps;

    @Given("I open the site into the browser")
    public void iOpenTheSiteIntoTheBrowser() { createAccountSteps.openSite(); }

    @When("I click on subscribe button")
    public void iClickOnSubscribeButton() { createAccountSteps.clickOnSubscribeButton(); }

    @Then("I should see create account page")
    public void iShouldSeeCreateAccountPage() {
        WebElement userNameDisplayed = createAccountSteps.userNameDisplayed();
       Assert.assertEquals(userNameDisplayed,Utilities.randomUserName());
    }

    @And("I enter all required information")
    public void iEnterAllRequiredInformation() {
        
    }

    @And("I click on create account button")
    public void iClickOnCreateAccountButton() {
        
    }

    @Then("I should see dashboard page")
    public void iShouldSeeDashboardPage() {

    }
}
