package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CreateAccount;
import steps.CreateAccountSteps;
import steps.Hook;
import utilities.PageGenerator;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

public class CreateAccountStepDefinitions {

    @Step
   // protected WebDriver driver = Hook.getDriver();
   // CreateAccountSteps createAccountSteps;

    @Given("I open the site into the browser")
    public void iOpenTheSiteIntoTheBrowser() throws Exception {
       // PageGenerator.getInstance(CreateAccount.class, driver).openSite();
        //createAccountSteps.openWebSite();
        WebDriverManager.chromedriver().setup();

        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",projectPath + "/src/test/resources/drivers/");
        ChromeDriver driver = new ChromeDriver();
       // driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
       // driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);

        driver.manage().window().maximize();
    }
/*
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

 */
}
