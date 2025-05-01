package org.dsa.linkedList;

import java.util.HashMap;
import java.util.Map;

public class LCU_implementation {

    // {1,2,3,4,5}
    // put(1) -> "mohan@gmail.com"
    // put(2) -> "rohan@gmail.com"
    // put(3) -> "nayan@gmail.com"
    // put(4) -> "manan@gmail.com"
    // put(5) -> "kisan@gmail.com"

    //regular use cases -> 5 is not used anytime
   // get(1) -> "mohan@gmail.com"
   // get(2) -> "rohan@gmail.com"
   // get(3) -> "nayan@gmail.com"
   // get(1) -> "mohan@gmail.com"
   // get(4) -> "manan@gmail.com"

    // now i want to put 1 more entry -> so you have to delete least used i.e. 5 from cache.
    public static void main(String[] args) {
        Map<Integer, DoublyLL> map = new HashMap<>();
        DoublyLL ll = new DoublyLL();
       // map.put(1, ll.add("mohan@gmail.com"));
        ll.add("rohan@gmail.com");
        ll.add("nayan@gmail.com");
        ll.add("manan@gmail.com");
        ll.add("kisan@gmail.com");

        ll.display();
    }
}

class DoublyLL{
    Node head;
    Node tail;

    DoublyLL(){}
    DoublyLL(Node head, Node tail){
        this.head = this.tail = null;
    }

    class Node{
        String val;
        Node next;
        Node prev;

        Node(String val){
            this.val = val;
        }

        Node(String val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }


    }

   public Node add(String val){
        Node newNode = new Node(val);
        if(head == null){
            head = tail =  newNode;
            return head;
        }else{
           newNode.prev = tail;
           tail.next = newNode;
           tail = newNode;
        }
        return head;
    }

    public void display(){
        if(head == null)
            return;

        Node curr = head;
        while (curr != null){
            System.out.print(curr.val + "<=>");
            curr = curr.next;
        }
        System.out.println("NULL");
    }
}

