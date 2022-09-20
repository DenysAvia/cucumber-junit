package manager;

import Pages.*;
import org.openqa.selenium.WebDriver;

public class PageFactoryManager {
    WebDriver driver;

    public PageFactoryManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {return new HomePage(driver);}
    public SearchResultsPage getSearchResultsPage() {return new SearchResultsPage(driver);}
    public WishListPage getWishListPage() {return new WishListPage(driver);}
    public SignInPage getSignInPage(){return new SignInPage(driver);}
    public ProductPage  getProductPage() {return new ProductPage(driver);}
    public ContactsPage getContactsPage(){return new ContactsPage(driver);}
    public FeedbackPage getFeedbackPage() {return new FeedbackPage(driver);}
    public ShippingPaymentPage getShippingPaymentPage() {return new ShippingPaymentPage(driver);}
}
