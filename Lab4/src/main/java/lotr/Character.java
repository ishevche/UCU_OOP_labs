package lotr;

abstract public class Character {
    protected int power;
    protected int hp;

    abstract public void kick(Character c);

    public boolean isAlive() {
        return hp > 0;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = Math.max(0, hp);
    }

    public int getPower() {
        return power;
    }
}
