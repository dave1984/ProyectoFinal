package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CreateNewSurvey extends BasePage {

    public CreateNewSurvey(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='row_3']/div/div/div[4]/div/div[2]/a")
    private WebElement createSurvey;

    @FindBy(xpath = "//*[@id='reactApp']/div[1]/div/div/div[1]/div[2]/button[1]")
    private WebElement startZero;

    @FindBy(xpath = "//input[@id='surveyTitle']")
    private WebElement surveyTitle;

    @FindBy(xpath = "//input[@id='72b146cf-0d9e-4be7-9462-b4f5932eca2e']")
    private WebElement surveyType;

    @FindBy(xpath = "//button[@class='wds-button wds-button--primary wds-button--solid wds-button--md']")
    private WebElement createSurveyEnd;

    @FindBy(xpath = "//*[@id='row_3']/div/div/div[4]/ul/li/div[2]/ul[2]/div[2]/li/div/a/div[1]")
    private WebElement optionButton;

    @FindBy(xpath = "//*[@id='row_3']/div/div/div[4]/ul/li/div[2]/ul[2]/div[2]/li/div/ul/li[1]")
    private WebElement editButton;

    @FindBy(xpath = "//*[@id='pageid-26668842']/article/div[2]/section/form/div[3]/button[2]")
    private WebElement listoButton;


    public WebElement getCreateSurvey() { return createSurvey; }

    public WebElement getStartZero() {
        return startZero;
    }

    public WebElement getSurveyTitle() {
        return surveyTitle;
    }

    public WebElement getSurveyType() { return surveyType; }

    public WebElement getCreateSurveyEnd() {
        return createSurveyEnd;
    }

    public WebElement getOptionButton() {return optionButton;}

    public WebElement getEditButton(){return editButton;}

    public  WebElement getListoButton(){return listoButton;}


}
