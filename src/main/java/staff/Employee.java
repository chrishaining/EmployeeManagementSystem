package staff;

public abstract class Employee {

    private String name;
    private String nationalInsuranceNumber;
    private double salary;

    public Employee(String name, String nationalInsuranceNumber, double salary) {
        this.name = name;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public String getNationalInsuranceNumber(){
        return this.nationalInsuranceNumber;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary(double raiseAmount) {
        this.salary = this.salary + raiseAmount;
    }

    public double payBonus() {
        return (this.salary * 0.01);
    }

}
