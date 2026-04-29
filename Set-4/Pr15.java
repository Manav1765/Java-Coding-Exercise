class Employee15 {
    String name;
    String department;

    Employee15(String name, String department) {
        this.name       = name;
        this.department = department;
    }

    void displayDetails() {
        System.out.println("=== Employee ===");
        System.out.println("Name       : " + name);
        System.out.println("Department : " + department);
    }
}

class Manager extends Employee15 {
    int    teamSize;
    String projectName;

    Manager(String name, String department, int teamSize, String projectName) {
        super(name, department);
        this.teamSize    = teamSize;
        this.projectName = projectName;
    }

    @Override
    void displayDetails() {
        System.out.println("=== Manager ===");
        System.out.println("Name        : " + name);
        System.out.println("Department  : " + department);
        System.out.println("Team Size   : " + teamSize);
        System.out.println("Project     : " + projectName);
    }
}

public class Pr15 {
    public static void main(String[] args) {
        Employee15 emp = new Employee15("Ravi Kumar", "Development");
        emp.displayDetails();

        System.out.println();

        Employee15 mgr = new Manager("Priya Shah", "Development", 8, "ERP System");
        mgr.displayDetails();
    }
}