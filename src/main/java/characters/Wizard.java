package characters;

import spells.LightningStrike;
import spells.Spell;

public class Wizard extends Magical {

    public Wizard(String name) {
        super(name, new LightningStrike(), new Dragon());
    }
}
