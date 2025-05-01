package snippets;

import java.util.HashSet;

public class AnalyseSet {
    public static void main(String[] args) {
    HashSet<MyStudent> studentHashSet = new HashSet<>();
        MyStudent s =   new MyStudent(2,"Rahul");
    studentHashSet.add(new MyStudent(1,"Nitin"));
    studentHashSet.add(s);
    studentHashSet.add(new MyStudent(3,"Nitin"));

    System.out.println(studentHashSet);
    s.setId(3);
    System.out.println(studentHashSet);
    }
}

class MyStudent{
    int id;
    String name;

    public MyStudent(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public boolean equals(Object o) {
        if(o == null) return false;
        if(o instanceof MyStudent s){
            return this.id == s.id;
        }
        return false;
    }


    public String toString() {
        return "Student: " + this.name + "@" + Integer.toHexString(hashCode());
    }

}
