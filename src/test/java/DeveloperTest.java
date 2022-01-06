import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer dev;

    @Before
    public void setUp(){
        dev = new Developer("Linus Torvolds", "", 65000.50);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(66001.00, dev.raiseSalary(1000.50),0.1);
    }

    @Test
    public void canPayBonus() {
        assertEquals(650.00, dev.payBonus(), 0.1);
    }
}
