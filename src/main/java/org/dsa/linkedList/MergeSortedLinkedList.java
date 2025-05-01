package org.dsa.linkedList;

public class MergeSortedLinkedList {
    public static void main(String[] args) {
        ListNode list1 = new ListNode();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(4);

        ListNode list2 = new ListNode();
        list2.addLast(1);
        list2.addLast(3);
        list2.addLast(4);
        list2.addLast(9);


        list1 = mergeSortedList(list1,list2);
        list1.display();
    }

    private static ListNode mergeSortedList(ListNode list1, ListNode list2) {

        ListNode.Node head1 = list1.head;
        ListNode.Node head2 = list2.head;
        ListNode.Node recursive = mergeRecursive(head1, head2);

        ListNode node = new ListNode();
        node.head = recursive;
       return node;

    }

    private static ListNode.Node  mergeRecursive(ListNode.Node head1, ListNode.Node head2) {
        if(head1 == null || head2 == null){
            return head1 == null ? head2 : head1;
        }
        if(head1.val <= head2.val){
            head1.next = mergeRecursive(head1.next, head2);
            return head1;
        }else{
            head2.next = mergeRecursive(head1,head2.next);
            return head2;
        }

    }

}

class ListNode {
    Node head;

    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    void addLast(int ele){
        Node newNode = new Node(ele);
        if(head == null) {
            head = newNode;
            return;
        }

        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public void display(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.val + "->");
            curr = curr.next;
        }
        System.out.println("Null");
    }
}

