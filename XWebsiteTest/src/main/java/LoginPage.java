import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    Variables variables = new Variables(driver);
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void loginNotCorrect(){
        waitForSeeCss(variables.loginBtn);
        clickCss(variables.loginBtn);
        waitForSeeCss(variables.mailOrPhone);
        sKeysCss(variables.mailOrPhone,"05055555555");
        click(variables.nextLogin);
        waitForSeeCss(variables.errMsgLogin);
    }

    public void login(){
        waitForSeeCss(variables.loginBtn);
        clickCss(variables.loginBtn);
        waitForSeeCss(variables.mailOrPhone);
        sKeysCss(variables.mailOrPhone, "deneme@hotmail.com");
        click(variables.nextLogin);
        waitForSeeCss(variables.phoneOrMail);
        sKeysCss(variables.phoneOrMail, "deneme@hotmail.com");
        enableBtn(variables.nextForLogin);
        clickCss(variables.nextForLogin);
    }
}
