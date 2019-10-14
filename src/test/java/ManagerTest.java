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
        assertEquals("JE812681B", manager.getNationaInsuranceNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(35000, manager.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName() {
        assertEquals("Homeland Security", manager.getDeptName());
    }
}



