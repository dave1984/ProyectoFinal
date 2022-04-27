package steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.CreateAccount;
import pages.CreateNewSurvey;
import utilities.Utilities;

public class CreateNewSurveySteps extends Hook{

    //protected WebDriver driver = Hook.getDriver();

    CreateNewSurvey createNewSurvey;// = new CreateNewSurvey(driver);

    @Step
    public void clickOnCreateNewSurveyButton(){
        createNewSurvey.getCreateSurvey().click();
    }

    @Step
    public void selectStartFromZero(){
        createNewSurvey.getStartZero().click();
    }

    @Step
    public void selectTitle(){
        createNewSurvey.getSurveyTitle().click();
        createNewSurvey.getCreateSurvey().sendKeys(Utilities.randomTitle());
    }

    @Step
    public void selectType(){

        Select surveyType1 = new Select(createNewSurvey.getSurveyType());
        surveyType1.selectByIndex(14);
    }

    @Step
    public void clickOnCreateSurveyButton(){
        createNewSurvey.getCreateSurveyEnd().click();  }

    @Step
    public void clickOnOptionButton(){
        createNewSurvey.getOptionButton().click();
    }

    @Step
    public void clickOnEditButton(){
        createNewSurvey.getEditButton().click();
    }

    @Step
    public void verifyTextListoButton(){
        Assert.assertEquals(createNewSurvey.getListoButton().getText(),"Listo");
    }
}

