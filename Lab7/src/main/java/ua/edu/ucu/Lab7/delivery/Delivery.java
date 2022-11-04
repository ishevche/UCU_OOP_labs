package ua.edu.ucu.Lab7.delivery;

import ua.edu.ucu.Lab7.item.Item;

import java.util.List;

public interface Delivery {
    void deliver(List<Item> items);
}
