import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainClass {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public MainClass(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
    }

    public void openPage(String URL) {
        driver.get(URL);
    }

    public WebElement waitForElementPresent(By locator) {
        return this.wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public boolean waitForElementNotPresent(By locator) {
        return this.wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));

    }

    public WebElement waitForElementPresentAndClick(By locator) {
        WebElement element = this.waitForElementPresent(locator);
        element.click();
        return element;
    }

    public WebElement waitForElementPresentAndClear(By locator) {
        WebElement element = this.waitForElementPresentAndClick(locator);
        element.clear();
        return element;
    }

    public WebElement waitForElementAndSendKeys(By locator, String value) {
        WebElement element = waitForElementPresentAndClear(locator);
        element.sendKeys(value);
        return element;
    }


    }