package org.dsa.linkedList.implementation;

public class LinkedListImpl {

    public Node head;
    public Node tail;

    public static class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }

    }
    public void addFirst(int value) {
        Node newNode = new Node(value);

        Node curr = head;
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = curr;
        head = newNode;
    }

    public void addLast(int value){
        Node newnode = new Node(value);
        if(head == null) {
            head = newnode;
            return;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newnode;
    }

    void insert(int index, int value){
        Node newNode = new Node(value);

        Node curr = head;
        int i = 0;
        Node prev = curr;
        while(i != index){
            prev = curr;
            curr = curr.next;
            i++;
        }
        prev.next = newNode;
        newNode.next = curr;
    }

    public void delete(int value) {

        Node curr = head;
        Node prev = curr;
        while(curr.value != value){
            prev = curr;
            curr = curr.next;
        }
        prev.next = curr.next;

    }

    public void reverse(){

        Node prev = head;
        Node curr = head.next;
        while(curr != null){
            Node nextNode = curr.next;
            curr.next = prev;

            prev = curr;
            curr = nextNode;
        }

        head.next = null;
        head = prev;


    }

    public void display(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.value + "->");
            curr = curr.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        LinkedListImpl linkedList = new LinkedListImpl();

        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.display();

        linkedList.addLast(0);
        linkedList.display();

        linkedList.addFirst(4);
        linkedList.display();

        linkedList.insert(2,9);
        linkedList.display();

        linkedList.delete(9);
        linkedList.display();

        linkedList.reverse();
        linkedList.display();
    }


}
