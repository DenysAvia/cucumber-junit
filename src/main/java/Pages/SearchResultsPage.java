package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends BasePage{
    public SearchResultsPage(WebDriver driver) {super(driver);}

    @FindBy(xpath = "//button[@class='wishlist']")
    private WebElement addToWishListButton;
    @FindBy(xpath = "//*[@id='content']/div[2]/div")
    private WebElement firstProduct;

    public void clickWishListButtonOnFirstProduct() {
        addToWishListButton.click();
    }
    public void clickOnFirstProduct () {
        firstProduct.click();
    }


}
