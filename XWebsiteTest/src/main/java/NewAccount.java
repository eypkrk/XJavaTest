import org.openqa.selenium.WebDriver;

public class NewAccount extends BasePage{
    Variables variables = new Variables(driver);
    public NewAccount(WebDriver driver) {
        super(driver);
    }

    public void newAccountErr(){
        waitForSeeCss(variables.newAccountBtn);
        clickCss(variables.newAccountBtn);
        waitForsee(variables.userName);
        sKeys(variables.userName, "deneme");
        sKeys(variables.phoneNum,"12364588998");
        selectElements(variables.bornMonth,"Ocak");
        selectElements(variables.bornDay, "30");
        selectElements(variables.bornYear,"1995");
    }
    public void newAccount(){
        waitForSeeCss(variables.newAccountBtn);
        clickCss(variables.newAccountBtn);
        waitForsee(variables.userName);
        sKeys(variables.userName,"deneme");
        sKeys(variables.phoneNum,"05361234566");
        selectElements(variables.bornMonth,"Ocak");
        selectElements(variables.bornDay,"30");
        selectElements(variables.bornYear,"1995");
        enableBtn(variables.newAccountBtn);
        clickCss(variables.nextSaveAccount);
    }
}
