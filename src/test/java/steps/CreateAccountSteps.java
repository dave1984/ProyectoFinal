package steps;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import pages.CreateAccount;

public class CreateAccountSteps {

    CreateAccount createAccount;

    @Step
    public void openGoogle(){
        createAccount.open();
    }

    @Step
    public void clickOnSubscribeButton(){
        createAccount.getSubscribe().click();
    }


}
