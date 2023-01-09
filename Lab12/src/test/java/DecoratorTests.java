import decorator.CachedDocument;
import decorator.Document;
import decorator.SmartDocument;
import decorator.TimedDocument;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DecoratorTests {
    @Test
    public void instanceTest() {
        SmartDocument smart = new SmartDocument("some path");
        TimedDocument timed = new TimedDocument(smart);
        CachedDocument cached = new CachedDocument(timed);
        Assertions.assertInstanceOf(Document.class, smart);
        Assertions.assertInstanceOf(Document.class, timed);
        Assertions.assertInstanceOf(Document.class, cached);
    }
}
