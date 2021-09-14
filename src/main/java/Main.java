import org.w3c.dom.Node;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.addFirst(4);
        linkedList.addFirst(5);
        linkedList.addFirst(2);
        linkedList.addLast(15);

        linkedList.removeLast();

//        linkedList.print();
//        linkedList.loop(2);

        System.out.println(linkedList.getKthNodeFromEnd(1));
        System.out.println(linkedList.getKthNodeFromEnd(2));
        System.out.println(linkedList.getKthNodeFromEnd(3));
        System.out.println(linkedList.getKthNodeFromEnd(-1));

        System.out.println(Arrays.toString(linkedList.toArray()));



    }
}
