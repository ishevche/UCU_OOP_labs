package lotr;

public class King extends Knight {

    public King() {
        super(5);
    }

    @Override
    public String toString() {
        return "lotr.King{" + "hp=" + hp + ", power=" + power + '}';
    }
}