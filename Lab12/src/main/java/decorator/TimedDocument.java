package decorator;

public class TimedDocument implements Document {
    public static final int NANO_IN_SECOND = 1000000;
    private final Document document;

    public TimedDocument(Document document) {
        this.document = document;
    }

    @Override
    public String parse() {
        long startTime = System.nanoTime();
        String data = document.parse();
        long timeElapsed = System.nanoTime() - startTime;
        System.out.println("Parsed the document. It took "
                + timeElapsed / NANO_IN_SECOND
                + " seconds");
        return data;
    }

    @Override
    public String getId() {
        return document.getId();
    }
}
