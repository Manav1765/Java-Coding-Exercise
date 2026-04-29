import java.util.Scanner;

class Employee {
    private String employeeName;
    private double employeeSalary;

    public void readEmployeeData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        employeeName   = sc.nextLine();
        System.out.print("Enter employee salary: ");
        employeeSalary = sc.nextDouble();
    }

    public void displayEmployeeData() {
        System.out.println("Employee Name  : " + employeeName);
        System.out.printf("Employee Salary: %.2f%n", employeeSalary);
    }
}

public class Pr07 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.readEmployeeData();
        System.out.println("\n--- Employee Details ---");
        emp.displayEmployeeData();
    }
}