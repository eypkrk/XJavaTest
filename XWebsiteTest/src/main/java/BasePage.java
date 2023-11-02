import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;
    Actions actions;
    String baseUrl = "https://twitter.com/MilliTakimlar?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor";

    public BasePage(WebDriver driver){
        this.driver = driver;
        driver.get(baseUrl);
    }

    public WebElement find(String xpath){
        return driver.findElement(By.xpath(xpath));
    }
    public WebElement findCss(String css){
        return driver.findElement(By.cssSelector(css));
    }
    public void clickCss(String css){
        findCss(css).click();
    }
    public void click(String xpath){
        find(xpath).click();
    }
    public void sKeysCss(String css,String text){
        findCss(css).sendKeys(text);
    }
    public void sKeys(String xpath,String text){
        find(xpath).sendKeys(text);
    }
    public void waitForSeeCss(String css){
        wait = new WebDriverWait(driver,Duration.ofSeconds(10L));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(css)));
    }
    public void waitForsee(String xpath){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10L));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }
    public void switchToOtherPage(){
        List<String> pages = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(pages.get(1));
        System.out.println("Geçiş yapılan sayfa link: "+driver.getCurrentUrl());
        driver.close();
        driver.switchTo().window(pages.get(0));
    }
    public void scrollPage(int number){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,"+number+")");
    }

    public void findElements(String xpath){
        List<WebElement> tweets = driver.findElements(By.xpath(xpath));
        for (WebElement tweet:tweets){
            String tw = tweet.getText();
            System.out.println(tw);
        }
    }
    public void selectElements(String css,String text){
        Select secim = new Select(driver.findElement(By.cssSelector(css)));
        secim.selectByVisibleText(text);
    }

    public void enableBtn(String css){
        wait = new WebDriverWait(driver,Duration.ofSeconds(10l));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(css)));
    }

    public void actionsThing(WebElement element){
       actions = new Actions(driver);
       actions.moveToElement(element).perform();
    }

}
