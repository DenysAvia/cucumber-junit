package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPage extends BasePage{
    private static final String CONTACT_PAGE = "https://zooleader.com.ua/kontakty";
    public ContactsPage(WebDriver driver) {super(driver);}

    @FindBy(xpath ="//a[@class='icon icon--facebook'][1]")
    private WebElement facebookIcon;
    @FindBy(xpath ="//a[@class='icon icon--instagram'][1]")
    private WebElement instagramIcon;
    @FindBy(xpath ="//*[@id='content']/div[2]/div/ul/li[1]")
    private WebElement nameOfStore;
    @FindBy(xpath ="//*[@id='content']/div[2]/div/ul/li[2]")
    private WebElement addressName;
    @FindBy(xpath ="//*[@id='content']/div[2]/div/ul/li[3]")
    private WebElement phoneInfo;
    @FindBy(xpath ="//*[@id='content']/div[2]/div/ul/li[5]")
    private WebElement eMailInfo;
    @FindBy(xpath ="//*[@id='content']/div[2]/div/ul/li[6]")
    private WebElement workHours;


    public static void openContactPage() {driver.get(CONTACT_PAGE);}

    public boolean isFaceBookIconVisible () {
        return facebookIcon.isDisplayed();
    }
    public boolean isInstagramIconVisible () {
        return instagramIcon.isDisplayed();
    }
    public boolean isNameOfStoreVisible () {
        return nameOfStore.isDisplayed();
    }
    public boolean isAddressNameVisible () {
        return addressName.isDisplayed();
    }
    public boolean isPhoneInfoVisible () {
        return phoneInfo.isDisplayed();
    }
    public boolean isEmailInfoVisible () {
        return eMailInfo.isDisplayed();
    }
    public boolean isWorkHoursVisible () {
        return workHours.isDisplayed();
    }


}
