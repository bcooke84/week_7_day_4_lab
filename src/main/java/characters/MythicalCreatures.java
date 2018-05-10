package characters;

import behaviours.TakeDamage;

public abstract class MythicalCreatures implements TakeDamage {

    private int healthRating;

    public MythicalCreatures(int healthRating) {
        this.healthRating = healthRating;
    }

    public int getHealthRating() {
        return healthRating;
    }

    public void takeDamage(int damage){
        this.healthRating -= damage;
    }


}
