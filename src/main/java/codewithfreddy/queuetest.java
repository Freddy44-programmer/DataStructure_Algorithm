package codewithfreddy;

public class queuetest {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        // Perform enqueue operations
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        // Try to enqueue when the queue is full
        // Print the queue
        queue.enqueue(6);
        queue.printQueue();

        // Perform dequeue operations
        // Print the queue after dequeue
        queue.dequeue();
        queue.dequeue();
        queue.printQueue();

        // Enqueue more elements
        // Print the queue
        queue.enqueue(20);
        queue.enqueue(75);
        queue.printQueue();
    }

}

class Queue {
    private int[] arr;
    private int front, back, capacity, size;

    public Queue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        back = -1;
        size = 0;
    }


    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + item);
            return;
        }
        back = (back + 1) % capacity;
        arr[back] = item;
        size++;
        System.out.println("Enqueued: " + item);
    }


    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int item = arr[front];
        front = (front + 1) % capacity;
        size--;
        System.out.println("Dequeued: " + item);
        return item;
    }


    public boolean isEmpty() {
        return size == 0;
    }


    public boolean isFull() {
        return size == capacity;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.print(arr[index] + " ");
        }
        System.out.println();
    }
    }

