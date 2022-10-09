package lotr;

import java.util.Random;

abstract class GameManager {
    void fight(Character c1, Character c2) {
        if (new Random().nextInt(2) == 1) {
            Character temp = c1;
            c1 = c2;
            c2 = temp;
            System.out.println("Second starts!");
        } else {
            System.out.println("First starts!");
        }
        while (c1.isAlive() && c2.isAlive()) {
            c1.kick(c2);
            System.out.print(c1.toString() + " makes its turn.");
            Character temp = c1;
            c1 = c2;
            c2 = temp;
        }
        if (!c1.isAlive()) {
            System.out.println(c1.toString() + " is dead. Game over!");
        } else {
            System.out.println(c2.toString() + " is dead. Game over!");
        }
    }
}