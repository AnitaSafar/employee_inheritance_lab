import management.Director;
import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setUp() {
        director = new Director("Jack Smith", "893485834TS", 36000.25,"Grocery", 2000.33);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(37000.75, director.raiseSalary(1000.50),0.1);
    }

    @Test
    public void canPayBonus() {
        assertEquals(360.00, director.payBonus(), 0.1);
    }
}
