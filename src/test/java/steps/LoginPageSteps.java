package steps;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utilities.Utilities;

public class LoginPageSteps extends Hook{

    protected WebDriver driver = Hook.getDriver();

    LoginPage loginPage = new LoginPage(driver);

    @Step
    public void clickOnLoginButton(){
        loginPage.getLoginButton().click();
    }

    @Step
    public void fillUserName(){
        loginPage.getUserName().click();
        loginPage.getUserName().sendKeys(Utilities.randomUserName());}

    @Step
    public void fillPassword(){
        loginPage.getPassword().click();
        loginPage.getPassword().sendKeys(Utilities.randomPassword());}


    @Step
    public void clickOnInitSession(){
        loginPage.getInitSession().click();
    }

    @Step
    public void fillInvalidUserName(){
        loginPage.getUserName().click();
        loginPage.getUserName().sendKeys(Utilities.randomInvalidUserName());
    }

    @Step
    public String getMjeError(){
        return loginPage.getMjeError().getText();
    }

}
