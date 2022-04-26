package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import steps.LoginPageSteps;

public class LoginPageStepDefinitions {

    @Steps
    LoginPageSteps loginPageSteps;

    @When("I click on login button")
    public void iClickOnLoginButton() {
        loginPageSteps.clickOnLoginButton();
        
    }

    @And("I enter valid credentials")
    public void iEnterValidCredentials() {
        loginPageSteps.fillUserName();
        loginPageSteps.fillPassword();
        loginPageSteps.clickOnInitSession();

    }

    @And("I enter invalid credentials")
    public void iEnterInvalidCredentials() {
        loginPageSteps.fillInvalidUserName();
        loginPageSteps.fillPassword();
        loginPageSteps.clickOnInitSession();
    }

    @Then("I should see an error message")
    public void iShouldSeeAnErrorMessage() {
        Assert.assertEquals(loginPageSteps.getMjeError(),"El nombre de usuario o la contraseña ingresados no son correctos. Vuelve a intentarlo y recuerda que las contraseñas distinguen entre mayúsculas y minúsculas.");;
    }
}
