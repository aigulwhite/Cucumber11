package stepdefinitions.webordersteps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DriverHelper;

public class HookWebOrder {

    @Before
    public void beforeScenario(){
        System.out.println("it runs before eachScenario");
    }
    @After
    public void afterScenario(){
        DriverHelper.tearDown();
        System.out.println("it runs after eachScenario");
    }
 //    WE NEED THIS TO RUN EACH SCENARIO (OPEN ONE,CLOSE AND MOVE TO THE NEXT ONE AND DO THE SAME THING)

}
