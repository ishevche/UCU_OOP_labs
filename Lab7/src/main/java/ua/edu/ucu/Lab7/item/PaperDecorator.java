package ua.edu.ucu.Lab7.item;

public class PaperDecorator extends ItemDecorator{
    private final Item item;

    public PaperDecorator(Item item) {
        this.item = item;
        description = "Paper decoration for " + item.description;
    }

    @Override
    public double price() {
        return 13 + item.price();
    }
}
