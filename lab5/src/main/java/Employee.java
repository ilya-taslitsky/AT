import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private int salary;
    private String mail;


    public Employee() {

    }

    public Employee(String name, int salary, String mail) {
        this.name = name;
        this.salary = salary;
        this.mail = mail;
    }

    public static class EmployeeComparatorBySalary implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getSalary() - o2.getSalary();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public static void printList(List<Employee> employeeList) {
        for (Employee employee : employeeList) {
            System.out.println("Name: " + employee.getName() + ";  Salary: " + employee.salary + ";  email: " + employee.getMail());
        }
        ;
        System.out.println("\n\n");
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("David", 10000, "david@gmail.com"));
        employees.add(new Employee("Sam", 200, "sam@gmail.com"));
        employees.add(new Employee("Lad", 50000, "Lad@gmail.com"));
        employees.add(new Employee("Arnold", 500, "arnold@gmail.com"));

        List<Employee> sortedList = employees.stream().sorted(Comparator.comparingInt(Employee::getSalary)).collect(Collectors.toList());

        printList(sortedList);

        List<Employee> filteredList = employees.stream().filter(employee -> employee.getSalary() > 1000).collect(Collectors.toList());

        printList(filteredList);

        List<String> stringList = employees.stream().map(Employee::getName).collect(Collectors.toList());

        for(String s : stringList)
        {
            System.out.println("Name:" + s);
        }
    }
}

