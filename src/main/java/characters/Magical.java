package characters;

import behaviours.InflictDamage;
import spells.Spell;

public abstract class Magical extends Player implements InflictDamage {

    private Spell spell;
    private MythicalCreature mythicalCreature;

    public Magical(String name, Spell spell, MythicalCreature mythicalCreature) {
        super(name);
        this.spell = spell;
        this.mythicalCreature = mythicalCreature;
    }

    public int inflictDamage(){
        return this.spell.getDamageRating();
    }


}
