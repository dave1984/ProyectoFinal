package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(xpath = "//input[@name='username']")
    private WebElement userName;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement password;

    @FindBy(xpath = "//button[@class='wds-button wds-button--stretch wds-button--icon-right wds-button--arrow-right']")
    private WebElement initSession;


    public WebElement getUserName() { return userName; }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getInitSession() {
        return initSession;
    }
}
