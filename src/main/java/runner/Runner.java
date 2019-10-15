package runner;

import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

import staff.management.Manager;
import staff.management.Director;
import staff.techStaff.Developer;
import staff.techStaff.DatabaseAdmin;

public class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //questions for all employees
        System.out.println("What is the employee's role? Manager, Director, Developer, DatabaseAdmin?");
        String employeeType = scanner.next();

        if (!employeeType.equals("Manager") && !employeeType.equals("Director") && !employeeType.equals("Developer") && !employeeType.equals("DatabaseAdmin")) {
            System.out.println("Sorry, I don't recognise that job. Please rerun the program.");
        }

        else {
            System.out.println("What is the employee's name?");
            String employeeName = scanner.next();
            System.out.println("What is the employee's NI number?");
            String niNumber = scanner.next();
            System.out.println("What is the employee's salary?");
            String salaryInput = scanner.next();
            double salary = parseDouble(salaryInput);

            //to set up a Director
            if (employeeType.equals("Director")) {

                System.out.println("What is the employee's department?");
                String department = scanner.next();

                System.out.println("What is the employee's budget?");
                String budgetInput = scanner.next();
                double budget = parseDouble(budgetInput);

                Director director = new Director(employeeName, niNumber, salary, department, budget);
                System.out.println(String.format("Congratulations! You have added %s to the system. Their NI number is: %s. Their salary is £%s. They work in the %s department. They have a budget of £%s.", director.getName(), director.getNationalInsuranceNumber(), director.getSalary(), director.getDeptName(), director.getBudget()));
            }

            //set up to add a manager
            else if (employeeType.equals("Manager")) {

                System.out.println("What is the employee's department?");
                String department = scanner.next();

                Manager manager = new Manager(employeeName, niNumber, salary, department);
                System.out.println(String.format("Congratulations! You have added %s to the system. Their NI number is: %s. Their salary is £%s. They work in the %s department.", manager.getName(), manager.getNationalInsuranceNumber(), manager.getSalary(), manager.getDeptName()));
            }

            //to add a developer
            else if (employeeType.equals("Developer")) {

                Developer developer = new Developer(employeeName, niNumber, salary);
                System.out.println(String.format("Congratulations! You have added %s to the system. Their NI number is: %s. Their salary is £%s.", developer.getName(), developer.getNationalInsuranceNumber(), developer.getSalary()));
            }

            //to add a databaseAdmin
            else if (employeeType.equals("DatabaseAdmin")) {

                DatabaseAdmin databaseAdmin = new DatabaseAdmin(employeeName, niNumber, salary);
                System.out.println(String.format("Congratulations! You have added %s to the system. Their NI number is: %s. Their salary is £%s.", databaseAdmin.getName(), databaseAdmin.getNationalInsuranceNumber(), databaseAdmin.getSalary()));
            }

        }
    }
}

