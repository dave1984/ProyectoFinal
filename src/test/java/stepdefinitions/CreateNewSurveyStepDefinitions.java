package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import steps.CreateNewSurveySteps;

public class CreateNewSurveyStepDefinitions {

    CreateNewSurveySteps createNewSurveySteps;

    @And("I click on create survey button")
    public void iClickOnCreateSurveyButton() {
        createNewSurveySteps.clickOnCreateNewSurveyButton();
    }

    @And("I click on start from zero")
    public void iClickOnStartFromZero() {
        createNewSurveySteps.selectStartFromZero();
    }

    @And("I fill all survey information out")
    public void iFillAllSurveyInformationOut() {
        createNewSurveySteps.selectTitle();
        createNewSurveySteps.selectType();
    }

    @Then("I should see new created survey")
    public void iShouldSeeNewCreatedSurvey() {
        createNewSurveySteps.clickOnCreateSurveyButton();
    }

    @And("I click on options button")
    public void iClickOnOptionsButton() {
        createNewSurveySteps.clickOnOptionButton();
    }

    @And("I click on edit button")
    public void iClickOnEditButton() {
        createNewSurveySteps.clickOnEditButton();
    }

    @Then("I should edit the survey")
    public void iShouldEditTheSurvey() {
        createNewSurveySteps.verifyTextListoButton();
    }
}
