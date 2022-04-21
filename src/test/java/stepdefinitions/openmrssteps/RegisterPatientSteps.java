package stepdefinitions.openmrssteps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.openmrspages.OpenMRMainPage;
import pages.openmrspages.OpenMRSLoginPage;
import pages.openmrspages.OpenMRSRegisterPage;
import utils.DriverHelper;

import java.util.Map;

public class RegisterPatientSteps {

    WebDriver driver= DriverHelper.getDriver();
    OpenMRSLoginPage openMRSLoginPage=new OpenMRSLoginPage(driver);
    OpenMRMainPage openMRMainPage=new OpenMRMainPage(driver);
    OpenMRSRegisterPage openMRSRegisterPage=new OpenMRSRegisterPage(driver);


    @Given("the user logs in to OpenMRS with following credentials")
    public void the_user_logs_in_to_open_mrs_with_following_credentials(DataTable dataTable) {

        // I should know that  dataTable will come as a parameter when I provide data table in the feature file.
        // I must delete things before the DataTable (line 25) and import the DataTable from cucumber.
        // I also have to delete the part with slashes // at the end of my snips

        Map<String,String> usernamePasswordMap=dataTable.asMap();
//       //inside Map, I have  username=admin, password=Admin123/ key and value. if they are integer put int.

// IN SOME CASES I WILL USE dataTable.asList (for example, if I have "name, last name, age, material status, etc.")
        // Map<String,String> usernamePasswordMap=dataTable.asList();

//        String name=usernamePasswordMap.get("username");
//        String password=usernamePasswordMap.get("password");
//        System.out.println(name);  //admin
//        System.out.println(password); //Admin123

        openMRSLoginPage.login(usernamePasswordMap.get("username"), usernamePasswordMap.get("password"));
    }

    @When("the user register a new patient with following information:")
    public void the_user_register_a_new_patient_with_following_information(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {

     Map<String, String > patientInfoMap= dataTable.asMap();

     openMRMainPage.clickRegisterPatientButton();
     openMRSRegisterPage.sendName(patientInfoMap.get("GivenName"), patientInfoMap.get("FamilyName"));
     openMRSRegisterPage.sendGender(patientInfoMap.get("Gender"));
     openMRSRegisterPage.sendBirthDate(patientInfoMap.get("Day"),patientInfoMap.get("Month"),patientInfoMap.get("Year"));
     openMRSRegisterPage.sendAddress(patientInfoMap.get("Address"));
     openMRSRegisterPage.sendphoneNumber(patientInfoMap.get("PhoneNumber"));
     openMRSRegisterPage.sendRelativeInfo(patientInfoMap.get("relationType"),patientInfoMap.get("RelativeName"));
     openMRSRegisterPage.clickConfirmButton();

    }
    @Then("the user validates the patient name and familyName")
    public void the_user_validates_the_patient_name_and_family_name(DataTable dataTable) throws InterruptedException {
       Map<String, String> validateNames=dataTable.asMap();
        Assert.assertEquals(validateNames.get("GivenName"),openMRSRegisterPage.getGivenName());
        Assert.assertEquals(validateNames.get("FamilyName"),openMRSRegisterPage.getFamilyName());
    }

}
