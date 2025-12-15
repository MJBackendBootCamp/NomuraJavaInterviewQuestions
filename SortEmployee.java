import java.util.*;

public class SortEmployee {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(25, "Ravi"));
        employees.add(new Employee(25, "Amit"));
        employees.add(new Employee(30, "John"));
        employees.add(new Employee(22, "Karan"));

        employees.sort(
            Comparator.comparing(Employee::getAge)
                      .thenComparing(Employee::getName)
        );

        employees.forEach(System.out::println);
    }
}
