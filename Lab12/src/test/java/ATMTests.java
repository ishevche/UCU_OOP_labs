import atm.CoinHandler;
import atm.Handler;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ATMTests {
    @Test
    public void instanceTest() {
        CoinHandler coinHandler = new CoinHandler(100);
        Assertions.assertInstanceOf(Handler.class, coinHandler);
    }

    @Test
    public void logicTest() {
        CoinHandler coinHandler3 = new CoinHandler(3);
        CoinHandler coinHandler2 = new CoinHandler(2);
        coinHandler2.setNext(coinHandler3);
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> coinHandler2.process(9));
        Assertions.assertDoesNotThrow(() -> coinHandler3.process(9));
        Assertions.assertDoesNotThrow(() -> coinHandler2.process(8));
    }
}
