import characters.Fighter;
import org.junit.Before;

public class FighterTest {

    Fighter fighter;

    @Before
    public void setUp() throws Exception {
        fighter = new Fighter("Gary");
    }
}
