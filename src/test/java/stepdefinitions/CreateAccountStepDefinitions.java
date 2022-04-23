package stepdefinitions;

import cucumber.runtime.junit.Assertions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.CreateAccount;
import steps.CreateAccountSteps;
import steps.Hook;
import utilities.PageGenerator;

public class CreateAccountStepDefinitions {

    @Steps
    CreateAccountSteps createAccountSteps;

    @Given("I open the site into the browser")
    public void iOpenTheSiteIntoTheBrowser() {
       // PageGenerator.getInstance(CreateAccount.class, driver).goToThePage();
        createAccountSteps.openSite();
    }

    @When("I click on subscribe button")
    public void iClickOnSubscribeButton() {
        createAccountSteps.clickOnSubscribeButton();
    }

    @Then("I should see create account page")
    public void iShouldSeeCreateAccountPage() {

        Assert.assertEquals(CreateAccount.getTextCreateAccount(),"Crea una cuenta");
    }

    @And("I enter all required information")
    public void iEnterAllRequiredInformation() {

        createAccountSteps.fillAccountInformationUserName();
        createAccountSteps.fillAccountInformationPassword();
        createAccountSteps.fillAccountInformationEmail();
        createAccountSteps.fillAccountInformationFirstName();
        createAccountSteps.fillAccountInformationLastName();
        
    }

    @And("I click on create account button")
    public void iClickOnCreateAccountButton() {
        createAccountSteps.clickOnCreateAccountButton();
        
    }

    @Then("I should see dashboard page")
    public void iShouldSeeDashboardPage() {

        Assert.assertEquals(CreateAccount.getTextUserName(),"Encuestas recientes");

    }
}
