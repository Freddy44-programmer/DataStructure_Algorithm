package codewithfreddy;

import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<String>();

        //LinkedList = stores Nodes in 2 parts (data + address)
        //Nodes are in non-consecutive memory locations
        // Elements are linked using pointers

        // Singly Linked List

        // Node                Node                  Node
        // [data | address] -> [data | address] ->  [data | address]


        // Doubly Linked List

        //           Node                             Node
        // [Address | data | address] <->  [ address | data | address]


        // Advantages
        // 1. Dynamic Data Structure (allocates needed memory while running)
        // 2. Insertion and Deletion of Nodes is easy. O(1)
        // 3. No/Low memory waste

        // disadvantages
        // 1. Greater memory usage (additional pointer)
        // 2. No random access of elements ( no index[i])
        // Accessing/Searching elements is more Time consuming. O(n)

        //Uses
        // 1. implement Stacks/Queues
        // GPS navigation
        // music playlist

//        linkedList.push("A");
//        linkedList.push("B");
//        linkedList.push("C");
//        linkedList.push("D");
//        linkedList.push("F");
//        linkedList.pop();


        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
//        linkedList.poll();

        // add element between d and f
        linkedList.add(4, "E");
        linkedList.remove("E");

        System.out.println(linkedList.indexOf("D"));

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());

        linkedList.addFirst("2");
        linkedList.addLast("4");

        System.out.println(linkedList);



    }
}
