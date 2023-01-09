package singleton;

import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        User user = new User(SCANNER.nextLine(),
                SCANNER.nextLine(), SCANNER.nextInt());
        user.save();
    }
}
