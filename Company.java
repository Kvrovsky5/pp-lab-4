public class Company {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Jan Kowalski", 4000);
        employees[1] = new Employee("Anna Nowicka", 5000);
        employees[2] = new Employee("Tomasz Zielinski", 6000);
        employees[3] = new Employee("Kasia Malinowska", 7000);
        employees[4] = new Employee("Michał Wiśniewski", 8000);

        System.out.println("Dane pracownika o indeksie 3:");
        System.out.println(employees[3]);

        employees[3].setSalary(9000);

        System.out.println("\nDane wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}