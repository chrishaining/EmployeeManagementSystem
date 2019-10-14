package staff;

public abstract class Employee {

    private String name;
    private String nationaInsuranceNumber;
    private double salary;

    public Employee(String name, String nationaInsuranceNumber, int salary) {
        this.name = name;
        this.nationaInsuranceNumber = nationaInsuranceNumber;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public String getNationaInsuranceNumber(){
        return this.nationaInsuranceNumber;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary(Double raiseAmount) {
        this.salary = this.salary + raiseAmount;
    }

    public double payBonus() {
        return (this.salary * 0.01);
    }

}

