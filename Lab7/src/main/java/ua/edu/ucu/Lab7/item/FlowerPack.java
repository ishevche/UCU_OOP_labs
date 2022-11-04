package ua.edu.ucu.Lab7.item;

import ua.edu.ucu.Lab7.item.Flower.Flower;

public class FlowerPack {
    private final Flower flower;
    private final int quantity;

    public FlowerPack(Flower flower, int quantity) {
        this.flower = flower;
        this.quantity = quantity;
    }

    public double getPrice() {
        return this.flower.getPrice() * quantity;
    }

    public boolean equals(Object o) {
        if (o == null) { return false; }
        if (!(o instanceof FlowerPack)) { return false; }
        return quantity == ((FlowerPack) o).quantity
                && flower.equals(((FlowerPack) o).flower);
    }

    protected boolean search(Flower flower) {
        return this.flower.equals(flower);
    }
}
