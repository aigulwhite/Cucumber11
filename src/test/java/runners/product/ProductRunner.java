package runners.product;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/com.products",  // feature--> content root
        glue = "stepdefinitions/productsteps",                  // stepdefinitions ---> source root
        dryRun = false,
        tags = "@productprojectOutline",

        // to run NEGATIVE TEST  go to feature file and change something, like add or remove one letter


                            // CREATING HTML REPORT =============

      plugin = {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}

        // to see the report: go to target file-->uiReport--> right click-->open in--> Browser--> and chose the browser(chrome)
        // to fail it go to ProductScenario.feature and change some things, like delete a letter or add
        // to send this report follow the line 22, when the report opens copy the link and send it to the proper person.

)

public class ProductRunner {

}
