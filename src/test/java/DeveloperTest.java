import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import staff.techStaff.Developer;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Karamba Cylon", "XE812681B", 50000);
    }

    @Test
    public void hasName() {
        assertEquals("Karamba Cylon", developer.getName());
    }

    @Test
    public void hasNationalInsuranceNumber() {
        assertEquals("XE812681B", developer.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(50000, developer.getSalary(), 0.01);
    }


    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(12.50);
        assertEquals(50012.50, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        developer.payBonus();
        assertEquals(500, developer.payBonus(), 0.01);
    }

    @Test
    public void canChangeName() {
        developer.changeName("Betty");
        assertEquals("Betty", developer.getName());
    }

    @Test
    public void doesNotAllowUserToChangeNameToNull() {
        developer.changeName(null);
        assertEquals("Karamba Cylon", developer.getName());
    }
}
