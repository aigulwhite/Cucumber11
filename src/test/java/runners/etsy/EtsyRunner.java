package runners.etsy;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/com.etsy",
        glue = "stepdefinitions/etsysteps", // I had to delete etsy.java part
        dryRun = false,
        tags = "@regressionoutline"   // don't type. copy from the feature file

)


public class EtsyRunner {
}
