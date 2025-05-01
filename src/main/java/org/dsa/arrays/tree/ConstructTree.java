package org.dsa.arrays.tree;

public class ConstructTree {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int index = -1;
        public static Node construct(int nodes[]){

            index++;
            if(nodes[index] == -1) return null;

            Node newNode = new Node(nodes[index]);
            newNode.left = construct(nodes);
            newNode.right = construct(nodes);
            return newNode;
        }
    }


    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = BinaryTree.construct(nodes);
        System.out.println(root.data);
    }
}
