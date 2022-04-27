package stepdefinitions;

import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import pages.CreateAccount;
import steps.CreateAccountSteps;
import steps.Hook;

public class CreateAccountStepDefinitions {

    @Steps
    protected WebDriver driver = Hook.getDriver();

    CreateAccountSteps createAccountSteps = new CreateAccountSteps(driver);

    //WebDriver driver = null;
    @Given("I open the site into the browser")
    public void iOpenTheSiteIntoTheBrowser() throws Exception {
        //System.out.println("hola");
        //PageGenerator.getInstance(driver, CreateAccount.class).openSite();
        createAccountSteps.openWebSite();


        //String projectPath = System.getProperty("user.dir");
        /*System.setProperty("webdriver.chrome.driver","C:/Users/David/OneDrive/Documentos/ProyectoFinal/ProyectoFinal/src/test/resources/drivers/chromedriver.exe");
        System.out.println("hola1");
        WebDriver driver = new ChromeDriver();
        System.out.println("hola2");
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);

        //driver.manage().window().maximize();
        driver.get("https://es.surveymonkey.com/") ;
        */
    }

    @When("I click on subscribe button")
    public void iClickOnSubscribeButton() {
        createAccountSteps.clickOnSubscribeButton();
    }
/*
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
