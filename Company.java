import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        
        employees[0] = new Manager("Jan Kowalski", 3000.0, 0);
        employees[1] = new Worker("Anna Nowak", 3200.0, "Developer");
        employees[2] = new Employee("Paweł Górski", 2800.0);
        employees[3] = new Worker("Ewa Malinowska", 3400.0, "Designer");
        employees[4] = new Worker("Marcin Iksiński", 3100.0, "Tester");
        
        
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}