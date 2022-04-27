package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='root']/div/div[1]/div/div[3]/div/a[1]")
    private WebElement loginButton;

    @FindBy(xpath = "//input[@name='username']")
    private WebElement userName;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement password;

    @FindBy(xpath = "//button[@class='wds-button wds-button--stretch wds-button--icon-right wds-button--arrow-right']")
    private WebElement initSession;

    @FindBy(xpath = "//*[@id='errors']/ul/li")
    private WebElement mjeError;

    public WebElement getLoginButton() {return loginButton;}

    public WebElement getUserName() { return userName; }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getInitSession() {
        return initSession;
    }

    public WebElement getMjeError(){return mjeError;}

}
