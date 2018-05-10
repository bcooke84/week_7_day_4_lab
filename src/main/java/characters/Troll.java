package characters;

import characters.Enemy;
import weapons.Club;
import weapons.Weapon;

public class Troll extends Enemy {

    public Troll() {
        super(50, new Club());
    }
}
