import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[7];
        
        employees[0] = new Manager("Jan Kowalski", 3000.0, 0);
        employees[1] = new Worker("Anna Nowak", 3200.0, "Developer");
        employees[2] = new Employee("Paweł Górski", 2800.0);
        employees[3] = new Worker("Ewa Malinowska", 3400.0, "Designer");
        employees[4] = new Worker("Marcin Iksiński", 3100.0, "Tester");
        employees[5] = new Manager("Robert Lewandowski", 5000.0, 0);
        employees[6] = new Worker("Zofia Kowalczyk", 3300.0, "Marketing Specialist");

        //wyswietlanie wartosci employe przed podwyzkami
        for (Employee employee : employees) {
         System.out.println(employee.toString());
         
        }

        System.out.println("Po Podwyżce:--------------------------------");
        

        //podwyzka dla pracownikow
        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() + 500.0);
        }

        //ustawienie noej wartosci dla managerow 
        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                ((Manager) employee).setNumberOfSubordinates(5); 
                employee.setSalary(7500.0);
            }
        }

        //wyswietlanie wartosci employe
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}