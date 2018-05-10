import characters.Dragon;
import characters.Knight;
import org.junit.Before;
import org.junit.Test;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class DragonTest {

    Dragon dragon;
    Knight knight;
    Sword sword;

    @Before
    public void setUp() throws Exception {
        dragon = new Dragon();
        sword = new Sword();
        knight = new Knight("Gary", sword);
    }

    @Test
    public void canTakeDamage() {
        dragon.takeDamage(knight.inflictDamage());
        assertEquals(90, dragon.getHealthRating());
    }
}
