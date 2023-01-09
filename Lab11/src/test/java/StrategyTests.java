import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import strategy.*;

public class StrategyTests {

    private final Client client = new Client("Ivan", 19, Gender.MALE, "Ivan's mail");;

    @Test
    public void clientTest() {
        Client second = new Client("Olena", 21, Gender.FEMALE, "Olena's mail");
        Assertions.assertEquals(client.getName(), "Ivan");
        Assertions.assertEquals(client.getAge(), 19);
        Assertions.assertEquals(client.getSex(), Gender.MALE);
        Assertions.assertEquals(client.getEmail(), "Ivan's mail");

        Assertions.assertEquals(second.getName(), "Olena");
        Assertions.assertEquals(second.getAge(), 21);
        Assertions.assertEquals(second.getSex(), Gender.FEMALE);
        Assertions.assertEquals(second.getEmail(), "Olena's mail");
    }

    @Test
    public void giftTest() {
        GiftMail giftMail = new GiftMail();
        Assertions.assertInstanceOf(MailCode.class, giftMail);
        Assertions.assertEquals(giftMail.generate(client),
                "Ivan, you have received a gift. "
                + "Contact us for more information");
    }

    @Test
    public void MailInfo() {
        GiftMail giftMail = new GiftMail();
        MailInfo mInfo = new MailInfo(client, giftMail);
        Assertions.assertEquals(giftMail.generate(client), mInfo.generate());
        Assertions.assertEquals(mInfo.getClientEmail(), "Ivan's mail");
        Assertions.assertEquals(mInfo.getClientName(), "Ivan");
    }
}
