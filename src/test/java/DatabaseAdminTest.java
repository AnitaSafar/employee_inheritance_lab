import management.Manager;
import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseadmin;

    @Before
    public void setUp() {
        databaseadmin = new DatabaseAdmin("Jack Smith", "893485834TS", 36000.25);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(37000.75, databaseadmin.raiseSalary(1000.50),0.1);
    }

    @Test
    public void canPayBonus() {
        assertEquals(360.00, databaseadmin.payBonus(), 0.1);
    }
}
