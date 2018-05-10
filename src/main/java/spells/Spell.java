package spells;

public abstract class Spell {

    protected int damageRating;

    public Spell(int damageRating) {
        this.damageRating = damageRating;
    }

    public int getDamageRating() {
        return damageRating;
    }
}
