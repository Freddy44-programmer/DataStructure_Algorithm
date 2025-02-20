package codewithfreddy;


import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue {

    public static void main(String[] args) {

        // Priority Queue = A FIFO data structure that serves elements
        // with the highest priorities first
        // before elements with lower priority

        Queue<Double> queue = new PriorityQueue<Double>(Collections.reverseOrder());
        queue.offer(3.0);
        queue.offer(5.4);
        queue.offer(1.2);
        queue.offer(8.7);
        queue.offer(6.1);
        queue.offer(3.8);

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }

    }
}
