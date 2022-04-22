package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


//@DefaultUrl("https://es.surveymonkey.com/")
public class CreateAccount {



    @FindBy(xpath = "//div[@class='wds-button  wds-button--upgrade  wds-button--solid  wds-button--sm    ']")
    private WebElement subscribe;

    @FindBy(xpath = "//input[@name='username']")
    private WebElement userName;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement password;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement email;

    @FindBy(xpath = "//input[@name='first_name']")
    private WebElement first_name;

    @FindBy(xpath = "//input[@name='last_name']")
    private WebElement last_name;

    @FindBy(xpath = "//button[@name='submitBtn']")
    private WebElement submitBtn;

    @FindBy(xpath = "//button[@class='mm-menu__nav-button']")
    private WebElement userNameDisplayed;


    public WebElement getSubscribe() {
        return subscribe;
    }

    public WebElement getUserName() { return userName; }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getFirst_name() {
        return first_name;
    }

    public WebElement getLast_name() {
        return last_name;
    }

    public WebElement getSubmitBtn() {
        return submitBtn;
    }

    public WebElement getUserNameDisplayed(){return userNameDisplayed;}

}