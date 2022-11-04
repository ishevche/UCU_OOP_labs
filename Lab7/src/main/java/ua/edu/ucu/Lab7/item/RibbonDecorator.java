package ua.edu.ucu.Lab7.item;

public class RibbonDecorator extends ItemDecorator {
    private final Item item;

    public RibbonDecorator(Item item) {
        this.item = item;
        description = "Ribbon decoration for " + item.description;
    }

    @Override
    public double price() {
        return 40 + item.price();
    }
}
