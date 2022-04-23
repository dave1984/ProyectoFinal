package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CreateAccount;
import steps.CreateAccountSteps;

import java.util.concurrent.TimeUnit;

public class CreateAccountStepDefinitions {


    @Steps
    WebDriver driver;
    CreateAccountSteps createAccountSteps;

    @Given("I open the site into the browser")
    public void iOpenTheSiteIntoTheBrowser() {
       // PageGenerator.getInstance(CreateAccount.class, driver).goToThePage();
       // createAccountSteps.openSite();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\David\\OneDrive\\Documentos\\ProyectoFinal\\ProyectoFinal\\src\\test\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://es.surveymonkey.com/");
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
