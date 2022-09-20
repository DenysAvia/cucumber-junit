package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WishListPage extends BasePage {
    private static final String WISH_LIST = "https://zooleader.com.ua/wishlist";
    public WishListPage(WebDriver driver) {super(driver);}

    @FindBy(xpath = "//*[@id='saved-lists-app']/main/div/div[1]/header/div[2]")
    private WebElement wishListProductsCount;

    @FindBy(xpath ="//*[@id='saved-lists-app']/main/div/div[1]/section/ol")
    private WebElement wishListProductArea;

    public static void openWishList() {driver.get(WISH_LIST);}

    public int getAmountOfProductsInWishList() {
        List<WebElement> searchResults = driver.findElements(By.xpath("//*[@id='content']/div[2]"));

        return searchResults.size();
    }



}
