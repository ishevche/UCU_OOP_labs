package atm;

public class CoinHandler extends Handler {

    private final int value;

    public CoinHandler(int value) {
        this.value = value;
    }

    @Override
    public void process(int price) {
        Handler next = getNext();
        if (price % value > 0 && next == null) {
            throw new IllegalArgumentException();
        } else if (next != null) {
            next.process(price % value);
        }
        System.out.println(price / value + " * " + value);
    }
}
