import org.junit.Before;
import org.junit.Test;
import weapons.Axe;
import weapons.Club;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class WeaponsTest {
    
    Axe axe;
    Club club;
    Sword sword;

    @Before
    public void setUp() throws Exception {
        axe = new Axe();
        club = new Club();
        sword = new Sword();
        
    }

    @Test
    public void getDamageRating() {
        assertEquals(9, axe.getDamageRating());
        assertEquals(6, club.getDamageRating());
        assertEquals(10, sword.getDamageRating());
    }

    @Test
    public void getClubDoubleDamage() {
        assertEquals(12, club.doubleDamage());
    }
}
