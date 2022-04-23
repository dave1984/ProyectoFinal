package steps;

import net.thucydides.core.annotations.Step;
import pages.LoginPage;
import utilities.Utilities;

public class LoginPageSteps {
    LoginPage loginPage;

    @Step
    public void fillUserName(){
        loginPage.getUserName().click();
        loginPage.getUserName().sendKeys(Utilities.randomUserName());}

    @Step
    public void fillPassword(){
        loginPage.getPassword().click();
        loginPage.getPassword().sendKeys(Utilities.randomPassword());}


    @Step
    public void getInitSession(){
        loginPage.getInitSession().click();
    }

}
