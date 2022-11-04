package ua.edu.ucu.Lab7.item;

import lombok.Getter;

abstract public class Item {
    @Getter
    protected String description;

    abstract public double price();
}
