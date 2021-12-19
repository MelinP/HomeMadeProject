import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class UserSettingsClass extends MainClass {
    public static final String USER_SETTINGS_URL = "https://one.linkfacts.link/user/settings";

    By firstName = By.name("mat-input-2");
    By lastName = By.name("mat-input-3");
    By submitButtonLocator = By.id("updateAccount");
    By deletePhotoButton = By.xpath("//span[@class = 'mat-button-wrapper']");

    public UserSettingsClass(WebDriver driver) {
        super(driver);
    }

    public UserSettingsClass openSettingsPage() {
        this.openPage(USER_SETTINGS_URL);
        return this;
    }

    public UserSettingsClass clickDeletePhoto() {
        this.waitForElementPresentAndClick(deletePhotoButton);
        return this;
    }

    public UserSettingsClass sendName(String value) {
        this.waitForElementAndSendKeys(firstName, value);
        return this;
    }

    public UserSettingsClass sendLName(String value) {
        this.waitForElementAndSendKeys(lastName, value);
        return this;
    }

    public UserSettingsClass clickSubmit() {
        this.waitForElementPresentAndClick(submitButtonLocator);
        return this;
    }

    public UserSettingsClass clearFids(){
        this.addClearMethod(firstName);
        this.addClearMethod(lastName);
        return this;
    }

    public void shortMethod(String nameValue, String lNameValue){
        this.sendName(nameValue);
        this.sendLName(lNameValue);
        this.clickDeletePhoto();
        this.clickSubmit();
    }


}