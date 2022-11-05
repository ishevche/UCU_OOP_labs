package ua.edu.ucu.lab.item.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;



@Setter @Getter @AllArgsConstructor
public class Flower {
    private double sepalLength;
    private FlowerColor color;
    private double price;

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
