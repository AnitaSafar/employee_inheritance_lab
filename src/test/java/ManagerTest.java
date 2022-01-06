import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest{

    Manager manager;

    @Before
    public void setUp() {
        manager = new Manager("Jack Smith", "893485834TS", 36000.25,"Grocery");
    }

    @Test


    @Test
    public void canRaiseSalary(){
        assertEquals(37000.75, manager.raiseSalary(1000.50),0.1);
    }

    @Test
    public void canPayBonus() {
        assertEquals(360.00, manager.payBonus(), 0.1);
    }
}