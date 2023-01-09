import adapter.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class AdapterTests {

    private final FacebookClient fbClient;
    private final TwitterClient twClient;

    public AdapterTests() {
        fbClient = new FacebookClient(new FacebookUser("fb email",
                Country.Ukraine, LocalDate.parse("2022-01-01")));
        twClient = new TwitterClient(new TwitterUser("tw email",
                "tw country", "2022-01-01"));
    }

    @Test
    public void instanceTest() {
        Assertions.assertInstanceOf(Client.class, fbClient);
        Assertions.assertInstanceOf(Client.class, twClient);
    }

    @Test
    public void fbClientTest() {
        Assertions.assertEquals(fbClient.getCountry(), "Ukraine");
        Assertions.assertEquals(fbClient.getEmail(), "fb email");
        Assertions.assertEquals(fbClient.getLastActiveTime(), LocalDate.parse("2022-01-01"));
    }

    @Test
    public void tmClientTest() {
        Assertions.assertEquals(twClient.getCountry(), "tw country");
        Assertions.assertEquals(twClient.getEmail(), "tw email");
        Assertions.assertEquals(twClient.getLastActiveTime(), LocalDate.parse("2022-01-01"));
    }

    @Test
    public void loginTest() {
        Login login = new Login();
        Assertions.assertInstanceOf(FacebookClient.class, login.login("facebook"));
        Assertions.assertInstanceOf(TwitterClient.class, login.login("twitter"));
    }
}
