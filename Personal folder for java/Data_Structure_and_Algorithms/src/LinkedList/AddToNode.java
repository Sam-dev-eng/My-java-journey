package LinkedList;

public class AddToNode {
    static void main() {
        Node head = new Node(10);
        Node tail = new Node(20);
        Node one = new Node(30);
        head.next = one;
        head.previous = tail;
        one.next = tail;
        one.previous = head;
        tail.next = head;
        tail.previous = one;
        head.previous = one;
        for (int count = 0; count < 3; count++) {
            System.out.print(head.data + " ");
            head = head.next;
            System.out.print(tail.data + " ");
             tail = tail.previous;
        }
    }


}
