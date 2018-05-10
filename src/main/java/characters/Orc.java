package characters;

import characters.Enemy;
import weapons.Axe;
import weapons.Weapon;

public class Orc extends Enemy {

    public Orc() {
        super(60, new Axe());
    }
}
