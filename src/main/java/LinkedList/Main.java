package LinkedList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {

        LinkedList linkedList = new LinkedList();

        linkedList.addFirst(4);
        linkedList.addFirst(5);
        linkedList.addFirst(2);
        linkedList.addLast(15);
        linkedList.addLast(20);
        linkedList.addLast(60);

        //        linkedList.removeLast();
        //        linkedList.print();
        //        linkedList.loop(2);

        //        System.out.println(linkedList.getKthNodeFromEnd(1));
        //        System.out.println(linkedList.getKthNodeFromEnd(2));
        //        System.out.println(linkedList.getKthNodeFromEnd(3));
        //        System.out.println(linkedList.getKthNodeFromEnd(-1));

        System.out.println(Arrays.toString(linkedList.toArray()));
        linkedList.printMiddle();
        linkedList.printMiddle2();

        System.out.println(linkedList.hasLoop());
        /* Start with the empty list */
        DoublyLinkedList dll = new DoublyLinkedList();

        // Insert 6 at the beginning.
        // So linked list becomes 6->NULL
        dll.push(6);

        // Insert  at the beginning.
        // So linked list becomes 7->6->NULL
        dll.push(7);

        // Insert 1 at the beginning. So
        // linked list becomes 1->7->6->NULL
        dll.push(1);

        // Insert 9 at the beginning.
        // So linked list becomes 9->1->7->6->NULL
        dll.push(9);

        // Insert 5, before 7.So linked
        // list becomes 9->1->5->7->6->NULL
        dll.InsertBefore(dll.head.next.next, 5);

        System.out.println("Created DLL is: ");
        dll.printlist(dll.head);
    }
}
