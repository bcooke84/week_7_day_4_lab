package weapons;

import behaviours.SuperDamage;

public class Club extends Weapon implements SuperDamage{

    public Club() {
        super(6);
    }

    @Override
    public int doubleDamage() {
        return damageRating * 2;
    }
}
