package steps;

//import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.CreateAccount;
import utilities.PageGenerator;
import utilities.Utilities;

public class CreateAccountSteps extends Hook{

    protected WebDriver driver = Hook.getDriver();

    //CreateAccount createAccount= new CreateAccount(driver);


   @Step
   public void openWebSite() throws Exception {
       PageGenerator.getInstance(CreateAccount.class, driver).openSite();
       // createAccount.openSite();
    }
/*
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

*/

}
