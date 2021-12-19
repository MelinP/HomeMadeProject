import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

    public WebDriver driver;

    @Before
    public void Run(){

        System.setProperty("web-driver.chrome.driver","./drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @Test
    public void sendEmailAndPasswordTest(){
        String email = "sojaki2262@idrct.com";
        String password = "A12345678";
        LoginClass LoginPage = new LoginClass(driver);

        LoginPage.openLoginPage().addClearMethod().shortAuth(email, password);
    }
}
