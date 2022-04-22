package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://es.surveymonkey.com/")
public class CreateAccount extends PageObject {


    @FindBy(xpath = "//div[@class='wds-button  wds-button--upgrade  wds-button--solid  wds-button--sm    ']")
    private WebElementFacade subscribe;

    @FindBy(xpath = "//input[@name='username']")
    private WebElementFacade userName;

    @FindBy(xpath = "//input[@name='password']")
    private WebElementFacade password;

    @FindBy(xpath = "//input[@name='email']")
    private WebElementFacade email;

    @FindBy(xpath = "//input[@name='first_name']")
    private WebElementFacade first_name;

    @FindBy(xpath = "//input[@name='last_name']")
    private WebElementFacade last_name;

    @FindBy(xpath = "//button[@name='submitBtn']")
    private WebElementFacade submitBtn;

    @FindBy(xpath = "//button[@class='mm-menu__nav-button']")
    private WebElementFacade userNameDisplayed;


    public WebElementFacade getSubscribe() {
        return subscribe;
    }

    public WebElementFacade getUserName() { return userName; }

    public WebElementFacade getPassword() {
        return password;
    }

    public WebElementFacade getEmail() {
        return email;
    }

    public WebElementFacade getFirst_name() {
        return first_name;
    }

    public WebElementFacade getLast_name() {
        return last_name;
    }

    public WebElementFacade getSubmitBtn() {
        return submitBtn;
    }

    public WebElementFacade getUserNameDisplayed(){return userNameDisplayed;}

}