import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import staff.management.Director;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Axminster Hubploy", "FX812681C", 100, "Department of Subterranean Affairs", 130000);
    }

    @Test
    public void hasName() {
        assertEquals("Axminster Hubploy", director.getName());
    }

    @Test
    public void hasNationalInsuranceNumber() {
        assertEquals("FX812681C", director.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(100, director.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName() {
        assertEquals("Department of Subterranean Affairs", director.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(0.75);
        assertEquals(100.75, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        director.payBonus();
        assertEquals(1, director.payBonus(), 0.01);
    }

    @Test
    public void hasBudget() {
        assertEquals(130000, director.getBudget(), 0.01);
    }
}



