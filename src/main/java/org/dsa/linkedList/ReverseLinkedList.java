package org.dsa.linkedList;

import org.dsa.linkedList.implementation.LinkedListImpl;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedListImpl list = new LinkedListImpl();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.display();

        LinkedListImpl reversedList = reverse(list);
        reversedList.display();
    }

    private static LinkedListImpl reverse(LinkedListImpl list) {
        LinkedListImpl.Node curr = list.head;
        LinkedListImpl.Node prev = list.head;
        while (curr !=null){
            LinkedListImpl.Node newNode = curr.next;
            curr.next = prev;

            prev = curr;
            curr = newNode;
        }
        assert list.head != null;
        list.head.next = null;
        list.head = prev;
        return list;

    }
}
