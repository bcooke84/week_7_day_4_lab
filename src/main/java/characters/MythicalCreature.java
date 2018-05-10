package characters;

import behaviours.TakeDamage;

public abstract class MythicalCreature implements TakeDamage {

    private int healthRating;

    public MythicalCreature(int healthRating) {
        this.healthRating = healthRating;
    }

    public int getHealthRating() {
        return healthRating;
    }

    public void takeDamage(int damage){
        this.healthRating -= damage;
    }


}
