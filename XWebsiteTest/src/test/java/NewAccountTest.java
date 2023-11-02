import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class NewAccountTest extends BaseTest{

    @Test
    public void newAccountErr()throws Exception{
        newAccountOpen.newAccountErr();
        newAccountOpen.waitForSeeCss(variables.errorMsg);
        String text = driver.findElement(By.cssSelector(variables.errorMsg)).getText();
        Assertions.assertEquals(text,"Lütfen geçerli bir telefon numarası gir.","Have a error!");
    }

    @Test
    public void newAccount(){
        newAccountOpen.newAccount();
    }
}
