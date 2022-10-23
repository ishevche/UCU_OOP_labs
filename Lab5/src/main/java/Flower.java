import lombok.Getter;
import lombok.Setter;



@Setter
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;

    public String getColor() {
        return color.toString();
    }

    public boolean equals(Object o) {
        if (o == null) { return false; }
        if (!(o.getClass().getName().equals(this.getClass().getName()))) {
            return false;
        }
        return sepalLength == ((Flower) o).sepalLength
                && color == ((Flower) o).color
                && price == ((Flower) o).price;
    }
}
