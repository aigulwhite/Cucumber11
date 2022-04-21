package runners.product;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/uiFailedTests.txt",  //location of the failed test. Just type it
        glue="stepdefinitions/productsteps",
        dryRun= false,
        tags ="@productprojectOutline",  // I got it from the productScenario.feature (last part) since that is the part I need to run

        // HTML REPORT
        plugin={"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}
)
public class ProductReRun {

}
