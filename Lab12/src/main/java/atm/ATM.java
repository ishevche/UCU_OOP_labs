package atm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ATM {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int amount = SCANNER.nextInt();
        if (amount <= 0) {
            throw new IllegalArgumentException();
        }

        List<Integer> values = new ArrayList<>();
        for (int i = 0; i < amount; ++i) {
            values.add(SCANNER.nextInt());
        }

        Handler handle = null;
        for (int i = 0; i < amount; ++i) {
            Handler prevHandle = new CoinHandler(values.get(i));
            prevHandle.setNext(handle);
            handle = prevHandle;
        }

        int price = SCANNER.nextInt();

        handle.process(price);
    }
}
