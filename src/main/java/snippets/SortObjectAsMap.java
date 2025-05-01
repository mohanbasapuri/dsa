package snippets;

import java.util.*;
import java.util.stream.Collectors;

public class SortObjectAsMap {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(1, "John"));
        studentList.add(new Student(2, "Peter"));
        studentList.add(new Student(3, "Anubhav"));
        studentList.add(new Student(3, "Marav"));

        Map<Integer, String> map = studentList
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toMap(Student::getId, Student::getName, (oldVal, newVal) -> oldVal, LinkedHashMap::new));

        System.out.println(map);

        // map.entrySet().stream().map(data -> new Student(data.getKey(),data.getValue())).collect(Collectors.toList()).forEach(System.out::println);
    }
}

class Student{
    private Integer id;
    private String name;

    Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
