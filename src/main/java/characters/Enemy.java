package characters;

import behaviours.InflictDamage;
import behaviours.TakeDamage;
import weapons.Weapon;

public abstract class Enemy implements TakeDamage, InflictDamage {

    private int healthPoints;
    private Weapon weapon;

    public Enemy(int healthPoints, Weapon weapon) {
        this.healthPoints = healthPoints;
        this.weapon = weapon;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void takeDamage(int damage){
        this.healthPoints -= damage;
    }

    public int inflictDamage(){
        return this.weapon.getDamageRating();
    }
}
