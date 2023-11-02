import org.junit.jupiter.api.Test;

public class WatchVideoReadTweetTest extends BaseTest{

    @Test
    public void watchVideoReadTweet()throws Exception{
        watchVideoReadTweet.watchAndRead();
        Thread.sleep(5000);
    }
}
