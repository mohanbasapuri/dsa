package snippets;

class Parent {
    static void staticMethod() {
        System.out.println("Static method in Parent");
    }
}

class Child extends Parent {
    static void staticMethod() {
        System.out.println("Static method in Child");
    }
}

public class StaticMethodTest {
    public static void main(String[] args) {
        Parent.staticMethod(); //Static method in Parent
        Child.staticMethod(); // Static method in Child
        Parent parent = new Child();
        parent.staticMethod(); //Static method in Parent
    }
}