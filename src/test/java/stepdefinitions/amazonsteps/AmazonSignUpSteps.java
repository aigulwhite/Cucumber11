package stepdefinitions.amazonsteps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.amazonpages.AmazonSignUpPage;
import utils.DriverHelper;

import java.util.List;

public class AmazonSignUpSteps {

    WebDriver driver= DriverHelper.getDriver();
    AmazonSignUpPage amazonSignUpPage=new AmazonSignUpPage(driver);


    @When("the user clicks the sign in and creates your amazon account button")
    public void the_user_clicks_the_sign_in_and_creates_your_amazon_account_button() {
        driver.navigate().to("https://www.amazon.com/");
        amazonSignUpPage.setCreateAccount();


    }
    @Then("the user validates the header")
    public void the_user_validates_the_header(DataTable dataTable) {
        List<String> header =dataTable.asList();
        Assert.assertEquals(header.get(0),amazonSignUpPage.getHeaderText());  // actual is getting called first
        // 0 is coming from the feature file ("create account")


                                           // Ahmet said I should check my pom.xml and see if testNG is deleted
                                          // my concern, if it is there and if I delete it,
                                          //  ... will it effect my codes where "actual" texts got saved first?

                                          // he said it will mess up all my codes, do not change anything

    }
    @Then("the user provides the information")
    public void the_user_provides_the_information(io.cucumber.datatable.DataTable dataTable) {
        List<String> allInformationFromDataTable=dataTable.asList();
        amazonSignUpPage.allInformation(allInformationFromDataTable.get(0),allInformationFromDataTable.get(1),
                allInformationFromDataTable.get(2), allInformationFromDataTable.get(3));

        // 1,2,3 are also coming from the dataTable in the feature file
        // aigul, aigul@gmail.com, aigul123, etc

    }

}
