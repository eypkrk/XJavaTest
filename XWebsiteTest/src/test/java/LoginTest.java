import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest{

    @Test
    public void loginTest(){
        loginPage.loginNotCorrect();
        String text = driver.findElement(By.cssSelector(variables.errMsgLogin)).getText();
        Assertions.assertEquals(text,"Maalesef, hesabını bulamadık.","Have a error!!!");
    }

    @Test
    public void loginTest1(){
        loginPage.login();
    }
}
