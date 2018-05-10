import org.junit.Before;
import org.junit.Test;
import treasure.Gem;
import treasure.Gold;

import static org.junit.Assert.assertEquals;

public class TreasureTest {

    Gem gem;
    Gold gold;

    @Before
    public void setUp() throws Exception {
        gem = new Gem();
        gold = new Gold();
    }

    @Test
    public void hasValue() {
        assertEquals(10, gem.getValue());
        assertEquals(5, gold.getValue());
    }
}
