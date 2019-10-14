package staff.management;

public class Director extends Manager {

    private double budget;
//    private double salary;
    public Director(String name, String nationalInsuranceNumber, double salary, String deptName, double budget)
    {
        super(name, nationalInsuranceNumber, salary, deptName);
        this.budget = budget;
//        this.salary = salary;
    }

    public double getBudget() {
        return this.budget;
    }

    public double payBonus() {
//        return (this.salary * 0.02);
        return this.getSalary() * 0.02;
    }

}
