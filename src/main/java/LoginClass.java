import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class LoginClass extends MainClass {
    public static final String LOGIN_URL = "https://one.linkfacts.link/user/logIn";

    By emailLocator = By.name("email");
    By passwordLocator = By.name("password");
    By submitButtonLocator = By.id("undefined");

    public LoginClass(WebDriver driver) {
        super(driver);
    }

    public LoginClass openLoginPage() {
        this.openPage(LOGIN_URL);
        return this;
    }
    public LoginClass CleaEmailAndPassword(){
        this.addClearMethod(emailLocator);
        this.addClearMethod(passwordLocator);
        return this;
    }

    public LoginClass sendEmail(String value) {
        this.waitForElementAndSendKeys(emailLocator, value);
        return this;
    }

    public LoginClass sendPassword(String value){
        this.waitForElementAndSendKeys(passwordLocator, value);
        return this;
    }

    public  LoginClass clickSubmit(){
        this.waitForElementPresentAndClick(submitButtonLocator);
        return this;
    }
    public void shortAuth(String emailValue, String passwordValue){
        this.sendEmail(emailValue);
        this.sendPassword(passwordValue);
        this.clickSubmit();
    }
}