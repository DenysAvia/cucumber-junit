package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {super(driver);}

    @FindBy(id = "search")
    private WebElement searchInput;

    @FindBy(xpath = "//button[@class='block-search__btn']")
    private WebElement searchButton;

    @FindBy(xpath ="//button[@class='wishlist']" )
    private WebElement wishListButton;

    @FindBy(xpath = "//*[@id='ui-id-1']/div/div[1]/a")
    private WebElement popUpWindowClose;

    @FindBy(xpath = "//header/div[1]")
    private WebElement header;
    @FindBy(xpath = "//footer[@class='footer']")
    private WebElement footer;
    @FindBy(xpath = "//*[@id='cart']/button")
    private WebElement cart;
    @FindBy(xpath = "//*[@id='form-language']/ul/li[2]/button")
    private WebElement languageSwitch;
    @FindBy(xpath = "//a[@class='header__account-link'][2]")
    private WebElement registerButton;
    @FindBy(xpath = "//a[@class='header__account-link'][1]")
    private WebElement loginButton;
    @FindBy(xpath = "//div[1]/ul/li[1]/a")
    private WebElement contactMenu;
    @FindBy(xpath = "//header/div[1]/ul/li[2]/a")
    private WebElement shippingPaymentMenu;
    @FindBy(xpath = "//header/div[1]/ul/li[4]/a")
    private WebElement blogMenu;
    @FindBy(xpath = "//header/div[1]/ul/li[3]/a")
    private WebElement feedbackMenu;


    public static void openHomePage(String url) {driver.get(url);}

    public boolean isSearchFieldVisible () {
    return searchInput.isDisplayed();
    }

    public void enterTextToSearchField(String keyword) {
        searchInput.clear();
        searchInput.sendKeys(keyword);
    }
    public void clickSearchButton() {
        searchButton.click();
    }
    public void popUpWindowCloseButton() {popUpWindowClose.click();
    }
    public boolean isHeaderVisible () {return header.isDisplayed();}
    public boolean isFooterVisible () {return footer.isDisplayed();}
    public boolean isCartVisible () {
        return cart.isDisplayed();
    }
    public boolean isLanguageSwitchVisible () {
        return languageSwitch.isDisplayed();
    }
    public boolean isRegisterButtonVisible () {return registerButton.isDisplayed();}
    public boolean isLoginButtonVisible () {
        return loginButton.isDisplayed();
    }
    public boolean isContactVisible () {
        return contactMenu.isDisplayed();
    }
    public boolean isShippingPaymentMenuVisible () {
        return shippingPaymentMenu.isDisplayed();
    }
    public boolean isBlogMenuVisible () {
        return blogMenu.isDisplayed();
    }
    public boolean isFeedbackMenuVisible () {
        return feedbackMenu.isDisplayed();
    }
    public void clickSignInButton() {loginButton.click();}

    public void clickContactPageButton() {contactMenu.click();}
    public void clickFeedbackMenuButton() {feedbackMenu.click();}
    public void clickShippingPaymentMenuButton() {shippingPaymentMenu.click();}
 }

