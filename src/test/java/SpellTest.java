import org.junit.Before;
import org.junit.Test;
import spells.Fireball;
import spells.LightningStrike;
import spells.Spell;

import static org.junit.Assert.assertEquals;

public class SpellTest {

    LightningStrike lightningStrike;
    Fireball fireball;

    @Before
    public void setUp() throws Exception {
        lightningStrike = new LightningStrike();
        fireball = new Fireball();
    }

    @Test
    public void getDamageRating() {
        assertEquals(7, lightningStrike.getDamageRating());
        assertEquals(3, fireball.getDamageRating());
    }

    @Test
    public void getLightningStrikedoubleDamage() {
        assertEquals(14, lightningStrike.doubleDamage());
    }
}
