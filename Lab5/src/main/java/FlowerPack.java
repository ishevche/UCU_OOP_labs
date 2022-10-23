public class FlowerPack {
    private final Flower flower;
    private final int quantity;

    FlowerPack(Flower flower, int quantity) {
        this.flower = flower;
        this.quantity = quantity;
    }

    double getPrice() {
        return this.flower.getPrice() * quantity;
    }

    public boolean equals(Object o) {
        if (o == null) { return false; }
        if (!(o instanceof FlowerPack)) { return false; }
        return quantity == ((FlowerPack) o).quantity
                && flower.equals(((FlowerPack) o).flower);
    }
}
