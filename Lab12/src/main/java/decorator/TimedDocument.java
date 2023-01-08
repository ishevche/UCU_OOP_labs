package decorator;

public class TimedDocument implements Document{
    private final Document document;

    TimedDocument(Document document) {
        this.document = document;
    }

    @Override
    public String parse() {
        long startTime = System.nanoTime();
        String data = document.parse();
        long timeElapsed = System.nanoTime() - startTime;
        System.out.println("Parsed the document. It took " +
                timeElapsed / 1000000 +
                "seconds");
        return data;
    }
}
