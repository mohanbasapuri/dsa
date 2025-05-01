package snippets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondHighestSalary {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1,"Mohan", 10000d));
        list.add(new Employee(1,"Mohan", 10000d));
        list.add(new Employee(2,"Rohan",2000d));
        list.add(new Employee(3,"Sohan", 4000d));
        list.add(new Employee(3,"Sohan", 4001d));

        Collections.sort(list);
        System.out.println(list.stream().map(Employee::getSalary).distinct().skip(1).findFirst());

    }

}

class Employee implements Comparable<Employee> {
    private Integer id;
    private String name;
    private Double salary;

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    public Integer getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(o.salary, this.salary);
    }
}
