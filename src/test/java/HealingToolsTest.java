import healingTools.HealingTool;
import healingTools.Herb;
import healingTools.Potion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealingToolsTest {

    Potion potion;
    Herb herb;

    @Before
    public void setUp() throws Exception {
        potion = new Potion();
        herb = new Herb();
    }

    @Test
    public void getHealinghRating() {
        assertEquals(6, herb.getHealingRating());
        assertEquals(9, potion.getHealingRating());
    }
}
