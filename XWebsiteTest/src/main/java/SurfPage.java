import org.openqa.selenium.WebDriver;

public class SurfPage extends BasePage{

    Variables variables = new Variables(driver);
    public SurfPage(WebDriver driver) {
        super(driver);
    }

    public void mainPage(){
        waitForsee(variables.pPhoto);
        click(variables.pPhoto);
        waitForsee(variables.closePp);
        click(variables.closePp);
        click(variables.followBtn);
        waitForsee(variables.followCls);
        click(variables.followCls);
        waitForsee(variables.otherPageLink);
        click(variables.otherPageLink);
        switchToOtherPage();
        scrollPage(2200);
        waitForsee(variables.tweets);
        findElements(variables.tweets);
        //waitForsee(variables.videoInTweet);videoya tıklamıyor
        //click(variables.videoInTweet);
    }
}
