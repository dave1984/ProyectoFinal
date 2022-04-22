package steps;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CreateAccount;
import utilities.Utilities;

public class CreateAccountSteps {

    CreateAccount createAccount;
    WebDriver driver;
    @Step
    public void openSite(){
        System.setProperty("chromedriver","C:/Users/David/OneDrive/Documentos/Automation_Trainner/NewReport/automation_frmk_web/src/test/resources/drivers");
        driver= new ChromeDriver();
        driver.get("https://es.surveymonkey.com/");
        //createAccount.open();
    }

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
    @Step
    public WebElement userNameDisplayed(){
        return createAccount.getUserNameDisplayed();
    }

}
