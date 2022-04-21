package runners.weborder;

// Runner class is a way to run all feature files from here instead of one by one
// @RunWith comes from junit and executes the feature file steps
// cucumberOptions is a special annotation that have some keywords
     // feature- location of feature files (should be content root)
     // glue- location of step definitions (from the source root, delete .java to make it more f=general)
     // dryRun- a way to get snips without executing the whole implementations
     //.. it means if you make it TRUE you will get immediately unimplemented snips.

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // path for feature files
        features = "src/test/resources/features/com.weborder", // to get this...
        //right click on "order.feature" copy from content root
        // if I delete "order.feature", it will run everything under weborder. Meaning it will run and Order.feature


        // path for step definitions
        glue = "stepdefinitions/webordersteps",  // to get this...
        // right click on "orderSteps," copy path, from source root

        // we use it to run unimplemented snips in one scenario
        // but to get that new snip I need to put "true" get the snip and change "true" into "false" and run
        dryRun = false,
        tags = "@smokeLoginTest"
)

public class WebOrderRunner {
}
