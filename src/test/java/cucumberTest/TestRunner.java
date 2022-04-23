package cucumberTest;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features"
        ,glue= {"stepdefinitions"}
        ,tags = {"@SmokeTest"}

)

public class TestRunner {

}