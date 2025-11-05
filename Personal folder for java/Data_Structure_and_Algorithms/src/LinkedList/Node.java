package LinkedList;

public class Node {
    Node next;
    Node previous;
    int data;
     Node (int data){
        this.data = data;
        this.next = null;
        this.previous = null;
    }
    public String toString(){
         return next.toString();
    }
}