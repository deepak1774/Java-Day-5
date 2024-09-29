import java.util.Scanner;

class Employee {
    String name;
    int id;
    double basicSalary;
    double allowances;

    // Default constructor
    Employee() {
    }

    // Parameterized constructor
    Employee(String name, int id, double basicSalary, double allowances) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
        this.allowances = allowances;
    }

    // Method to calculate the gross salary
    double calculateGrossSalary() {
        return basicSalary + allowances;
    }

    // Method to display the employee's details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("Allowances: $" + allowances);
        System.out.println("Gross Salary: $" + calculateGrossSalary());
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the number of employees
        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine(); 
        Employee[] employees = new Employee[numEmployees];
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("ID: ");
            int id = scanner.nextInt();
            System.out.print("Basic Salary: ");
            double basicSalary = scanner.nextDouble();
            System.out.print("Allowances: ");
            double allowances = scanner.nextDouble();
            scanner.nextLine(); 
            employees[i] = new Employee(name, id, basicSalary, allowances);
        }
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("\nDetails of employee " + (i + 1) + ":");
            employees[i].displayDetails();
        }
        scanner.close();
    }
}
