import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import staff.management.Manager;



public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Polka Dot", "JE812681B", 35000, "Homeland Security");
    }

    @Test
    public void hasName() {
        assertEquals("Polka Dot", manager.getName());
    }

    @Test
    public void hasNationalInsuranceNumber() {
        assertEquals("JE812681B", manager.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(35000, manager.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName() {
        assertEquals("Homeland Security", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(5000.50);
        assertEquals(40000.50, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        manager.payBonus();
        assertEquals(350, manager.payBonus(), 0.01);
    }

    @Test
    public void canChangeName() {
        manager.changeName("Betty");
        assertEquals("Betty", manager.getName());
    }

    @Test
    public void doesNotAllowUserToChangeNameToNull() {
        manager.changeName(null);
        assertEquals("Polka Dot", manager.getName());
    }
}



