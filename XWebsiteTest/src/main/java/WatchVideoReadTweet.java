import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WatchVideoReadTweet extends BasePage{
    Variables variables = new Variables(driver);
    public WatchVideoReadTweet(WebDriver driver) {
        super(driver);
    }
    public void watchAndRead(){
        waitForsee(variables.otherAccount);
        click(variables.otherAccount);
        System.out.println(driver.getCurrentUrl());
        waitForsee(variables.ppForDown);
        WebElement pp = find(variables.ppForDown);
        actionsThing(pp);
        waitForsee(variables.video);
        String tweet = find(variables.videoTweet).getText();
        System.out.println(tweet);
        WebElement element = find(variables.video);
        actionsThing(element);
        scrollPage(200);
        actionsThing(element);
        waitForsee(variables.videoVoice);
        click(variables.videoVoice);


    }
}
