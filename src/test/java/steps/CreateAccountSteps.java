package steps;

import io.github.bonigarcia.wdm.WebDriverManager;
//import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CreateAccount;
import utilities.PageGenerator;
import utilities.Utilities;
import java.util.concurrent.TimeUnit;
import steps.Hook;

public class CreateAccountSteps {

    protected WebDriver driver = Hook.getDriver();
    CreateAccount createAccount;


  /*  @Step
        public void openSite(){
        //createAccount.open();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\David\\OneDrive\\Documentos\\ProyectoFinal\\ProyectoFinal\\src\\test\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.shop.demoqa.com");
    }
*/
    @Step
    public void clickOnSubscribeButton(){
        createAccount.getSubscribe().click();
    }

    @Step
    public void fillAccountInformationUserName() {
        createAccount.getUserName().sendKeys(Utilities.randomUserName());
    }

    @Step
    public void fillAccountInformationPassword(){
        createAccount.getPassword().sendKeys(Utilities.randomPassword());
    }

    @Step
    public void fillAccountInformationEmail(){
        createAccount.getEmail().sendKeys(Utilities.randomEmail());
    }

    @Step
    public void fillAccountInformationFirstName(){
        createAccount.getFirst_name().sendKeys(Utilities.randomFirstName());
    }

    @Step
    public void fillAccountInformationLastName(){
        createAccount.getLast_name().sendKeys(Utilities.randomLastName());
    }

    @Step
    public void clickOnCreateAccountButton(){
        createAccount.getSubmitBtn().sendKeys(Keys.ENTER);
    }



}
