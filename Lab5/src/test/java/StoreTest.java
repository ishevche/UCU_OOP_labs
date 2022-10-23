import org.junit.jupiter.api.Test;

import java.util.Random;

import org.junit.jupiter.api.Assertions;

public class StoreTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private static final int MAX_QUANTITY = 10;

    @Test
    public void testSearch() {
        Flower flowerOne = new Flower();
        Flower flowerTwo = new Flower();
        Flower testFlowerOne = new Flower();
        Flower testFlowerTwo = new Flower();
        Flower testFlowerThree = new Tulip();
        int priceOne = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int priceTwo = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantityOne = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        int quantityTwo = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        flowerOne.setPrice(priceOne);
        flowerOne.setColor(FlowerColor.BLUE);
        flowerTwo.setPrice(priceTwo);
        flowerTwo.setColor(FlowerColor.RED);
        testFlowerOne.setPrice(priceOne);
        testFlowerOne.setColor(FlowerColor.BLUE);
        testFlowerTwo.setPrice(priceTwo);
        testFlowerTwo.setColor(FlowerColor.RED);
        testFlowerThree.setPrice(priceTwo);
        testFlowerThree.setColor(FlowerColor.RED);
        FlowerPack packOne = new FlowerPack(flowerOne, quantityOne);
        FlowerPack packTwo = new FlowerPack(flowerTwo, quantityTwo);
        FlowerBucket bucket = new FlowerBucket();
        FlowerPack testPackOne = new FlowerPack(flowerOne, quantityOne);
        FlowerPack testPackTwo = new FlowerPack(flowerTwo, quantityTwo);
        FlowerBucket testBucketOne = new FlowerBucket();
        FlowerPack testPackThree = new FlowerPack(testFlowerThree, quantityTwo);
        FlowerBucket testBucketTwo = new FlowerBucket();
        Store store = new Store();
        bucket.add(packOne);
        bucket.add(packTwo);
        testBucketOne.add(testPackOne);
        testBucketOne.add(testPackTwo);
        testBucketTwo.add(testPackOne);
        testBucketTwo.add(testPackThree);
        store.add(bucket);
        Assertions.assertSame(store.search(testBucketOne), bucket);
        Assertions.assertNotSame(store.search(testBucketTwo), bucket);
    }
}
