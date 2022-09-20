package stepdefinitions;

import Pages.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import manager.PageFactoryManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;
import static org.hamcrest.CoreMatchers.containsString;

public class DefinitionSteps {

    private static final long DEFAULT_TIMEOUT = 60;
    WebDriver driver;
    HomePage homePage;
    SearchResultsPage searchResultsPage;

    WishListPage wishListPage;
    PageFactoryManager pageFactoryManager;
    SignInPage signInPage;

    ProductPage productPage;
    ContactsPage contactsPage;
    FeedbackPage feedbackPage;
    ShippingPaymentPage shippingPaymentPage;

    @Before
    public void testSetUp () {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--disable-popup-blocking");
        chromeOptions.addArguments("--disable-infobars");
        chromeOptions.addArguments("--disable-notifications");

        chromedriver().setup();
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        pageFactoryManager = new PageFactoryManager(driver);
    }

    @After
    public void tearDown() {driver.close();}


    @And("User opens {string} page")
    public void openPage(final String url){
        homePage = pageFactoryManager.getHomePage();
        HomePage.openHomePage(url);
    }

    @And("User checks search field visibility")
    public void userChecksSearchFieldVisibility() {
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        homePage.isSearchFieldVisible();
    }

    @And("User makes search by keyword {string}")
    public void userMakesSearchByKeywordKeyword(final String keyword) {
        homePage.enterTextToSearchField(keyword);
    }

    @And("User clicks search button")
    public void userClicksSearchButton() {
        homePage.clickSearchButton();
    }


    @And("User clicks wish list on first product")
    public void userClicksWishListOnFirstProduct() {
    searchResultsPage = pageFactoryManager.getSearchResultsPage();
    searchResultsPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
    searchResultsPage.clickWishListButtonOnFirstProduct();
    }

    @And("User checks that wish list is not empty")
    public void checksAmountOfProductsInWishList() {
       wishListPage = pageFactoryManager.getWishListPage();
       wishListPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
       Assert.assertTrue(wishListPage.getAmountOfProductsInWishList()>0);


    }

    @And("User checks header visibility")
    public void userChecksHeaderVisibility() {
        homePage.isHeaderVisible();
    }

    @And("User checks footer visibility")
    public void userChecksFooterVisibility() {
        homePage.isFooterVisible();
    }

    @And("User checks cart visibility")
    public void userChecksCartVisibility() {
        homePage.isCartVisible();
    }

    @And("User checks language switch visibility")
    public void userChecksLanguageSwitchVisibility() {
        homePage.isLanguageSwitchVisible();
    }


    @And("User checks register button visibility")
    public void userChecksRegisterButtonVisibility() {
        homePage.isRegisterButtonVisible();
    }

    @And("User checks login button visibility")
    public void userChecksLoginButtonVisibility() {
        homePage.isLoginButtonVisible();
    }

    @And("User checks contact visibility")
    public void userChecksContactVisibility() {
        homePage.isContactVisible();
    }

    @And("User checks shipping-payment visibility")
    public void userChecksShippingPaymentVisibility() {
        homePage.isShippingPaymentMenuVisible();
    }


    @And("User checks blog visibility")
    public void userChecksBlogVisibility() {
        homePage.isBlogMenuVisible();
    }

    @And("User checks feedback visibility")
    public void userChecksFeedbacksVisibility() {
        homePage.isFeedbackMenuVisible();
    }

    @And("User clicks Sign in button")
    public void userClicksClicksSignInButton() {
        homePage.clickSignInButton();

    }

    @And("User checks email and password fields visibility")
    public void userChecksEmailAndPasswordFieldsVisibility() {
        signInPage = pageFactoryManager.getSignInPage();
        signInPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        signInPage.isInputEmailVisible();
        signInPage.isInputPasswordVisible();
    }

    @Then("User checks that Sign in page url contains word {string}")
    public void userChecksThatSignInPageUrlIsSignInUrl(String expectedWord) {
        Assert.assertThat(driver.getCurrentUrl(), containsString(expectedWord));
    }

