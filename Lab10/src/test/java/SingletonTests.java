import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import singleton.DBConnection;

public class SingletonTests {
    @Test
    public void DBConnectionTest() {
        DBConnection first = DBConnection.getInstance();
        DBConnection second = DBConnection.getInstance();
        Assertions.assertSame(first, second);
    }
}
