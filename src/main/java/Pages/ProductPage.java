package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {super(driver);}


    @FindBy(xpath = "//button[@class='compare']")
    private WebElement compareButton;
    @FindBy(xpath = "//button[@class='wishlist']")
    private WebElement addToWishListButton;
    @FindBy(xpath = "//h1[@class='product__title']")
    private WebElement productName;
    @FindBy(xpath = "//*[@id='content']/section[1]/div[2]/ul/li[1]")
    private WebElement infoButton;
    @FindBy(xpath = "//*[@id='content']/section[1]/div[2]/ul/li[2]")
    private WebElement productCharacteristicsButton;
    @FindBy(xpath = "//*[@id='content']/section[1]/div[2]/ul/li[2]")
    private WebElement feedbackButton;
    @FindBy(xpath = "//*[@id='product']/div/div[1]/button")
    private WebElement buyButton;
    @FindBy(xpath ="//*[@id='checkoutModal']/div/div[2]/div")
    private WebElement cartProductArea;
    public boolean isCompareButtonVisible () {
        return compareButton.isDisplayed();
    }
    public boolean isWishListButtonVisible () {
        return addToWishListButton.isDisplayed();
    }
    public boolean isProductNameVisible () {
        return productName.isDisplayed();
    }
    public boolean isInfoButtonVisible () {return infoButton.isDisplayed();}
    public boolean isProductCharacteristicsButtonVisible () {return productCharacteristicsButton.isDisplayed();}
    public boolean isFeedbackButtonVisible () {return feedbackButton.isDisplayed();}

    public boolean isBuyButtonVisible () {return buyButton.isDisplayed();}
    public void clickBuyButton() {buyButton.click();}
    public int getAmountOfProductsInCart() {
        List<WebElement> amountInCart = driver.findElements(By.xpath("//*[@id='checkoutModal']/div/div[2]/div"));
        return amountInCart.size();
    }



}
