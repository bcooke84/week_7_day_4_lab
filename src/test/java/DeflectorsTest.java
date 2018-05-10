import deflectors.Armour;
import deflectors.LadderOfPower;
import deflectors.Shield;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeflectorsTest {

    Armour armour;
    LadderOfPower ladderOfPower;
    Shield shield;

    @Before
    public void setUp() throws Exception {
        armour = new Armour();
        ladderOfPower = new LadderOfPower();
        shield = new Shield();
    }

    @Test
    public void canGetDeflecionRating() {
        assertEquals(50, armour.getDeflectorRating());
        assertEquals(80, ladderOfPower.getDeflectorRating());
        assertEquals(70, shield.getDeflectorRating());
    }

}
