package org.designpatterns.prototype;

public class ProtoTypeMain {
    public static void main(String[] args) {
    DocumentTemplate documentTemplate = new DocumentTemplate("Mohan's Resume", "I am java developer");
    documentTemplate.displayDocument();

    System.out.println("After cloning...");
    DocumentTemplate documentTemplate1 = documentTemplate.clone();
    documentTemplate1.setTitle("Rohan's Resume");
    documentTemplate1.displayDocument();
    }
}
