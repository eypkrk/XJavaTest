import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class BaseTest {
    SurfPage surfPage;
    NewAccount newAccountOpen;
    WebDriver driver;
    LoginPage loginPage;
    WatchVideoReadTweet watchVideoReadTweet;
    Variables variables;

    @BeforeAll
    public static void seTup(){
        WebDriverManager.chromedriver();
    }
    @BeforeEach
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        surfPage = new SurfPage(driver);
        newAccountOpen = new NewAccount(driver);
        loginPage = new LoginPage(driver);
        watchVideoReadTweet = new WatchVideoReadTweet(driver);
        variables = new Variables(driver);
    }
    @AfterEach
    public void teardown(){
        driver.quit();
    }
}
