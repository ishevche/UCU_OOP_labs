package decorator;

public class CachedDocument implements Document {
    private final Document document;

    public CachedDocument(Document document) {
        this.document = document;
    }

    @Override
    public String parse() {
        DBConnection db = DBConnection.getInstance();
        String id = getId();
        if (db.hasDocument(id)) {
            System.out.println("Restored from cache:\n");
            return db.getDocument(id);
        } else {
            String data = document.parse();
            db.putDocument(id, data);
            return data;
        }
    }

    @Override
    public String getId() {
        return document.getId();
    }
}
