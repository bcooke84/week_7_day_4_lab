package spells;

import behaviours.SuperDamage;

public class LightningStrike extends Spell implements SuperDamage{

    public LightningStrike() {
        super(7);
    }

    public int doubleDamage(){
        return damageRating * 2;
    }


}
