import characters.Knight;
import org.junit.Before;
import org.junit.Test;
import weapons.Sword;
import weapons.Weapon;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Weapon weapon;

    @Before
    public void setUp() throws Exception {
        weapon = new Sword();
        knight = new Knight("Gladys", weapon);
    }

    @Test
    public void canGetName() {
        assertEquals("Gladys", knight.getName());
    }

    @Test
    public void canGetWeaponDamageRating() {
        assertEquals(10, knight.getDamageRatingOfWeapon());
    }

    @Test
    public void canGetDeflectableRating() {
        assertEquals(50, knight.getDeflectableRating());
    }

    @Test
    public void canInflictDamage() {
        knight.takeDamage(knight.inflictDamage());
        assertEquals(90, knight.getHealth());
    }
}
