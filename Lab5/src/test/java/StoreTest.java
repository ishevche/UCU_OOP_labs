import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import org.junit.jupiter.api.Assertions;

public class StoreTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private static final int MAX_QUANTITY = 10;

    @Test
    public void testSearch() {
        Flower flower1 = new Flower();
        Flower flower2 = new Flower();
        Flower test_flower1 = new Flower();
        Flower test_flower2 = new Flower();
        Flower test_flower3 = new Tulip();
        int price1 = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int price2 = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity1 = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        int quantity2 = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        flower1.setPrice(price1);
        flower1.setColor(FlowerColor.BLUE);
        flower2.setPrice(price2);
        flower2.setColor(FlowerColor.RED);
        test_flower1.setPrice(price1);
        test_flower1.setColor(FlowerColor.BLUE);
        test_flower2.setPrice(price2);
        test_flower2.setColor(FlowerColor.RED);
        test_flower3.setPrice(price2);
        test_flower3.setColor(FlowerColor.RED);
        FlowerPack pack1 = new FlowerPack(flower1, quantity1);
        FlowerPack pack2 = new FlowerPack(flower2, quantity2);
        FlowerBucket bucket = new FlowerBucket();
        FlowerPack test_pack1 = new FlowerPack(flower1, quantity1);
        FlowerPack test_pack2 = new FlowerPack(flower2, quantity2);
        FlowerBucket test_bucket1 = new FlowerBucket();
        FlowerPack test_pack3 = new FlowerPack(test_flower3, quantity2);
        FlowerBucket test_bucket2 = new FlowerBucket();
        Store store = new Store();
        bucket.add(pack1);
        bucket.add(pack2);
        test_bucket1.add(test_pack1);
        test_bucket1.add(test_pack2);
        test_bucket2.add(test_pack1);
        test_bucket2.add(test_pack3);
        store.add(bucket);
        Assertions.assertSame(store.search(test_bucket1), bucket);
        Assertions.assertNotSame(store.search(test_bucket2), bucket);
    }
}
