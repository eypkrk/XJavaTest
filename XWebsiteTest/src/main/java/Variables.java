import org.openqa.selenium.WebDriver;

public class Variables extends BasePage{
    String pPhoto = "//div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n r-1ifxtd0 r-ymttw5 r-ttdzmv']/div[1]/div[1]";
    String closePp = "//div[@aria-label='Kapat']";
    String followBtn = "//div[@data-testid='2327308063-follow']";
    String followCls ="//div[@data-testid='app-bar-close']";
    String otherPageLink = "//a[@data-testid='UserUrl']";
    String tweets = "//div[@data-testid='tweetText']";
    String newAccountBtn = "div[class='css-1dbjc4n r-1ifxtd0 r-19u6a5r r-1b7u577 r-1wzrnnt'] a[href='/i/flow/signup']";
    String userName = "//div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n r-mk0yit r-1f1sjgu'][1]/label";
    String phoneNum ="//div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n r-mk0yit r-1f1sjgu'][2]/label";
    String bornMonth = "select[id='SELECTOR_1']";
    String bornDay = "select[id='SELECTOR_2']";
    String bornYear = "select[id='SELECTOR_3']";
    String errorMsg = " div[class='css-1dbjc4n r-18u37iz r-1pn2ns4'] span";
    String nextSaveAccount = "div[data-testid='ocfSignupNextLink']";
    String loginBtn = "a[data-testid = 'login']";
    String mailOrPhone = "input[name='text']";
    String nextLogin = "//div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n r-ywje51 r-nllxps r-jxj0sb r-16wqof r-1dye5f7']/div[6]";
    String errMsgLogin = "div[data-testid='toast']";
    String phoneOrMail = "input[data-testid='ocfEnterTextTextInput']";
    String nextForLogin = "div[data-testid='ocfEnterTextNextButton']";
    String otherAccount = "//div[1][@data-testid='UserCell']/div/div[2]/div/div/div/div/a";
    String video = "//div[@data-testid='cellInnerDiv'][1]//div[@data-testid='videoComponent'][1]";
    String videoTweet = "//div[1]/div[1]/div[1]/article[@data-testid='tweet'][1]";
    String videoVoice = "//div[@data-testid='cellInnerDiv'][1]//div[2]/div[@data-testid='videoComponent'][1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[2]/div[@class='css-1dbjc4n r-13awgt0'][1]/div[1]/div[1]/div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep r-13qz1uu'][1]/div[2]/div[3]/div[@aria-label='Sesi aç']";
    String ppForDown = "//div[1]/div[1]/div[1]/div[1]/div[@data-testid='UserAvatar-Container-TFF_Org'][1]";
    public Variables(WebDriver driver) {
        super(driver);
    }
}
