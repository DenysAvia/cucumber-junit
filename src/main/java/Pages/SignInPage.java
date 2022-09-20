package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class SignInPage extends BasePage {

 public final String SIGNIN_URL = "https://zooleader.com.ua/login";

    public SignInPage(WebDriver driver) {super(driver);}

    @FindBy(xpath ="//*[@id='input-email']" )
    private WebElement inputEmail;

    @FindBy(xpath ="//*[@id='input-password']" )
    private WebElement inputPassword;
    @FindBy(xpath ="//button[@class='btn btn__primary']" )
    private WebElement signInButton;
    @FindBy(xpath ="//div[@class='alert alert-danger alert-dismissible']")
    private WebElement popUpWrongEmailOrPass;


    public SignInPage getSignInPage() {
        driver.get(SIGNIN_URL);
        return this;
    }

    public boolean isInputEmailVisible () {return inputEmail.isDisplayed();}
    public boolean isInputPasswordVisible () {
        return inputPassword.isDisplayed();
    }

    public void enterEmailToEmailField(String keyword) {
        inputEmail.clear();
        inputEmail.sendKeys(keyword);
    }
    public void enterPassToPassField(String keyword) {
        inputPassword.clear();
        inputPassword.sendKeys(keyword);
    }
    public void clickOnSignInButton () {signInButton.click();}

    public boolean isPopUpWrongEmailOrPassVisible () {return popUpWrongEmailOrPass.isDisplayed();}


}
