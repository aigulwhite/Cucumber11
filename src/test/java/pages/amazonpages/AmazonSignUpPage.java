package pages.amazonpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import javax.swing.*;

public class AmazonSignUpPage {

    public AmazonSignUpPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "nav-link-accountList-nav-line-1")
    private WebElement hellosignInButton;

    @FindBy(id = "createAccountSubmit")
    private WebElement createAccountButton;

    @FindBy(id = "ap_customer_name")
    private WebElement name;

    @FindBy(id = "ap_email")
    private WebElement email;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement password;

    @FindBy(id = "ap_password_check")
    private WebElement passwordCheck;

    @FindBy(tagName = "h1")
    private WebElement headerText;


    public void setCreateAccount(){
        hellosignInButton.click();
        createAccountButton.click();
    }

    public String getHeaderText(){
        return BrowserUtils.getTextMethod(headerText);

    }
    public void allInformation(String username, String email, String password,String passwordCheck){
        name.sendKeys(username);
        this.email.sendKeys(email);
        this.password.sendKeys(password);
        this.passwordCheck.sendKeys(passwordCheck);
    }

}
