package codewithfreddy;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class queue {

    public static void main(String[] args) {


        // Queue = FIFO data structure. First-In First-Out (ex. A line of people)
        // A collection designed for holding elements prior to processing
        // Linear data structure

        // add = enqueue, offer()
        // Remove = dequeue, poll()

        Queue<String> queue = new LinkedList<String>();

    //    System.out.println(queue.isEmpty());

        queue.offer("Kelly");
        queue.offer("Fred");
        queue.offer("Steve");
        queue.offer("John");

  //      System.out.println(queue.size());
//        System.out.println(queue.peek());
//        queue.poll();
        System.out.println(queue.contains("Fred"));
        System.out.println(queue);

        // Where are queues useful
        // 1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
        // 2. Printer Queue (Print jobs should be completed in order)
        // 3. Used in LinkedLists, PriorityQueues, Breadth-first search

    }
}
