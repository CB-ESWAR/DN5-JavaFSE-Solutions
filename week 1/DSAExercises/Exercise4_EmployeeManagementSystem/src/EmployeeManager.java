public class EmployeeManager {

    Employee arr[];
    int size;

    EmployeeManager(int capacity) {
        arr = new Employee[capacity];
        size = 0;
    }

    public void addEmployee(Employee e) {
        arr[size] = e;
        size++;
    }

    public Employee searchEmployee(int id) {

        for(int i = 0; i < size; i++) {

            if(arr[i].employeeId == id) {
                return arr[i];
            }
        }

        return null;
    }

    public void deleteEmployee(int id) {

        for(int i = 0; i < size; i++) {

            if(arr[i].employeeId == id) {

                for(int j = i; j < size - 1; j++) {
                    arr[j] = arr[j + 1];
                }

                size--;
                break;
            }
        }
    }

    public void displayEmployees() {

        for(int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}