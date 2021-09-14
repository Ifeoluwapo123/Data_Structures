import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class LinkedList {
    private Node first;
    private Node last;
    private int size;

    private List list = new ArrayList();

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void addFirst(int value){
        var node = new Node(value);

        if(isEmpty()) {
            first = last = node;
        }
        else{
            node.next = first;
            first = node;
        }

        size++;
    }

    public void addLast(int value){
        var node = new Node(value);

        if(isEmpty()) {
            first = last = node;
        }
        else{
            last.next = node;
            last = node;
        }

        size++;
    }

    public int indexOf(int item){
        int counter = 0;

        var current = first;

        while(current != null){
            if(current.value == item) return counter;
            current = current.next;
            counter++;
        }

        return -1;
    }

    public void removeFirst(){
        if(isEmpty()) throw new NoSuchElementException();

        if(first == last)first = last = null;
        else{
            var second = first.next;
            first.next = null;
            first = second;
        }

        size--;
    }

    public void removeLast(){
        if(isEmpty()) throw new NoSuchElementException();

        if(first == last) first = last = null;
        else {
            var current = first;

            while(current != null){
                if(current.next == last){
                    last = current;
                    last.next = null;
                }
                current = current.next;
            }

        }

        size--;
    }


    public boolean contains(int item){
         return indexOf(item) != -1;
    }

    public int size(){
        return size;
    }

    private boolean isEmpty(){
        return first == null;
    }

    public int[] toArray(){
        var current = first;
        int[] array = new int[size];
        int counter = 0;

        while(current != null){
            array[counter++] = current.value;
            current = current.next;
        }

        return array;
    }

    public void print(){

        var current = first;
        while(current != null){
            System.out.println(current.value);
            current = current.next;
        }
    }

    public void loop(int recurrence){

        var current = first;
        var counter = 0;
        while(current != null){
            System.out.println(current.value);

            if(current.next == null) {
                current = first;
                System.out.println("============================");
                counter++;
            }
            else current = current.next;

            if(counter == recurrence){
                break;
            }
        }
    }

    public void reverse(){
        if(isEmpty()) return;
       // [3=>4=>5]
        var previous = first;
        var current = first.next;

        while(current != null){
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        last = first;
        last.next = null;
        first = previous;
    }

    /**
     * find the kth node from the end of the linked list in one pass.
     * */
    public int getKthNodeFromEnd(int k){
         // [10 -> 20 -> 30 -> 40 -> 50]
        //  k = 1(50) dist = 0;
        //  k = 2(40) dist = 1

        if(isEmpty()) throw new IllegalStateException();

        int distance = k - 1;
        var pointerOne = first;
        var pointerSecond = first;

        for(int i = 0; i < distance; i++){
            if(pointerSecond.next != null)
                pointerSecond = pointerSecond.next;
            else
                throw new IllegalArgumentException();
        }

        while(pointerSecond.next != null){
            pointerOne = pointerOne.next;
            pointerSecond = pointerSecond.next;
        }

        return pointerOne.value;
    }
}
