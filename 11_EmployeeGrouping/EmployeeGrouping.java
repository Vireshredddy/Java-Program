import java.util.*;
import java.util.stream.Collectors;

public class EmployeeGrouping {
    record Employee(int id,String name,String department,double salary) {}
    public static void main(String[] args) {
        List<Employee> e=Arrays.asList(new Employee(1,"A","IT",50000),new Employee(2,"B","IT",70000),new Employee(3,"C","HR",60000));
        Map<String,Double> avg=e.stream().collect(Collectors.groupingBy(Employee::department,Collectors.averagingDouble(Employee::salary)));
        System.out.println(avg);
        System.out.println(avg.entrySet().stream().max(Map.Entry.comparingByValue()).orElse(null));
    }
}