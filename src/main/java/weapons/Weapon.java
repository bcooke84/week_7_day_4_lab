package weapons;

public abstract class Weapon {

    protected int damageRating;

    public Weapon(int damageRating) {
        this.damageRating = damageRating;
    }

    public int getDamageRating() {
        return damageRating;
    }
}
