package characters;

import deflectors.Armour;
import deflectors.Deflector;
import weapons.Weapon;

public class Knight extends Fighter {

    public Knight(String name, Weapon weapon) {
        super(name, weapon, new Armour());

    }


}
