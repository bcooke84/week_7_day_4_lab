import characters.Knight;
import characters.Orc;
import org.junit.Before;
import org.junit.Test;
import weapons.Sword;
import weapons.Weapon;

import static org.junit.Assert.assertEquals;

public class EnemyTest {
    Knight knight;
    Orc orc;
    Sword sword;

    @Before
    public void setUp() throws Exception {
        orc = new Orc();
        sword = new Sword();
        knight = new Knight("Dave", sword);
    }

    @Test
    public void canTakeDamage() {
        orc.takeDamage(knight.inflictDamage());
        assertEquals(50, orc.getHealthPoints());
    }

    @Test
    public void canInflictDamage() {
        knight.takeDamage(orc.inflictDamage());
        assertEquals(91, knight.getHealth());
    }
}
