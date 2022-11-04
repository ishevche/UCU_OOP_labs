package ua.edu.ucu.Lab7.item;

public class BasketDecorator extends ItemDecorator {
    private final Item item;

    public BasketDecorator(Item item) {
        this.item = item;
        description = "Basket decoration for " + item.description;
    }

    @Override
    public double price() {
        return 4 + item.price();
    }
}
