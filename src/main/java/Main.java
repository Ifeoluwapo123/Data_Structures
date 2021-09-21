public class Main {
    public static void main(String[] args)
    {
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
