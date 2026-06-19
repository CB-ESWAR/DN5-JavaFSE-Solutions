public class EmployeeTest {

    public static void main(String[] args) {

        EmployeeManager manager = new EmployeeManager(10);

        manager.addEmployee(
                new Employee(101, "Eswar", "Developer", 50000));

        manager.addEmployee(
                new Employee(102, "Ravi", "Tester", 40000));

        manager.addEmployee(
                new Employee(103, "Sai", "Manager", 70000));

        System.out.println("All Employees");

        manager.displayEmployees();

        System.out.println("\nSearch Employee");

        System.out.println(manager.searchEmployee(102));

        manager.deleteEmployee(102);

        System.out.println("\nAfter Deletion");

        manager.displayEmployees();
    }
}