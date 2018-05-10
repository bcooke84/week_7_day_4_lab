package characters;

import behaviours.InflictDamage;
import deflectors.Deflector;
import weapons.Weapon;

public abstract class Fighter extends Player implements InflictDamage {

    private Weapon weapon;
    private Deflector deflector;

    public Fighter(String name, Weapon weapon, Deflector deflector) {
        super(name);
        this.weapon = weapon;
        this.deflector = deflector;

    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getDamageRatingOfWeapon(){
        return this.weapon.getDamageRating();
    }

    public int getDeflectableRating(){
        return this.deflector.getDeflectorRating();
    }

    public int inflictDamage() {
        return this.getDamageRatingOfWeapon();
    }
}
