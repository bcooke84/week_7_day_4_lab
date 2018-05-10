package characters;

import deflectors.Deflector;
import deflectors.Shield;
import weapons.Weapon;

public class Barbarian extends Fighter {

    public Barbarian(String name, Weapon weapon) {
        super(name, weapon, new Shield());
    }
}
