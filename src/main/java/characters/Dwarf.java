package characters;

import deflectors.Deflector;
import deflectors.LadderOfPower;
import weapons.Weapon;

public class Dwarf extends Fighter {

    public Dwarf(String name, Weapon weapon) {
        super(name, weapon, new LadderOfPower());
    }

}
