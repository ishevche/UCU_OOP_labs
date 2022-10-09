package lotr;

public class Hobbit extends Character {

    public Hobbit() {
        hp = 3;
        power = 0;
    }

    public void kick(Character c) {
        System.out.println("Cry");
    }

    @Override
    public String toString() {
        return "lotr.Hobbit{" +
                "hp=" + hp +
                ", power=" + power +
                '}';
    }
}