package lotr;

import java.util.Random;

public class Knight extends Character {
    protected Knight(int min) {
        Random rand = new Random();
        hp = rand.nextInt(10) + min;
        power = rand.nextInt(10) + min;
    }

    public Knight() {
        this(2);
    }

    public void kick(Character c) {
        c.setHp(c.getHp() - power);
    }

    @Override
    public String toString() {
        return "lotr.Knight{" + "hp=" + hp + ", power=" + power + '}';
    }
}