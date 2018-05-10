import characters.Wizard;
import org.junit.Before;
import org.junit.Test;
import spells.Spell;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;

    @Before
    public void setUp() throws Exception {
        wizard = new Wizard("Shane");
    }

    @Test
    public void canTakeDamage() {
        wizard.takeDamage(wizard.inflictDamage());
        assertEquals(93, wizard.getHealth());

    }
}
