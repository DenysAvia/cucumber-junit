package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FeedbackPage extends BasePage{
    public FeedbackPage(WebDriver driver) {super(driver);}




    @FindBy(xpath ="//h1[@class='page__heading-title']")
    private WebElement feedbackPageTitle;
    @FindBy(xpath ="//div[@class='rating rating--site']")
    private WebElement siteRatingIndicator;
    @FindBy(xpath ="//section[@class='reviews reviews--site']")
    private WebElement feedbackArea;

    public boolean isFeedbackPageTitleVisible () {
        return feedbackPageTitle.isDisplayed();
    }
    public boolean isSiteRatingIndicatorVisible () {
        return siteRatingIndicator.isDisplayed();
    }
    public boolean isFeedbackAreaVisible () {
        return feedbackArea.isDisplayed();
    }




}
