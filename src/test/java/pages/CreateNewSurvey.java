package pages;

//import groovy.lang.MetaClassImpl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewSurvey {

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

    public CreateNewSurvey(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
