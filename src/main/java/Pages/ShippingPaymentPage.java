package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingPaymentPage extends BasePage{
    public ShippingPaymentPage(WebDriver driver) {super(driver);}


    @FindBy(xpath ="//h1[@class='page__heading-title']")
    private WebElement shippingPaymentPageTitle;
    @FindBy(xpath ="//*[@id='content']/div[2]/p[11]")
    private WebElement returnPolicy;

    public boolean isShippingPaymentPageTitleVisible () {
        return shippingPaymentPageTitle.isDisplayed();
    }
    public boolean isReturnPolicyVisible () {
        return returnPolicy.isDisplayed();
    }


}
