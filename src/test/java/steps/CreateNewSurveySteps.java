package steps;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.Select;
import pages.CreateAccount;
import pages.CreateNewSurvey;
import utilities.Utilities;

public class CreateNewSurveySteps {

    CreateNewSurvey createNewSurvey;

    @Step
    public void clickOnCreateNewSurveyButton(){
        createNewSurvey.getCreateSurvey().click();
    }

    @Step
    public void selectStartFromZero(){
        createNewSurvey. getStartZero().click();
    }

    @Step
    public void selectTitle(){
        createNewSurvey. getSurveyTitle().click();
        createNewSurvey.getCreateSurvey().sendKeys(Utilities.randomTitle());
    }

    @Step
    public void selectType(){

        Select surveyType1 = new Select(createNewSurvey.getSurveyType());
        surveyType1.selectByIndex(14);
    }
    public void clickObCreateSurveyButton(){
        createNewSurvey. getCreateSurveyEnd().click();  }

}

