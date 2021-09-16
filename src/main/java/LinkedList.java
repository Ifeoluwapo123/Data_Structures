import java.util.NoSuchElementException;

public class LinkedList {
    private Node first;
    private Node last;
    private int size;

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
//                    last = current;
//                    last.next = null;
                    current.next = null;
                    last = current;
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

    public void printMiddle(){
        if(isEmpty()) throw new NoSuchElementException();

        var current = first;
        var middle = first;
        int index = 0;

        while(current != null){
            index++;

            if(index % 2 == 0 && current != last){
                middle = middle.next;
            }

            if(current == last) {
                if (index % 2 == 0)
                    System.out.println("[" + middle.value + ", " + middle.next.value + "]");
                else
                    System.out.println("["+middle.value+"]");
            }

            current = current.next;

        }

    }

    public void printMiddle2(){
        var a = first;
        var b = first;

        if(b != null && b.next != null){
            b = b.next.next;
            a = a.next;
        }

        if(b == last)
            System.out.println("["+a.value+"]");
        else
            System.out.println("[" + a.value + ", " + a.next.value + "]");
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
        var track = first;
        var counter = 1;
        while(current != null){
            System.out.println(current.value);

            if(current.next == null) {
                current.next = track;
            }

            current = current.next;

            //terminating
            if(current.next == track) counter++;

            if(counter == recurrence){
                current.next = null;
                last = current;
                System.out.println(last.value);
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
