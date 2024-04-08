package hw34;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        // task #1
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("name3", "position1", "email1", "phone1", 12500, 35),
                new Employee("name2", "position1", "email1", "phone1", 12500, 36),
                new Employee("name1", "position1", "email1", "phone1", 12500, 25)
                ));

        Comparator<Employee> nameComparator = (e1, e2) -> e1.getName().compareTo(e2.getName());
        Collections.sort(employees, nameComparator);
        System.out.println("by name");
//        System.out.println(employees);
        employees.forEach(System.out::println);

        Comparator<Employee> ageComparator = (e1, e2) -> Integer.compare(e1.getAge(), e2.getAge());
        Collections.sort(employees, ageComparator);
        System.out.println("by age");
        employees.forEach(System.out::println);
    }
}
