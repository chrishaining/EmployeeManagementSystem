import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import staff.techStaff.DatabaseAdmin;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Sentient Laertes", "FB812681B", 5000);
    }

    @Test
    public void hasName() {
        assertEquals("Sentient Laertes", databaseAdmin.getName());
    }

    @Test
    public void hasNationalInsuranceNumber() {
        assertEquals("FB812681B", databaseAdmin.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(5000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(12.50);
        assertEquals(5012.50, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        databaseAdmin.payBonus();
        assertEquals(50, databaseAdmin.payBonus(), 0.01);
    }

    @Test
    public void canChangeName() {
        databaseAdmin.changeName("Betty");
        assertEquals("Betty", databaseAdmin.getName());
    }

    @Test
    public void doesNotAllowUserToChangeNameToNull() {
        databaseAdmin.changeName(null);
        assertEquals("Sentient Laertes", databaseAdmin.getName());
    }
}
