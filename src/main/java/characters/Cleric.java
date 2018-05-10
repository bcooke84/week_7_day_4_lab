package characters;

import healingTools.HealingTool;
import healingTools.Potion;

public class Cleric extends Healer {

    public Cleric(String name) {
        super(name, new Potion());
    }
}
