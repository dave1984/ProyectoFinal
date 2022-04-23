package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.google.com")
public class CreateAccount extends PageObject{

   // private String baseURL ="https://es.surveymonkey.com/";

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

    @FindBy(xpath = "//*[@id='signup-view']/div[2]/div/div/p")
    private static WebElement textCreateAccount;

    @FindBy(xpath = "//*[@id='row_3']/div/div/div[2]/h2")
    private static WebElement textDisplayed;

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

    public WebElement getUserNameDisplayed(){return textDisplayed;}

    public static String getTextCreateAccount(){
        String text =  textCreateAccount.getText();
        return text;
    }

    public static String getTextUserName(){
        String text1 = textDisplayed.getText();
        return text1;
    }
   /* public CreateAccount(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public CreateAccount goToThePage() {
        driver.get(baseURL);
        return this;

    }

    */

}