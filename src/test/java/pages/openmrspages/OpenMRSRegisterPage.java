package pages.openmrspages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.awt.windows.WBufferStrategy;
import utils.BrowserUtils;

public class OpenMRSRegisterPage {
    public OpenMRSRegisterPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(name = "givenName")
    private WebElement givenName;

    @FindBy(name = "familyName")
    private WebElement falmilyName;

    @FindBy(id = "next-button")
    private WebElement nextButton;

    @FindBy(id = "gender-field")   // select Tag
    private WebElement selectGender;

    @FindBy(name = "birthdateDay")
    private WebElement birthDay;

    @FindBy(id = "birthdateMonth-field")
    private WebElement selectBirthMonth;

    @FindBy(xpath = "//input[@name='birthdateYear']")
    private WebElement birthYear;

    @FindBy(id = "address1")
    private WebElement address;

    @FindBy(name = "phoneNumber")
    private WebElement phoneNumber;

    @FindBy(id = "relationship_type")
    private WebElement relationType;

    @FindBy(xpath = "//input[@placeholder='Person Name']")
    private WebElement relativeName;

    @FindBy(id = "submit")
    private WebElement confirmButton;

    @FindBy(xpath = "//span[@class='PersonName-givenName']")
    private WebElement validateGivenName;

    @FindBy(xpath = "//span[@class='PersonName-familyName']")
    private WebElement validateFamilyName;


  public void sendName(String name, String familyName) throws InterruptedException {
      givenName.sendKeys(name);
      this.falmilyName.sendKeys(familyName);
      Thread.sleep(3000);
      nextButton.click();
  }
  public void sendGender(String gender) throws InterruptedException {
      BrowserUtils.selectBy(selectGender, gender,"text");
      Thread.sleep(3000);
      nextButton.click();
  }
  public void sendBirthDate(String day, String month, String year) throws InterruptedException {
      birthDay.clear();
      birthDay.sendKeys(day);
      BrowserUtils.selectBy(selectBirthMonth,month,"text");
      birthYear.clear();
      birthYear.sendKeys(year);
      Thread.sleep(3000);
      nextButton.click();

  }
  public void sendAddress(String address) throws InterruptedException {
      this.address.sendKeys(address);
      Thread.sleep(3000);
      nextButton.click();
  }
  public void sendphoneNumber(String phoneNumber) throws InterruptedException {
      this.phoneNumber.sendKeys(phoneNumber);
      Thread.sleep(3000);
      nextButton.click();

  }
  public void sendRelativeInfo(String relationType, String relativeName) throws InterruptedException {
      BrowserUtils.selectBy(this.relationType,relationType,"text");
      this.relativeName.sendKeys(relativeName);
      Thread.sleep(3000);
      nextButton.click();
  }
  public void clickConfirmButton(){
      confirmButton.click();
  }


  public String getGivenName() throws InterruptedException {
      Thread.sleep(3000);
      return BrowserUtils.getTextMethod(validateGivenName);
  }
  public String getFamilyName() throws InterruptedException {
      Thread.sleep(3000);
      return BrowserUtils.getTextMethod(validateFamilyName);
  }


}
