**Linked Lists**
Linked Lists

A linked list is a sequence of data elements, which are connected together via links. Each data element contains
a connection to another data element in form of a pointer.
@@ -9,19 +9,22 @@ The first node is called the head, and the last node is called the tail.
Time Complexity of various operations on linked lists

Searching

1) To find out a value within a given list by traversing from head all the way to the tail.
   The worst case scenario is 0(n)
2) Look up the list by index
   The worst case scenario is 0(n)

Insertion

3) Insertion at the end of the node is 0(1)
4) Insertion at the beginning of the node is 0(1)
5) Insertion in the middle of the list is 0(n + 1) = 0(1)

Deletion

4) Deleting an item from the beginning is 0(1)
5) Deleting an item from the end is 0(n)
6) Deleting an item at the middle is 0(n)