    @Given("User opens Wish List page")
    public void userOpensWishListPage() {
        wishListPage = pageFactoryManager.getWishListPage();
        wishListPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);

    }


    @And("User clicks on first product")
    public void userClicksOnFirstProduct() {
        searchResultsPage = pageFactoryManager.getSearchResultsPage();
        searchResultsPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        searchResultsPage.clickOnFirstProduct();
    }

    @And("User checks compare button visibility")
    public void userChecksCompareButtonVisibility() {
        productPage = pageFactoryManager.getProductPage();
        productPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        productPage.isCompareButtonVisible();
    }

    @And("User checks wish list button visibility")
    public void userChecksWishListButtonVisibility() {
        productPage.isWishListButtonVisible();

    }

    @And("User checks product name visibility")
    public void userChecksProductNameVisibility() {
        productPage.isProductNameVisible();
    }


    @And("User checks info button visibility")
    public void userChecksInfoButtonVisibility() {
        productPage.isInfoButtonVisible();
    }

    @And("User checks product characteristics button visibility")
    public void userChecksProductCharacteristicsButtonVisibility() {
        productPage.isProductCharacteristicsButtonVisible();
    }

    @And("User checks product feedback button visibility")
    public void userChecksProductFeedbackButtonVisibility() {
        productPage.isFeedbackButtonVisible();
    }

    @And("User checks product buy button visibility")
    public void userChecksProductBuyButtonVisibility() {
        productPage.isBuyButtonVisible();
    }

    @And("User clicks on buy product button")
    public void userClicksOnBuyProductButton() {
        productPage.clickBuyButton();
    }

    @Then("User checks that cart is not empty")
    public void userChecksThatCartIsNotEmpty() {
        new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='checkoutModal']/div/div[2]/div")));
        Assert.assertTrue(productPage.getAmountOfProductsInCart()>0);
    }
    @And("User clicks on login button")
    public void userClicksOnLoginButton() {
        homePage.clickSignInButton();
    }

    @When("User enter email by keyword {string}")
    public void userEnterIncorrectEmailByKeywordEmail(String email) {
        signInPage.enterEmailToEmailField(email);
    }

    @And("User enter password by keyword {string}")
    public void userEnterPasswordByKeywordPassword(String pass) {
        signInPage.enterPassToPassField(pass);
    }

    @And("User clicks on sign in button")
    public void userClicksOnSignInButton() {
        signInPage.clickOnSignInButton();
    }
    @FindBy(xpath ="//div[@class='alert alert-danger alert-dismissible']")
    private WebElement popUpWrongEmailOrPass;
    @Then("User checks that information about such user was not found is displayed")
    public void userChecksThatInformationAboutSuchUserWasNotFound() {

        new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='alert alert-danger alert-dismissible']")));

       Assert.assertTrue(signInPage.isPopUpWrongEmailOrPassVisible());
    }
    @When("User clicks on contact page button")
    public void userClicksOnContactPageButton() {
        homePage.clickContactPageButton();

    }

    @And("User checks facebook button visibility")
    public void userChecksFacebookButtonVisibility() {
        contactsPage = pageFactoryManager.getContactsPage();
        contactsPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        contactsPage.isFaceBookIconVisible();
    }

    @And("User checks instagram button visibility")
    public void userChecksInstagramButtonVisibility() {
        contactsPage.isInstagramIconVisible();
    }

    @And("User checks name of store visibility")
    public void userChecksNameOfStoreVisibility() {
        contactsPage.isNameOfStoreVisible();
    }

    @And("User checks address of store visibility")
    public void userChecksAddressOfStoreVisibility() {
        contactsPage.isAddressNameVisible();
    }

    @And("User checks phone info visibility")
    public void userChecksPhoneInfoVisibility() {
        contactsPage.isPhoneInfoVisible();
    }

    @And("User checks e-mail info info visibility")
    public void userChecksEMailInfoInfoVisibility() {
        contactsPage.isEmailInfoVisible();
    }

    @And("User checks work hours info info visibility")
    public void userChecksWorkHoursInfoInfoVisibility() {
        contactsPage.isWorkHoursVisible();
    }

    @Then("User checks that contacts page url contains word {string}")
    public void userChecksThatContactsPageUrlContainsWord(String expectedWord) {
        Assert.assertThat(driver.getCurrentUrl(), containsString(expectedWord));
    }

    @When("User clicks on feedback page button")
    public void userClicksOnFeedbackPageButton() {
        homePage.clickFeedbackMenuButton();
    }

    @And("User checks feedback page title visibility")
    public void userChecksFeedbackPageTitleVisibility() {
        feedbackPage = pageFactoryManager.getFeedbackPage();
        feedbackPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        feedbackPage.isFeedbackPageTitleVisible();
    }

    @And("User checks site rating indicator visibility")
    public void userChecksSiteRatingIndicatorVisibility() {
        feedbackPage.isSiteRatingIndicatorVisible();
    }

    @And("User checks feedbacks visibility")
    public void userChecksFeedbacksVisibilityOnFeedbackPage() {
        feedbackPage.isFeedbackAreaVisible();
    }

    @Then("User checks that feedback page url contains word {string}")
    public void userChecksThatFeedbackPageUrlContainsWord(String expectedWord) {
        Assert.assertThat(driver.getCurrentUrl(), containsString(expectedWord));
    }

    @When("User clicks on shipping-payment page button")
    public void userClicksOnShippingPaymentPageButton() {
        homePage.clickShippingPaymentMenuButton();

    }
    @And("User checks shipping-payment page title visibility")
    public void userChecksShippingPaymentPageTitleVisibility() {
        shippingPaymentPage = pageFactoryManager.getShippingPaymentPage();
        shippingPaymentPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        shippingPaymentPage.isShippingPaymentPageTitleVisible();
    }
    @And("User checks return policy visibility")
    public void userChecksReturnPolicyVisibility() {
        shippingPaymentPage.isReturnPolicyVisible();
    }

    @Then("User checks that shipping-payment page url contains word {string}")
    public void userChecksThatShippingPaymentPageUrlContainsWord(String expectedWord) {
        Assert.assertThat(driver.getCurrentUrl(), containsString(expectedWord));
    }


}
