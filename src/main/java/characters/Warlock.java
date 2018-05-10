package characters;

import spells.Fireball;
import spells.Spell;

public class Warlock extends Magical {

    public Warlock(String name) {
        super(name, new Fireball(), new Ogre());
    }
}
