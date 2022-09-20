package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public abstract class BasePage {

        protected static WebDriver driver;

        public BasePage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        public void waitForPageLoadComplete(long timeToWait) {
            new WebDriverWait(driver, Duration.ofSeconds(timeToWait)).until(
                    webDriver -> ((JavascriptExecutor) webDriver)
                            .executeScript("return document.readyState").equals("complete"));

        }

        public void waitVisibilityOfElement(long timeToWait, WebElement element) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeToWait));
            wait.until(ExpectedConditions.visibilityOf(element));
        }

        public void waitForAjaxToComplete(long timeToWait) {
            new WebDriverWait(driver, Duration.ofSeconds(timeToWait)).until(
                webDriver -> ((JavascriptExecutor) webDriver)
                        .executeScript("return window.jQuery !==0").equals("ajaxcomplete"));

    }
        public WebElement findElement(By by) {
            return driver.findElement(by);
       }
    public List<WebElement> findElements(By by) {
        return driver.findElements(by);
       }

       public boolean isElementDisplayed(By by) {
            return !findElements(by).isEmpty();
       }


}

